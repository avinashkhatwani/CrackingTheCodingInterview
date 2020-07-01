package weekThreeStacksAndQueues;

/* To implement the stacks with dynamic size, we use Stack Nodes,
 *  that keep track of the prev node in its stack. This way the respective stack ptr's
 *  are kept on track with the nodes.*/
class StackNode{
	int val;
	int prev;
	StackNode(int value){
		val = value;
		prev = -1;
	}
}
public class Q12ThreeDynamicStacksWithArray {
	static int stackSize = 300;
	static public StackNode[] buffer= new StackNode[900];
	static int[] ptrs = {-1,-1,-1};
	static int curUsed = 0;
	
	public static void main(String [] args){
		push(2, 4);
		System.out.println("Peeking from 2 "+peek(2));
		push(0, 3);
		push(0, 7);
		push(0, 5);
		System.out.println("Peeking from 0 "+peek(0));
		System.out.println("Poping from 0 "+pop(0));
		System.out.println("Peeking from 0 "+peek(0));
		System.out.println("Poping from 0 "+pop(0));
		System.out.println("Peeking from 0 "+peek(0));
		System.out.println("Poping from 0 "+pop(0));
		System.out.println("Peeking from 0 "+pop(0));
		
//		for(int ptr: ptrs)
//			System.out.println(ptr);
	}

	private static int pop(int stackNumber) {
		if(ptrs[stackNumber] == -1)
			return -1;
		int val = buffer[ptrs[stackNumber]].val;
		ptrs[stackNumber]=buffer[ptrs[stackNumber]].prev;		
		return val;
	}

	private static int peek(int stackNumber) {
		if(ptrs[stackNumber] == -1)
			return -1;
		return buffer[ptrs[stackNumber]].val;
	}

	private static void push(int stackNumber, int val) {
		StackNode newNode = new StackNode(val);
		if(ptrs[stackNumber] != -1) {
			newNode.prev = ptrs[stackNumber];
		}
		
		
		buffer[curUsed] = newNode;
		ptrs[stackNumber]= curUsed;
		curUsed+=1;
		
	}
	
}
