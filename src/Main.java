//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(10);
        tree.root.left.left = new Node(5);
        tree.root.right = new Node(39);

        System.out.println("Inorder Traversal");
        tree.inOrderTraversal(tree.root);
        System.out.println();


        System.out.println("Preorder Traversal");
        tree.preOrderTraversal(tree.root);
        System.out.println();
    }
}

class Node {
    int id ;
    Node left;
    Node right;

    public Node(int item) {
        id = item;
    }
}

class BinaryTree {
    Node root;

    void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.id + " ");
        inOrderTraversal(node.right);
    }

    void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.id + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
