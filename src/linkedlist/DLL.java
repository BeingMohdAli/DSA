package linkedlist;

public class DLL {

    private Node head;
    private Node tail;
    private int size;


    public void insertFirst(int value){
        Node node = new Node(value);
        if(head!=null){
            head.previous = node;
            node.next = head;
            head = node;
        }else{
            head = node;
            tail = node;
        }
        size++;

    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }


    public void insertLast(int value){
        Node node = new Node(value);

        if (tail != null) {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }else{
            tail = node;
            head = node;
        }
        size++;

    }



    public void reverseDll(){
        Node temp = tail;
        System.out.print(temp.value + " -> ");
        for (int i = size-1; i > 0 ; i--) {
            temp = temp.previous;
            System.out.print(temp.value + " -> ");
        }
        System.out.print("START");
    }
    public void insertAtAnyPosition(int value, int index){
        Node temp = head;
        if(index==0){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
            return;
        }

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        Node xyz = temp.next;
        temp.next = node;
        node.previous = temp;
        node.next = xyz;
        xyz.previous = node;
        size++;
    }

    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;

        }



        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }
}
