package linkedlist;

public class CircularDllMain {
	public static void main(String[] args) {
		CircularDoublyLinkedList cdll=new CircularDoublyLinkedList();
		cdll.createCircularDll(5);
		System.out.println(cdll.head.value);
		cdll.addNode(10, 0);
		System.out.println(cdll.head.value);
		cdll.addNode(15, 2);
		cdll.addNode(20, 3);
		cdll.traversal();
		cdll.deleteNode(0);
		cdll.traversal();
		
	}
}
