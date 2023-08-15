package stack;

public class MainStack {
	public static void main(String[] args) {
		Stack customStack=new Stack(4);
		System.out.println(customStack.isEmpty());
		customStack.push(25);
		System.out.println(customStack.isEmpty());
		System.out.println(customStack.isEmpty());
		int res=customStack.pop();
		System.out.println(res);
		System.out.println(customStack.isEmpty());
		
	}
}
