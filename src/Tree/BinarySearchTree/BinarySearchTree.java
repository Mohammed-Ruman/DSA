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
    
    //minimum node
    
    public BinaryNode minimumNode(BinaryNode root) {
    	if(root.left==null) {
    		return root;
    	}else {
    		return minimumNode(root.left);
    	}
    }
    
    //delete node
    public BinaryNode deleteNode(BinaryNode root,int value) {
    	if(root==null) {
    		System.out.println("Node not found");
    		return null;
    	}
    	
    	if(value<root.value) {
    		root.left=deleteNode(root.left, value);
    	}else if(value>root.value) {
    		root.right=deleteNode(root.right, value);
    	}else {
    		if(root.left!=null && root.right!=null) {
    			BinaryNode temp=root;
    			BinaryNode minNodeForRight=minimumNode(temp.right);
    			root.value=minNodeForRight.value;
    			root.right=deleteNode(root.right, minNodeForRight.value);
    		}else if(root.left!=null) {
    			root=root.left;
    		}else if(root.right!=null) {
    			root=root.right;
    		}else {
    			root=null;
    		}
    		
    	}
    	return root;
    }

}
