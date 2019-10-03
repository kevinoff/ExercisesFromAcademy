package uk.ac.belfastmet.examples;

/**
 * coding wars exercise 
 * some unit test fails to address
 * @author off12066827
 *
 */
public class CamelCase {

	public static void main(String[] args) {

		String resultsString = camelCase("ab c");
		
		System.out.println(resultsString);
	}

	/**
	 * method puts a string into camelCase
	 * @param str
	 */
	public static String camelCase(String str) {

		int index = 1;
		int firstLIndex = 0;
		String firstLetter;
		String endString = "";
		String newString = "";
		String completeString = "";
		String[] strings = str.split(" ");
		
		for(index = 0; index<strings.length; index++) {
				
			firstLetter = strings[index].substring(0,1);
			
			firstLetter = firstLetter.toUpperCase();

			endString = strings[index].substring(firstLIndex+1,strings[index].length());
			
			newString = firstLetter + endString;

			strings[index] = newString;
			
			completeString += strings[index];
		}

		return completeString;

	}

}
