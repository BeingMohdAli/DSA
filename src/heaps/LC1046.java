package heaps;

import java.util.*;

public class LC1046 {
    static void main() {
        int[] arr = {2,7,4,1,8,1};
        System.out.println(lastStoneWeightOptimised(arr));
    }

    public static int lastStoneWeight(int[] stones) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) {
            l.add(stones[i]);
        }
        int i =0;
        while (l.size()>=2) {
            l.sort((a, b) -> b - a);
            Integer i1 = l.get(i);
            Integer i2 = l.get(i + 1);
            if (i1.equals(i2)) {
                l.remove(Integer.valueOf(i1));
                l.remove(Integer.valueOf(i2));
            } else {
                if (i1 > i2) {

                    i1 = i1 - i2;
                    l.set(i,i1);
                    l.remove(Integer.valueOf(i2));
                } else {

                    i2 = i2 - i1;
                    l.set(i,i2);
                    l.remove(Integer.valueOf(i1));
                }
            }
        }
        if (l.isEmpty()) return 0;
        return l.get(0);
    }
    public static int lastStoneWeightOptimised(int[] stones){
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            q.add(stones[i]);
        }
        while (q.size()>=2){
            int x = q.poll();
            int y  = q.poll();
            if(x<y) {
                y = y-x;
                q.add(y);
            } else if (x > y) {
                x  = x - y;
                q.add(x);
            }
        }
        if (q.isEmpty()) return 0;
        return q.peek();
    }

    }

