package weekFiveBitManupilation;

public class Q3GetNextAndPrev {
	
	private static int getBit(int n, int idx) {
		if((n & (1<<idx)) == 0)
			return 0;
		else
			return 1;
	}
	
	private static int setBit(int n, int idx, int num) {
		if(num == 0) {
			
//			int mask = ~(1 << idx);
//			System.out.println("Mask "+Integer.toBinaryString(mask));
			
			int allOne = ~0;
			int left = allOne<<idx+1;
			int right = (1<<idx) -1;
			
			
			return (n& (left | right));
		}
		else {
			return (n | (1<<idx));
		}
	}

	private static int GetPrevious_NP(int n) {
		int idx = 0;
		int countZeros = 0;
		
		while(getBit(n, idx) == 1) {
			idx+=1;
		}
		System.out.println("First 0 at "+idx);
		
		while(getBit(n, idx) == 0) {
			idx+=1;
			countZeros+=1;
		}
		System.out.println("Next 1(i.e. after 0) at "+idx);
		
		n = setBit(n, idx, 0);
		System.out.println("setting0 : "+ Integer.toBinaryString(n));
		
		idx-=1;
		n = setBit(n, idx, 1);
		countZeros-=1;
		System.out.println("setting1 : "+ Integer.toBinaryString(n));
		
		System.out.println();
		System.out.println("Shifting 1's");
		for(int i=idx-1; i>=countZeros; i--) {
			n = setBit(n, i, 1);
			System.out.println("setting1 : "+ Integer.toBinaryString(n));
		}
		for(int i=countZeros-1; i>=0; i--) {
			n = setBit(n, i, 0);
			System.out.println("setting0 : "+ Integer.toBinaryString(n));
		}
		
		return n;
	}
	


	private static int GetNext_NP(int n) {
		if(n<=0)
			return -1;
		int idx = 0;
		int countOnes=0;
		
		while(getBit(n, idx) == 0) {
			idx+=1;
		}
		System.out.println("1st 1 at "+idx);
		
		while(getBit(n, idx) == 1) {
			idx+=1;
			countOnes+=1;
		}
		System.out.println("1st 0 at "+(idx));
		
		n = setBit(n, idx, 1);
//		System.out.println(Integer.toBinaryString(n)+" "+countOnes);
		
		idx-=1;
		n = setBit(n, idx, 0);
		countOnes-=1;
		System.out.println(Integer.toBinaryString(n)+" "+countOnes);
		
		for(int i =idx-1; i>=countOnes; i--) {
			n = setBit(n, i, 0);
			System.out.println(Integer.toBinaryString(n)+" "+countOnes);
		}
		
		for(int i = countOnes-1; i>=0; i--) {
			n = setBit(n, i, 1);
			System.out.println(Integer.toBinaryString(n)+" "+countOnes);
		}
		
		return n;
	}
	
	
	public static void main(String[] args) {
		int a = 25;
		System.out.println(a + ": " + Integer.toBinaryString(a));
		int b = GetNext_NP(a);
		System.out.println("Next number with same numbe of 1's "+b + ": " + Integer.toBinaryString(b));	
		System.out.println();
		System.out.println(a + ": " + Integer.toBinaryString(a));
		int c = GetPrevious_NP(a);
		System.out.println("Prev number with same numbe of 1's "+c + ": " + Integer.toBinaryString(c));	
	}


}
