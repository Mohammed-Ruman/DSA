package linkedlist;



public class SLLmain {
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.addNode(5, 0);
		sll.addNode(6, 1);
		sll.addNode(7, 2);
		System.out.println(sll.head.value);
		System.out.println(sll.head.next.next.value);
		sll.traverseList();
		sll.addNode(8, 5);
		sll.traverseList();
		sll.addNode(9, 0);
		sll.traverseList();
		sll.addNode(10, 2);
		sll.traverseList();
		sll.deleteNode(6);
		sll.traverseList();
	}
}
