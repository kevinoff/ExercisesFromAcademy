package uk.ac.belfastmet.examples;

/**
 * check is String str starts with blue or red
 * @author off12066827
 *
 */
public class SeeColorExample {

	public String seeColor(String str) {
		String newString = "";
		
		if(str.startsWith("red")) {
			newString = "red";
		} else if(str.startsWith("blue")) {
			newString = "blue";
		} else newString = "";
		
		return newString;
	}
}
