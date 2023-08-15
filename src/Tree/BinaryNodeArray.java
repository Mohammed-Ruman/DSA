package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNodeArray {

    String[] arr;
    int lastUsedIndex;

    BinaryNodeArray(int size){
        this.arr=new String[size+1];
        this.lastUsedIndex=0;
        System.out.println("Blank Tree of size " + size + " is created" );
    }

    boolean isFull(){
        boolean res=arr.length-1==lastUsedIndex? true:false;
        return res;
    }

    void addNode(String value){
        if(!isFull()){
            arr[lastUsedIndex+1]=value;
            lastUsedIndex++;
            System.out.println("The value " + value + " is inserted");
        }else{
            System.out.println("The binary Tree is full");
        }
    }

    void preOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        System.out.print(arr[index] + "->");
        preOrderTraversal(index*2);
        preOrderTraversal(index*2 +1);
    }

    void inOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        inOrderTraversal(index*2);
        System.out.print(arr[index] +"->");
        inOrderTraversal(index*2 +1);
    }

    void postOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        postOrderTraversal(index*2);
        postOrderTraversal(index*2 +1);
        System.out.print(arr[index] +"->");
    }

    void levelOrderTraversal(){
        int index=1;
        if( lastUsedIndex==0){
            return;
        }
        while(index<=lastUsedIndex){
            System.out.print(arr[index]+"->");
            index++;
        }
    }

    void deleteNode(String value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i]==value){
                arr[i]=arr[lastUsedIndex];
                lastUsedIndex--;
                System.out.println("Node deleted");
                return;
            }
        }
        System.out.println("Invalid value");

    }

}
