package weekOneArraysAndStrings;

import java.util.HashMap;

public class Q4CheckIfAnagrams {

	/*  Create hashMap with word1 i.e. character - frequency 
	 *  for the word 2 to be anagram, it is supposed to have same chars with same freq
	 *  hence decrement map with word 2 and check if finally the map is empty */
	
	public static boolean anagram(String w1, String w2) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		
		for(char ch : w1.toCharArray()) {
			if(!map1.containsKey(ch)) {
				map1.put(ch, 1);
			}
			else {
				int val = map1.get(ch);
				map1.put(ch,val+1);
			}
		}
		
		for(char ch: w2.toCharArray()) {
			if(!map1.containsKey(ch))
				return false;
			int val = map1.get(ch);
			map1.put(ch, val-1);
			if((val - 1)==0)
				map1.remove(ch);
		}
		
		return (map1.isEmpty());
	}
	
	
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = anagram(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}

}
