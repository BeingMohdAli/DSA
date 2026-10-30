package heaps;

import java.util.*;

public class LC621 {
    static void main() {
        char[] arr = {'A','A','A','B','B','B'};
        System.out.println(leastInterval(arr,2));
    }

    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c : tasks) freq[c-'A']++;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) if (f > 0) pq.add(f);
        int time = 0;

        while (!pq.isEmpty()){
            int slots = n+1;
            int used = 0;
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < slots && !pq.isEmpty(); i++) {
                used++;
                int polled = pq.poll() - 1;
                if(polled>0) l.add(polled);
            }
            pq.addAll(l);
            time = time + (pq.isEmpty()? used : slots);

        }
return  time;

    }
}
