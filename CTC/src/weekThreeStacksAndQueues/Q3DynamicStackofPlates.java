/* Imagine a (literal) stack of plates. If the stack gets too high, it might topple. 
 * Therefore, in real life, we would likely start a new stack when the previous stack
 *  exceeds some threshold. Implement a data structure SetOfStacks that mimics this.
 *  SetOfStacks should be composed of several stacks, and should create a new stack
 *  once the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop()
 *  should behave identically to a single stack (that is, pop() should return the same
 *  values as it would if there were just a single stack).
FOLLOW UP
Implement a function popAt(int index) which performs a pop operation on a 
specific sub-stack.  */


package weekThreeStacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

public class Q3DynamicStackofPlates {

	static int capacity = 5;
	static ArrayList<Integer> ptr = new ArrayList<>();
	static ArrayList<Stack<Integer>> stackArr = new ArrayList<>();
	
	static int getLastStack() {
		if(stackArr.size() == 0)
			return -1;
		return stackArr.size();
	}
	
	static void createNewStack() {
		int val = getLastStack();
		stackArr.add(new Stack<>());
	}
	
	static void push(int val) {
		int lastStack = getLastStack();
//		System.out.println(lastStack);
		if(lastStack==-1 || stackArr.get(lastStack-1).size()==capacity)
			createNewStack();
		
		
		Stack<Integer> curStack = stackArr.get(getLastStack()-1);
		curStack.push(val);

	}
	
	
	public static void popAtIdx(int idx) {
		System.out.println("POP At IDX "+idx);
		if(idx<0 || idx>getLastStack()-1) {
			System.out.println("Wrong Idx");
			return;
		}
		else if(idx == getLastStack()-1) {
			pop();
			return;
		}
		else {
			Stack<Integer> curStack = stackArr.get(idx);
			curStack.pop();
			for(int i=idx+1; i<stackArr.size(); i++) {
				Stack<Integer> nextStack = stackArr.get(i);
				int last = nextStack.remove(0);
				curStack.push(last);
				curStack = nextStack;
			}
		}
		
		if(stackArr.get(stackArr.size()-1).size() == 0) {
			stackArr.remove(stackArr.size()-1);
		}
		
	}
	
	static int pop() {
		int lastStack = getLastStack();
		if(lastStack==-1)
			return -1;
		
		Stack<Integer> curStack = stackArr.get(getLastStack()-1);
		int val = curStack.pop();
		if(curStack.size() == 0) {
			stackArr.remove(getLastStack()-1);
		}
		return val;
	}
	
	static void printAll() {
		for(int i=0; i<stackArr.size(); i++) {
			System.out.println("Stack at "+i+" is "+stackArr.get(i));
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<11; i++) {
			push(i);
		}
		printAll();
		popAtIdx(0);
		
		printAll();
//		pop();
//		System.out.println(stackArr.get(getLastStack()-1));
	}

	
	
}
