package Tree.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    public BinarySearchTree(){
        this.root=null;
    }

    public BinaryNode addNode(BinaryNode currNode,int value){
        if(currNode==null){
            BinaryNode node=new BinaryNode();
            node.value=value;

            System.out.println("Success! ");
            return node;
        }else if(value<=currNode.value){
                currNode.left=addNode(currNode.left,value);
                return currNode;
        }else{
            currNode.right=addNode(currNode.right,value);
            return currNode;
        }

    }

    void insert(int value){
        if(root==null){
            BinaryNode node=new BinaryNode();
            node.value=value;
            root=node;
            System.out.println("Success! root ");
            return;
        }
        addNode(root,value);
    }

    public void preOrderTraversal(BinaryNode node){
        if(node==null){

            return;
        }
        System.out.print(node.value +"->");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    //Searching a node
    BinaryNode searchNode(BinaryNode node,int value){
        if(node==null){
            System.out.println("The value "+value+ " not found in Tree");
            return null;
        }else if(node.value==value){
            System.out.println("The value " +value+" is found in Tree");
            return null;
        }else if(value<node.value){
            return searchNode(node.left,value);
        }else{
            return searchNode(node.right,value);
        }
    }

    void searcH(int value){
        searchNode(root,value);
    }

}
