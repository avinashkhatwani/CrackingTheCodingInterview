package weekThreeStacksAndQueues;

public class Q11ThreeStacksWithArray {
	static int stackSize = 300;
	static int[] buffer = new int[stackSize*3];
	
	static int[] stckPtr = {0, 0, 0};
	
	
	
	public static void main(String [] args){
		push(2, 4);
		System.out.println(peek(2));
		System.out.println("Poped item "+ pop(0));
		push(0, 3);
		push(0, 7);
		push(0, 5);
		System.out.println(peek(0));
		System.out.println("Poped item "+ pop(0));
		System.out.println(peek(0));
		System.out.println("Poped item "+ pop(0));
		System.out.println(peek(0));		
	}



	public static int pop(int stackPointer) {
		int idx = stckPtr[stackPointer] + stackPointer*stackSize;
		if(stckPtr[stackPointer] == 0) {
			return -1;
		}
		
		int ans = buffer[idx];
		stckPtr[stackPointer]-=1;
		return ans;
		
	}



	public static int peek(int stackPointer) {
		int idx = stckPtr[stackPointer] + stackPointer*stackSize;
		return buffer[idx];
		
	}



	public static void push(int stackPointer, int val) {
		int idx = stckPtr[stackPointer] + stackPointer*stackSize +1;
		System.out.println("PUSH item at"+ idx);
		buffer[idx] = val;
		stckPtr[stackPointer]+=1;
		
	}
}
