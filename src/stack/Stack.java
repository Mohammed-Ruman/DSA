package stack;

public class Stack {
	int[] arr;
	int topOfStack;
	
	public Stack(int size) {
		this.arr=new int[size];
		topOfStack=-1;
		System.out.println("Stack created");
	}
	
	public boolean isEmpty() {
		if(topOfStack==-1) {
			System.out.println("Stack is Empty");
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(isEmpty()) {
			return false;
		}else {
			if(topOfStack== arr.length-1) {
				System.out.println("Stack is full");
				return true;
			}else {
				return false;
			}
		}
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			arr[topOfStack+1]=value;
			topOfStack++;
		}
	}
	public int pop() {
		if(isEmpty()) {
			return -1;
		}else {
			int topvalue=arr[topOfStack];
			topOfStack--;
			return topvalue;
			
		}
	}
}
