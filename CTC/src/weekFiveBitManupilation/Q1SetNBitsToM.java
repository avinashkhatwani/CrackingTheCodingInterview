/* You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a
method to set all bits between i and j in N equal to M (e.g., M becomes a substring of
N located at i and starting at j).
EXAMPLE:
Input: N = 10000000000, M = 10101, i = 2, j = 6
Output: N = 10001010100  */

package weekFiveBitManupilation;

public class Q1SetNBitsToM {
	
	public static void main(String[] args) {
		int a = 103217;
		System.out.println("N= "+Integer.toBinaryString(a));
		int b = 13;
		System.out.println("M= "+Integer.toBinaryString(b));		
		int c = updateBits(a, b, 4, 7);
//		System.out.println(AssortedMethods.toFullBinaryString(c));
	}

	private static int updateBits(int n, int m, int i, int j) {

// Another way ofcreating left
//		System.out.println();
//		int max = ~0;
//		int left1 =max-((1 << j));
//		System.out.println(Integer.toBinaryString(left1));

		System.out.println("Creating a mask");
		int allOnes = ~0;
		System.out.println(Integer.toBinaryString(allOnes));
        
        // Set all the bits in the left of j 
        int left = allOnes << (j + 1);
        System.out.println("LeftSide mask= "+ Integer.toBinaryString(left));
          
        // Set all the bits in the right of j 
        int right = ((1 << i) - 1);
        System.out.println("RightSide mask= "+ Integer.toBinaryString(right));
        
        int mask = left | right;
        System.out.println("Combining mask to leave space in btw= "+Integer.toBinaryString(mask));
        
        int masked_n = n & mask; 
        System.out.println("changing <j & >i to real values= "+Integer.toBinaryString(masked_n));
        
        int m_shifted = m<<i;
        System.out.println("Placing M= "+Integer.toBinaryString(m_shifted));
        
        int res = (masked_n | m_shifted);
        System.out.println("RES= "+Integer.toBinaryString(res));
        
        return 0;
	}
	
	

}
