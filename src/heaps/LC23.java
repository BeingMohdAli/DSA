package heaps;

import java.util.PriorityQueue;

class ListNode {
         int val;
          ListNode next;
          ListNode() {}
        ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next; }
    }


    public class LC23 {
    static void main() {
        LC23 l = new LC23();
    }
     public   ListNode  mergeKLists(ListNode[] lists) {
         if(lists==null || lists.length==0) {
             return null;
         }
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for (var e : lists){
             while(e!=null){
                 pq.add(e.val);
                 e = e.next;
             }
         }
         if (pq.isEmpty()) return null;
         int n = pq.size();
         ListNode[] l = new ListNode[n];
         for (int i = 0; i < n; i++) {
             l[i] = new ListNode(pq.poll());
         }

         for (int i = 0; i < l.length-1; i++) {
             l[i].next = l[i+1];
         }
         return l[0];

    }
}
