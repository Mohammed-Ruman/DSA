package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNodeLL {

    BinaryNode root;

    public BinaryNodeLL(){
        this.root=null;
        System.out.println("Root node created!!");
    }

    public void preOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value + "->");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + "->");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value+"->");
    }

    public void levelOrderTraversal(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            System.out.print(presentNode.value + "->");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    public void searchNode(String value){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();

            if(presentNode.value==(value)){
                System.out.println("The node " + value + " found in the Tree");
                return;
            }else{
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The node " + value + " not found in the Tree");
    }

    public void addNewNode(String value){
        BinaryNode node=new BinaryNode();
        node.value=value;
        if(root==null){
            this.root=node;
            return;
        }
        else{
            Queue<BinaryNode>  queue=new LinkedList<BinaryNode>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinaryNode presentNode=queue.remove();
                if(presentNode.left==null){
                    presentNode.left=node;
                    break;
                }else if(presentNode.right==null){
                    presentNode.right=node;
                    break;
                }else {
                    queue.add(presentNode.left);
                    queue.add(presentNode.right);
                }
            }
        }
    }

    //get deepest node
    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode=null;
        while(!queue.isEmpty()){
            presentNode=queue.remove();
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    //delete deepest node
    void deleteDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode=null;
        BinaryNode previousNode=null;
        while(!queue.isEmpty()){
            previousNode=presentNode;
            presentNode=queue.remove();
            if(presentNode.left==null){
                previousNode=null;
                return;
            }
            else if(presentNode.right==null){
                presentNode.left=null;
                return;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }

        }
    }

    //deleteNode
    void deleteNode(String value){
        if(root==null){
            System.out.println("Tree is empty");
            return;
        }
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.value==value){
                presentNode.value=getDeepestNode().value;
                deleteDeepestNode();
                break;
            }
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){ queue.add(presentNode.right);
            }
        }

    }
}
