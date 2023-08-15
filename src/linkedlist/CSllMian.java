package linkedlist;

public class CSllMian {
	public static void main(String[] args) {
		CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
		csll.createCsll(5);
		csll.traverseCsll();
//		csll.addNodetoCsll(10, 0);
		csll.traverseCsll();
//		csll.addNodetoCsll(15, 3);
		csll.traverseCsll();
//		csll.addNodetoCsll(20, 2);
		csll.traverseCsll();
		csll.deleteNodefromCsll(0);
		csll.traverseCsll();
	}
}
