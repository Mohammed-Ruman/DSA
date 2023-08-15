package linkedlist;

public class CircularSinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	public Node createCsll(int nodeValue) {
		head=new Node();
		Node node=new Node();
		node.value=nodeValue;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	public void addNodetoCsll(int nodeValue,int location) {
		if(head==null) {
			createCsll(nodeValue);
			return;
		}else if(location==0) {
			Node node=new Node();
			node.value=nodeValue;
			node.next=head;
			tail.next=node;
			head=node;
			
		}else if(location>=size) {
			Node node=new Node();
			node.value=nodeValue;
			node.next=tail.next;
			tail.next=node;
			tail=node;
		}else {
			Node node=new Node();
			node.value=nodeValue;
			Node tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			node.next=tempNode.next;
			tempNode.next=node;
		}
		size++;
	}
	public void traverseCsll() {
		if(head==null) {
			return;
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
	
	public void deleteNodefromCsll(int location) {
		if (head==null) {
			System.out.println("List is empty");
			return;
		}else if(location==0) {
			if(size==1) {
				head.next=null;
				head=null;
				tail=null;
				size--;
			}else {
				head=head.next;
				tail.next=head;
				size--;
			}
		}else if(location>=size) {
			if(size==1) {
				head=null;
				tail=null;
				head.next=null;
				size--;
			}else {
				Node tempNode=head;
				for(int i=0;i<size-1;i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=tempNode.next.next;
				tail=tempNode;
				tail.next=head;
				size--;
			}
		}else {
			Node tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			tempNode.next=tempNode.next.next;
			size--;
		}
	}
	
	
	
	
	
	
	
	
	
	
}
