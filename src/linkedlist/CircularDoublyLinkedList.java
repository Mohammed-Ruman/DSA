package linkedlist;

public class CircularDoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	public int size;
	
	public DoublyNode createCircularDll(int nodeValue) {
		head=new DoublyNode();
		DoublyNode node=new DoublyNode();
		node.value=nodeValue;
		node.next=node;
		node.prev=node;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	public void addNode(int nodeValue,int location) {
		DoublyNode newNode=new DoublyNode();
		newNode.value=nodeValue;
		if(head==null) {
			createCircularDll(nodeValue);
			return;
		}else if(location==0) {
			newNode.next=head;
			newNode.prev=tail;
			head.prev=newNode;
			tail.next=newNode;
			head=newNode;
		}else if(location>=size) {
			newNode.next=head;
			newNode.prev=tail;
			head.prev=newNode;
			tail.next=newNode;
			tail=newNode;
		}else {
			DoublyNode currNode=head;
			int index=0;
			while(index<location-1) {
				currNode=currNode.next;
				index++;
			}
			newNode.next=currNode.next;
			newNode.prev=currNode;
			newNode.next.prev=newNode;
			currNode.next=newNode;
		}
		size++;
	}
	
	public void traversal() {
		DoublyNode tempNode=head;
		for(int i=0;i<size;i++) {
			System.out.print(tempNode.value);
			if(i!=size-1) {
				System.out.print(" -> ");
			}
			tempNode=tempNode.next;
		}
		System.out.println();
	}
	
	public void deleteNode(int location) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}else if(location==0) {
			if(size==1) {
				head.next=null;
				head.prev=null;
				head=null;
				tail=null;
				size--;
			}else {
				head=head.next;
				head.prev=tail;
				tail.next=head;
				size--;
			}
		}else if(location>=size) {
			if(size==1) {
				head.next=null;
				head.prev=null;
				head=null;
				tail=null;
				size--;
			}else {
				tail.prev.next=head;
				tail=tail.prev;
				head.prev=tail;
				size--;
			}
		}else {
			DoublyNode currNode=head;
			for(int i=0;i<location-1;i++) {
				currNode=currNode.next;
			}
			currNode.next=currNode.next.next;
			currNode.next.prev=currNode;
			size--;
		}
	}
}
