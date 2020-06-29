package weekOneArraysAndStrings;

import java.util.Arrays;

public class Q3RemoveDup {
	
	
	/* Implementation - We keep all confirmed characters before Tail
	 * For each ch we check in this confirmed list
	 * 		a. If found the tail does not inrease
	 * 		b. if not found - this is added to confirmed list and tail is increased
	 *  This causes the the unique string to be created all before tail
	 *  
	 *    This is O(N*2) and O(1) space */
	
	public static void removeDuplicatesEff(char[] arr) {
		
		int tail = 1;
		
		for(int i=1; i<arr.length; i++) {
			
			int j =0;
			for(; j<tail; j++) {
				if(arr[i] == arr[j])
					break;
			}
			
			if(j == tail) {
				arr[tail] = arr[i];
				tail++;
			}
			
		}
		
		arr[tail] = 0;
		
	}
	
	public static void main(String[] args) {
		String s = "aabc";
		char[] arr = s.toCharArray();
		removeDuplicatesEff(arr);
		System.out.print(Arrays.toString(arr));
	}

}
