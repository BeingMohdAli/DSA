package linkedlist;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void  displayAllElements(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> " );
            temp =  temp.next;
        }
        System.out.print("End");
    }
    public void insertAtFirst(int val){
        Node node = new Node(val);
       node.next = head;
       head = node;
       if(tail==null){
           tail = head;
       }
    size++;

    }
    public void insertAtLast(int val){
        Node node = new Node(val);
        if(head==null) {
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;

    }
    public void insert(int value,int index){
        if(index==0){
            insertAtFirst(value);
            return;
        }
        if(index==size){
            insertAtLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }

        Node node = new Node(value,temp.next);
            temp.next = node;

        size++;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }





    }





}


