package Trees;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trees{
    static void main() {
        T t = new T();
        Scanner s = new Scanner(System.in);
        t.populate(s);
        t.display();

    }
}
class T {

    private static class Node {
        int value;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {

        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {

        System.out.println("Do you want to enter left of " + node.value + "?");
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value:");
            int value = scanner.nextInt();
            node.left = new Node(value);

            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + "?");
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the value:");
            int value = scanner.nextInt();
            node.right = new Node(value);

            populate(scanner, node.right);
        }
    }
    public void display() {
        display(root,"");
    }

    private void display(Node node,String intend) {

        if (node == null) {
            return;
        }

        System.out.println(intend+ node.value);


        display(node.left, intend + "\t");
        display(node.right, intend + "\t");
    }


}
