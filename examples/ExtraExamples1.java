package uk.ac.belfastmet.examples;

/**
 * class of additional examples
 * @author off12066827
 *
 */
public class ExtraExamples1 {

	public static void main(String[] args) {
		
		ExtraExamples1 exE = new ExtraExamples1();
		
		int returnedInt = exE.countXX("abcxx");
		int returnedInt1 = exE.countXX("xxx");
		int returnedInt2 = exE.countXX("xxxx");
		
		if(returnedInt == 5 && returnedInt1 == 3 && returnedInt2 == 4) {
			System.out.println("it all worked");
		}
		
	}
	
	/**
	 * return length of String text
	 * @param text
	 * @return
	 */
	public int countXX(String text) {
		
		int count = text.length();
		return count;
	}
	
	/**
	 * method finds the number of X characters in a String if called
	 */
	
	public int countXXX(String text) {
	
	int count = 0;
	int index = 0;
	char[] charArr = text.toCharArray();
	
	for(index = 0; index < text.length(); index++) {
		if(charArr[index] == 'x'){
			count++;
		}
	}
	
	return count;
}
	
}
