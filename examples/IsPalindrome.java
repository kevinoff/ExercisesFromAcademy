package uk.ac.belfastmet.examples;

/**
 * check if a String is Palindrome
 * @param str
 * @return
 */
//Should be an author doc 
public class IsPalindrome {

	public boolean isPalindrome(String str) {
		boolean result = false;
		
		int part1OfStr = 0; 
		int part2OfStr = str.length()-1;
		
		for(int index = 0; part1OfStr < part2OfStr; index++) {
			if(str.charAt(part1OfStr) != str.charAt(part2OfStr)) {
				result = false;
			}
			else result = true;
			
			part1OfStr++;
			part2OfStr--;
		}
		
		return result;
	}
}