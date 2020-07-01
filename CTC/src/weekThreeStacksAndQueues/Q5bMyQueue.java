package weekThreeStacksAndQueues;

import java.util.Stack;

public class Q5bMyQueue {
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> revStack = new Stack<>();
	
	void push(int val) {
		stack1.push(val);
	}
	
	int pop() {
		if(!revStack.isEmpty()) {
			return revStack.pop();
		}
		while(!stack1.isEmpty()) {
			revStack.push(stack1.pop());
		}
		return revStack.pop();
	}
	
	int peek() {
		if(!revStack.isEmpty()) {
			return revStack.peek();
		}
		while(!stack1.isEmpty()) {
			revStack.push(stack1.pop());
		}
		return revStack.peek();
	}
	
	int size() {
		return stack1.size() + revStack.size();
	}
	
}
