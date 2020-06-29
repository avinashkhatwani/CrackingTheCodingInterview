package weekOneArraysAndStrings;


/* Using extra space  */
public class Q1UniqueCharacters {
	
	public static boolean isUniqueChars(String word) {
		boolean[] exists = new boolean[256];
		for(int i=0; i<word.length(); i++) {
			int val = word.charAt(i);
			if(exists[val])
				return false;
			exists[val] = true;
		}
		
		return true;
	}

	/* Using no extra space i.e. bit wise operations  */
	public static boolean isUniqueChars2(String word) {
		int check = 0;
		for(int i=0; i<word.length(); i++) {
			int val= word.charAt(i)-'a';
			//left shift to the corresponding integer 
			val = 1<<val;
			
			//check if that value is already set
			if((check & val)>0)
				return false;
			// if not set it to 1
			check = check|val;
		}
		
		
		return true;
	}

	
	public static void main(String[] args) {
		
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars2(word) + " ");
		}
	}
}
