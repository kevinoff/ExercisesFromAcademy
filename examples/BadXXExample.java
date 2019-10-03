package uk.ac.belfastmet.examples;

/**
 * character finding in a String
 * @author off12066827
 *
 */
public class BadXXExample {

	
	/**
	 * check which element of a String that a character appears
	 * @param str
	 * @return
	 */
	public boolean hasBad(String str) {
		
		Boolean resultBool = false;
		
		int startIndex = str.indexOf('b');
		
		if(startIndex == 0 || startIndex == 1) {
			
			resultBool = true;
			
		} else resultBool = false;
		
		return resultBool;
	}
}
