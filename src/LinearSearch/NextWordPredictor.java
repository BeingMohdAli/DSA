package LinearSearch;

import java.util.*;

public class NextWordPredictor {

    public static void main(String[] args) {

        // A tiny training corpus — stand-in for what a real model
        // would train on (just at a much, much bigger scale)
        String[] corpus = {
                "how are you doing today",
                "how are you feeling",
                "how are you",
                "are you okay today",
                "you are doing great",
                "how do you do",
                "i am doing fine",
                "how are things today"
        };

        // Step 1: build the vocabulary (word -> id)
        Map<String, Integer> wordToId = new LinkedHashMap<>();
        Map<Integer, String> idToWord = new HashMap<>();
        int nextId = 0;

        List<List<Integer>> tokenizedSentences = new ArrayList<>();

        for (String sentence : corpus) {
            String[] words = sentence.split(" ");
            List<Integer> ids = new ArrayList<>();
            for (String w : words) {
                if (!wordToId.containsKey(w)) {
                    wordToId.put(w, nextId);
                    idToWord.put(nextId, w);
                    nextId++;
                }
                ids.add(wordToId.get(w));
            }
            tokenizedSentences.add(ids);
        }

        System.out.println("=== Vocabulary (word -> id) ===");
        for (Map.Entry<String, Integer> e : wordToId.entrySet()) {
            System.out.println("  " + e.getKey() + " -> " + e.getValue());
        }

        // Step 2: build bigram counts: prevId -> (nextId -> count)
        // This is the "training" step — just counting which word
        // follows which, across the whole corpus
        Map<Integer, Map<Integer, Integer>> bigramCounts = new HashMap<>();
        for (List<Integer> ids : tokenizedSentences) {
            for (int i = 0; i < ids.size() - 1; i++) {
                int prev = ids.get(i);
                int next = ids.get(i + 1);
                bigramCounts.putIfAbsent(prev, new HashMap<>());
                Map<Integer, Integer> nextCounts = bigramCounts.get(prev);
                nextCounts.put(next, nextCounts.getOrDefault(next, 0) + 1);
            }
        }

        // Step 3: tokenize the input sentence, exactly like the chat example
        String input = "how are you";
        String[] inputWords = input.split(" ");
        List<Integer> inputIds = new ArrayList<>();
        for (String w : inputWords) inputIds.add(wordToId.get(w));

        System.out.println("\n=== Tokenizing input: \"" + input + "\" ===");
        System.out.println("  words: " + Arrays.toString(inputWords));
        System.out.println("  ids:   " + inputIds);

        // Step 4: predict a probability distribution over the next id
        int lastId = inputIds.get(inputIds.size() - 1);
        Map<Integer, Integer> nextCounts = bigramCounts.getOrDefault(lastId, Collections.emptyMap());
        int total = nextCounts.values().stream().mapToInt(Integer::intValue).sum();

        System.out.println("\n=== Predicting the word after \"" + idToWord.get(lastId) + "\" ===");
        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(nextCounts.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> e : sorted) {
            double prob = (double) e.getValue() / total;
            System.out.printf("  %-10s (id %2d)  prob = %.2f%n", idToWord.get(e.getKey()), e.getKey(), prob);
        }

        int predictedId = sorted.get(0).getKey();
        System.out.println("\nPredicted next word: \"" + idToWord.get(predictedId) + "\"");

        // Step 5: autoregressive generation — feed the prediction back in
        // and keep going, the same loop real language models use
        System.out.println("\n=== Generating a full sentence, one predicted word at a time ===");
        List<Integer> generated = new ArrayList<>();
        generated.add(wordToId.get("how"));
        int current = generated.get(0);
        for (int step = 0; step < 6; step++) {
            Map<Integer, Integer> options = bigramCounts.get(current);
            if (options == null || options.isEmpty()) break;
            int best = Collections.max(options.entrySet(), Map.Entry.comparingByValue()).getKey();
            generated.add(best);
            current = best;
        }
        StringBuilder sb = new StringBuilder();
        for (int id : generated) sb.append(idToWord.get(id)).append(" ");
        System.out.println("  ids:  " + generated);
        System.out.println("  text: " + sb.toString().trim());
    }
}