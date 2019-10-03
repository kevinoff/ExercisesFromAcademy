package uk.ac.belfastmet.examples;

/**
 * class handles all given tests
 * @author off12066827
 *
 */
public class BalancedBracketsEx2 {
	
	public static String balancedBrackets(String str) {
		
		String result = "";
		
		int closeCurl= 0;
		int openCurl = 0;
		int closeCurve = 0;
		int openCurve = 0;
		int closeSq = 0;
		int openSq = 0;
		
		
		if(str.length()%2 == 0) {
			
			if(str.startsWith("]") || str.startsWith("}") || str.startsWith(")")) {
				result = "not balanced";
			}
			else if(str.endsWith("[") || str.endsWith("{") || str.endsWith("(")) {
				result = "not balanced";
			}
			else {
				
				for(int index = 0; index < str.length(); index++) {
					
					if(str.charAt(index) == '{') {
						openCurl++;
					} else if(str.charAt(index) == '}') {
						closeCurl++;
					} else if(str.charAt(index) == '(') {
						openCurve++;
					} else if(str.charAt(index) == ')') {
						closeCurve++;
					} else if(str.charAt(index) == ']') {
						closeSq++;
					}
					else if(str.charAt(index) == '[') {
						openSq++;
					}
					
				}
				
				if((openCurl == closeCurl) && (openCurve == closeCurve) && (openSq == closeSq)) {
					result = "balanced";
				} else result = "not balanced";
								
			}
			
		} else result = "not balanced";
		
		return result;
	}

}
