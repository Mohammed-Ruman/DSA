package linkedlist;

public class DoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	public int size;
	public DoublyNode createDlyLL(int nodeValue) {
		
		head=new DoublyNode();
		DoublyNode newNode=new DoublyNode();
		newNode.value=nodeValue;
		newNode.next=null;
		newNode.prev=null;
		head=newNode;
		tail=newNode;
		size=1;
		return head;
	}
	
	public void addNodetoDlyll(int nodeValue,int location) {
		DoublyNode newNode=new DoublyNode();
		newNode.value=nodeValue;
		if(head==null) {
			createDlyLL(nodeValue);
			return;
		}else if(location==0) {
			newNode.next=head;
			newNode.prev=null;
			head.prev=newNode;
			head=newNode;
		}else if(location>=size) {
			newNode.next=null;
			newNode.prev=tail;
			tail.next=newNode;
			tail=newNode;
		}else {
			DoublyNode tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			newNode.next=tempNode.next;
			newNode.prev=tempNode;
			newNode.next.prev=newNode;
			tempNode.next=newNode;
		}
		size++;
	}
	
	public void traversalDll() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}else {
			DoublyNode currNode=head;
			for(int i=0;i<size;i++) {
				System.out.print(currNode.value);
				if(i!=size-1) {
					System.out.print(" -> ");
				}
				currNode=currNode.next;
			}
			System.out.println();
		}
	}
	
	public void deleteNode(int location) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}else if(location==0){
			if(size==1) {
				head=null;
				tail=null;
				size--;
			}else {
				head=head.next;
				head.prev=null;
				size--;
			}
		}else if(location>=size-1) {
			if(size==1) {
				head=null;
				tail=null;
				size--;
			}else {
				DoublyNode tempNode=head;
				for(int i=0;i<size-1;i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=null;
				tail=tempNode;
				size--;
			}
		}else {
			DoublyNode tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			tempNode.next.prev=tempNode;
			size--;
		}
		
		
	}
}
