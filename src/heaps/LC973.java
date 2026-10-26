package heaps;

import javax.print.attribute.standard.PrinterURI;
import java.util.Collections;
import java.util.PriorityQueue;

public class LC973 {
    static void main() {

    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b) -> Double.compare(b[2], a[2]));
        for (var i : points){
            double x = i[0];
            double y = i[1];
            double d = Math.sqrt(x*x+y*y);
            pq.add(new double[]{x,y,d});
            if(pq.size()>k) pq.poll();
        }
        int [][] ans = new int[pq.size()][2];
        int i = 0;
        while (!pq.isEmpty()) {
            double[] curr = pq.poll();
            ans[i][0] = (int) curr[0]; // x
            ans[i][1] = (int) curr[1]; // y

            i++;
        }
        return ans;

    }
}
