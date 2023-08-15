package Tree;

public class BinaryTreeArray {
    public static void main(String[] args) {
        BinaryNodeArray binaryNodeArray = new BinaryNodeArray(7);
        System.out.println(binaryNodeArray.isFull());
        binaryNodeArray.addNode("N1");
        binaryNodeArray.addNode("N2");
        binaryNodeArray.addNode("N3");
        binaryNodeArray.addNode("N4");
        binaryNodeArray.addNode("N5");
        binaryNodeArray.addNode("N6");
        binaryNodeArray.addNode("N7");

        binaryNodeArray.preOrderTraversal(1);
        System.out.println();
        binaryNodeArray.inOrderTraversal(1);
        System.out.println();
        binaryNodeArray.postOrderTraversal(1);
        System.out.println();
        binaryNodeArray.levelOrderTraversal();
        System.out.println();
        binaryNodeArray.deleteNode("N1");
        binaryNodeArray.levelOrderTraversal();

    }
}
