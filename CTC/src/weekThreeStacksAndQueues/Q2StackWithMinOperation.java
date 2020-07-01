
/* design a stack which, in addition to push and pop, also has a function min 
 * which returns the minimum element? Push, pop and min
 *  should all operate in O(1) time. */


package weekThreeStacksAndQueues;

import java.util.Stack;

public class Q2StackWithMinOperation {
	static Stack<Integer> stack = new Stack<>();
	static Stack<Integer> min = new Stack<>();
	
	static void push(int val) {
		if(min.size()>0) {
			int curMin = min.peek();
			if(val < curMin) 
				min.push(val);
		}
		else
			min.push(val);
		stack.push(val);
		
	}
	
	static int pop() {
		if(stack.size() == 0) {
			return -1;
		}
		int val = stack.pop();
		if(val == min.peek())
			min.pop();
		return val;
	}
	
	static int minPeek() {
		if(stack.size() == 0) {
			return -1;
		}
		return min.peek();
	}
	
	public static void main(String[] args) {
		
		push(2);
		push(7);
		push(3);
		System.out.println("The min is "+minPeek());
		push(1);
		push(8);
		
		System.out.println("Cur Stack is "+stack);
		System.out.println("The min is "+minPeek());
		pop();
		pop();
		pop();
		System.out.println("The min is "+minPeek());

	}
}
