package weekFiveBitManupilation;

public class Q6SwapOddEvenBits {

	public static void main(String[] args) {
		
		int a = 103217;
		System.out.println(a + ": " +Integer.toBinaryString(a));
		int b = swapOddEvenBits(a);
		System.out.println(b + ": " +Integer.toBinaryString(b));
		
		
//		System.out.println(Integer.toBinaryString(0xaaaaaaaa));
//		System.out.println(Integer.toBinaryString(0x55555555));
		
//		System.out.println(Integer.toBinaryString(1<<2));
	}

	private static int swapOddEvenBits(int a) {
		
		int evenMask = a & 0xAAAAAAAA;
		int oddMask = a & 0x55555555;
		
//		System.out.println(Integer.toBinaryString(0xAAAAAAAA));
		
		evenMask >>=1;
		oddMask <<=1;
				
		return (evenMask | oddMask);
		
//		// Get all even bits of x 
//        int even_bits = a & 0xAAAAAAAA;  
//      
//        // Get all odd bits of x 
//        int odd_bits = a & 0x55555555;  
//      
//        // Right shift even bits 
//        even_bits >>= 1;  
//          
//        // Left shift even bits 
//        odd_bits <<= 1;  
//          
//        // Combine even and odd bits 
//        return (even_bits | odd_bits);  
	}
}
