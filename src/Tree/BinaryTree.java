package Tree;

public class BinaryTree {
    public static void main(String[] args) {
        BinaryNodeLL binaryTree= new BinaryNodeLL();
        BinaryNode n1=new BinaryNode();
        n1.value="N1";

        BinaryNode n2=new BinaryNode();
        n2.value="N2";

        BinaryNode n3=new BinaryNode();
        n3.value="N3";

        BinaryNode n4=new BinaryNode();
        n4.value="N4";

        BinaryNode n5=new BinaryNode();
        n5.value="N5";

        BinaryNode n6=new BinaryNode();
        n6.value="N6";

        n1.left=n2;
        n1.right=n3;

        n2.left=n4;
        n2.right=n5;

        n3.left=n6;
        binaryTree.root=n1;
        System.out.println("Pre-Order Traversal");
        binaryTree.preOrderTraversal(binaryTree.root);
        System.out.println();
        System.out.println("In-Order Traversal");

        binaryTree.inOrderTraversal(binaryTree.root);
        System.out.println();
        System.out.println("Post-order Traversal ");
        binaryTree.postOrderTraversal(binaryTree.root);
        System.out.println();
        System.out.println("Level-order Traversal ");
        binaryTree.levelOrderTraversal();

       // binaryTree.searchNode("N10");

        binaryTree.addNewNode("N7");
        System.out.println("After adding node n7");
        binaryTree.levelOrderTraversal();
        binaryTree.addNewNode("N8");
        System.out.println("After adding node n7");
        binaryTree.levelOrderTraversal();
        System.out.println();
        System.out.println(binaryTree.getDeepestNode().value);
        binaryTree.deleteNode("N1");
        binaryTree.levelOrderTraversal();



    }
}
