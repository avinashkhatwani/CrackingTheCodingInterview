package weekFiveBitManupilation;

public class Q5NumChangedBits {

	
	
	public static void main(String[] args) {
		int a = 31;
		int b = 14;
		System.out.println(a + ": " + Integer.toBinaryString(a));
		System.out.println(b + ": " + Integer.toBinaryString(b));
		int nbits = bitSwapRequired(a, b);
		System.out.println("Required number of bits: " + nbits);
	}

	private static int bitSwapRequired(int n, int m) {
		int c = n^m;
		System.out.println(c + ": " + Integer.toBinaryString(c));
		int count = 0;
		for(int idx = 0; idx<Integer.toBinaryString(c).length(); idx++) {
			if((c & (1<<idx)) != 0) {
				count+=1;
			}
			
		}
		
		return count;
	}
}
