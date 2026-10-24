package heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LC506 {
    static void main() {
        int[] arr = {10,3,8,9,4};
        System.out.println(findRelativeRanks(arr));;
    }
    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        for (int i = 0; i < score.length; i++) {
            pq.add(new int[]{score[i], i});
        }
        String[] str = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int[] poll = pq.poll();
            if(i==0){
                str[poll[1]] = "Gold Medal";
            } else if (i == 1) {
                str[poll[1]] = "Silver Medal";
            } else if (i==2) {
                str[poll[1]] = "Bronze Medal";
            }else{
                str[poll[1]] = i+1 + "";
            }
        }
            return str;
    }
}
