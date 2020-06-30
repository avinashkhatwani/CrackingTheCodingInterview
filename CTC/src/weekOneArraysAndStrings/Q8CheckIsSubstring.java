package weekOneArraysAndStrings;

public class Q8CheckIsSubstring {
	
	public static boolean isRotation(String w1, String w2) {
		
		for(int i=0; i<w2.length(); i++) {
			if(w1.charAt(0) == w2.charAt(i)) {
//				System.out.println(w1.charAt(0)+"   => "+w2.charAt(i));
				int w2Start = i;
				int j=0;
				while(j<w1.length()) {
//					System.out.println(w1.charAt(j)+"   => "+w2.charAt(w2Start));
					if(w1.charAt(j) == +w2.charAt(w2Start)) {
						w2Start = (w2Start+1)%w2.length();
						j+=1;
					}else
						break;

				}
				if(j==w1.length() && w2Start==i)
					return true;
			}
		}
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		String[][] pairs = {{"aa", "aaa"},{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
	}

}
