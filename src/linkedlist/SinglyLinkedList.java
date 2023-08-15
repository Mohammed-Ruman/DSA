package linkedlist;

public class SinglyLinkedList {
	Node head;
	Node tail;
	int size;
	
	public Node createSingleLL(int nodeValue) {
		head=new Node();
		Node node=new Node();
		node.value=nodeValue;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return head;
		}
	public void addNode(int nodeValue,int location) {
		Node node=new Node();
		node.value=nodeValue;
		if(head==null) {
			createSingleLL(nodeValue);
			return;
		}else if(location==0) {
			node.next=head;
			head=node;
		}else if(location>=size) {
			node.next=null;
			tail.next=node;
			tail=node;
			
		}else {
			Node tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			Node nextNode=tempNode.next;
			tempNode.next=node;
			node.next=nextNode;
		}
		size++;
	}
	public void traverseList() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			Node tempNode=head;
			for(int i=0;i<size;i++) {
				System.out.print(tempNode.value);
				if(i!=size-1) {
					System.out.print(" -> ");
				}
				tempNode=tempNode.next;
			}
			System.out.println();
		}
	}
	public void deleteNode(int location) {
		if(head==null) {
			return;
		}
		else if(location==0) {
			head=head.next;
			size--;
			if(size==0) {
				tail=null;
			}
		}else if(location>=size) {
			Node tempNode=head;
			for(int i=0;i<size-1;i++) {
				tempNode=tempNode.next;
			}
			if(tempNode==head) {
				head=null;
				tail=null;
				size--;
				return;
			}
			tempNode.next=null;
			tail=tempNode;
			size--;
		}else {
			Node tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			size--;
		}
		
	}
}
