/* Write a program to sort a stack in ascending order. You should not make any assumptions about how the stack is implemented. 
 * The following are the only functions that should be used to write this program:
 * 					 push | pop | peek | isEmpty.  */

package weekThreeStacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class Q6SortAStack {
	
	static Stack<Integer> sort(Stack<Integer> stack){
		Stack<Integer> stck = new Stack<>();
//		int temp = 0;
		
		while(!stack.isEmpty()) {
			
			int cur = stack.pop();
			if(stck.isEmpty() || stck.peek()<=cur)
				stck.push(cur);
			else {
				Stack<Integer> temp = new Stack<>();
				while(!stck.empty() && stck.peek()>cur) {
					temp.push(stck.pop());
				}
				stck.push(cur);
				while(!temp.isEmpty()) {
					stck.push(temp.pop());
				}
			}
		}
		
		while(!stck.isEmpty()){
			stack.push(stck.pop());
		}
		
		return stack;
	}

	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(2);
		s.push(24);
		s.push(34);
		s.push(19);
		s.push(3);
		s.push(4);
		s = sort(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}
