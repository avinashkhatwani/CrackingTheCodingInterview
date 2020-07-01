/* Implement a MyQueue class which implements a queue using two stacks*/

package weekThreeStacksAndQueues;

import java.util.Stack;

public class Q5QueueWithStacks {
	
	public static void main(String[] args) {
		Q5bMyQueue myQueue = new Q5bMyQueue();
		for(int i=0;i<6; i++) {
			myQueue.push(i);
		}
		System.out.println("Current Stack "+ Q5bMyQueue.stack1);
		System.out.println("Peeking " + myQueue.peek());
		System.out.println("pop " + myQueue.pop());
		System.out.println("pop " + myQueue.pop());
		System.out.println("Peeking " + myQueue.peek());
		System.out.println("Size " + myQueue.size());
		System.out.println("Current Stack "+ Q5bMyQueue.stack1 +" "+Q5bMyQueue.revStack);
	}
}
