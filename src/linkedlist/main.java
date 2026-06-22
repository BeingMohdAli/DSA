package linkedlist;

public class main {
    static void main() {
//    LL l = new LL();
//     l.insertAtFirst(17);
//     l.insertAtLast(19);
//     l.insertAtLast(21);
//     l.insertAtLast(23);
////l.insert(18,1);
//       l.displayAllElements();


        DLL dll = new DLL();
        dll.insertLast(23);
        dll.insertLast(27);
        dll.insertLast(28);
        dll.insertLast(29);
        dll.insertLast(34);
        dll.insertLast(35);

        dll.insertAtAnyPosition(39,3);
        dll.display();
        dll.reverseDll();


    }
}
