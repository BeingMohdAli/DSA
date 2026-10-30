package heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LC767 {
    static void main() {
        System.out.println(reorganizeString("aaab"));
    }
    public static String reorganizeString(String s) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (var i :s.toCharArray())
            mp.put((int)i,mp.getOrDefault((int)i,0)+1);
        for (var e : mp.entrySet())
            pq.add(new int[]{e.getKey(),e.getValue()});
        StringBuilder ans = new StringBuilder();
        int[] prev = null;

        while (!pq.isEmpty()){
           int[] poll = pq.poll();
           ans = ans.append((char)poll[0]);
            poll[1]--;
            if (prev != null && prev[1] > 0) pq.add(prev);
            prev = poll;
       }
        return ans.length() == s.length() ? ans.toString() : "";
    }
}
