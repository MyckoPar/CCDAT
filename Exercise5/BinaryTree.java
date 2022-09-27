// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node CEO
        Node CEO = new Node("MYCKO");
        // Create node COO
        Node COO = new Node("RONN");
        // Create node VICEPRESIDENT
        Node VICEPRESIDENT = new Node("NEIL");
        // Create node MANAGER
        Node MANAGER = new Node("ALEX");
        // Create node SUPERVISOR
        Node SUPERVISOR = new Node("TRISTAN");
        // Create node EMPLOYEE1
        Node EMPLOYEE1 = new Node("IDEL");
        // Create node EMPLOYEE2
        Node EMPLOYEE2 = new Node("JAP");

        // Set left and right child of root node CEO
        CEO.left = COO;
        CEO.right = VICEPRESIDENT;

        // Set left and right child of node B
        COO.left = MANAGER;
        COO.right = SUPERVISOR;

        // Set left and right child of node C
        VICEPRESIDENT.left = EMPLOYEE1;
        VICEPRESIDENT.right = EMPLOYEE2;

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(CEO);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(CEO);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(CEO);
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
