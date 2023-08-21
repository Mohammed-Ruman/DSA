package Tree.BinarySearchTree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(100);
        binarySearchTree.insert(80);
        binarySearchTree.insert(90);
        binarySearchTree.insert(60);
        binarySearchTree.insert(70);
        binarySearchTree.insert(85);
        binarySearchTree.insert(95);


        binarySearchTree.preOrderTraversal(binarySearchTree.root);
        System.out.println();
        binarySearchTree.searcH(600);
        System.out.println();
        binarySearchTree.deleteNode(binarySearchTree.root, 60);
        
        binarySearchTree.preOrderTraversal(binarySearchTree.root);
    }
}
