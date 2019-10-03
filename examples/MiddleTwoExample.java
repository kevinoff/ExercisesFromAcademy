package uk.ac.belfastmet.examples;


/**
 * methods to concat strings
 * @author off12066827
 *
 */
public class MiddleTwoExample {

	
	/**
	 * check middle two characters of an even numbered string
	 * @param str
	 * @return
	 */
	public String middleTwo(String str) {

		String resultString = "";
		String p1 = "";
		String p2 = "";

		String subStr1 = str.substring(0, str.length()/2);

		String subStr2 = str.substring(str.length()/2, str.length());

		p1 = subStr1.charAt(subStr1.length()-1) + "";
		p2 = subStr2.charAt(0) + "";

		resultString = p1+p2;


		return resultString;
	}
}
