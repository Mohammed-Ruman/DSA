package linkedlist;

public class DoublyLLMain {
	public static void main(String[] args) {
		
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.createDlyLL(6);
		System.out.println(dll.head.value);
		dll.addNodetoDlyll(12, 1);
		System.out.println(dll.head.next.value);
		dll.traversalDll();
		dll.addNodetoDlyll(18, 2);
		dll.addNodetoDlyll(24, 3);
		dll.addNodetoDlyll(30, 4);
		dll.traversalDll();
		dll.deleteNode(4);
		dll.traversalDll();
		
	}
}
