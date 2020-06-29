// Write a method to replace all spaces in a string with '%20.' You may assume that the string
// has sufficient space at the end of the string to hold the additional characters, and that you
// are given the "true" length of the string. (Note: if implementing in Java, please use a characters
// array so that you can perform this operation in place)

package weekOneArraysAndStrings;

import java.util.Arrays;

public class Q5ReplaceEmptyCharacters {
	
	
	public static void ReplaceFun(char[] arr, int len) {
		int trueEdnd = arr.length-1;
		while(true) {
			if(Character.isAlphabetic(arr[trueEdnd]))
				break;
			trueEdnd-=1;
			
		}
		
		int endPtr = arr.length-1;
		System.out.println(endPtr);
		
		while(trueEdnd>=0) {
			System.out.println(Arrays.toString(arr));
			if(Character.isAlphabetic(arr[trueEdnd])) {
				arr[endPtr] = arr[trueEdnd];
				endPtr-=1;
			}
			else {
				arr[endPtr] = '0';
				endPtr-=1;
				arr[endPtr] = '2';
				endPtr-=1;
				arr[endPtr] = '%';
				endPtr-=1;
			}
			
			
			trueEdnd-=1;
		}
		
	}
	
	public static void main(String[] args) {
		String str = "a b c";
		char[] arr = new char[str.length() + 2 * 2 ];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		ReplaceFun(arr, str.length());
		System.out.println(Arrays.toString(arr));
	}

}
