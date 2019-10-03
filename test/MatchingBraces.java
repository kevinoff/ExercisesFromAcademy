package uk.ac.belfastmet.test;

public class MatchingBraces {

	/**
	 * braces to handle all given strings, not just the tests.
	 * 
	 * the logic is that if an open brace is at the start, the next brace should be the correct closing brace
	 * but if not, the closing brace should be 2 positions later, if not then 2 positions later and so on until its found
	 * this increment of 2 can be checked until the end of a given String
	 * 
	 * once the match has been found go to index 2 and run the same checks and find its match
	 * if index 2 is a closing brace it will increment to the next opening brace before starting its search again
	 * each time a match is found im adding 1 to kept track of how many matches ive found
	 * 
	 * at the end ill check no. of matches against the length of string divided by 2, 
	 * these numbers should be the same. return "balanced" if they are, else "not balanced"
	 * 
	 * @author off12066827
	 *
	 */

	public static String balancedBrackets(String str) {

		String result = ""; 
		int evenSpaceIncrement = 3;
		int noOfmatchedBrackets = 0;
		boolean areBracketsMatching = false;
		boolean exitLoop = false;

		int closeCurl= 0;
		int openCurl = 0;
		int closeCurve = 0;
		int openCurve = 0;
		int closeSq = 0;
		int openSq = 0;

		//if even number enter the statement else return "not balanced"
		if(str.length() % 2 == 0) {

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

			//if there are even numbers of open and closing braces then check inside
			if((openCurl == closeCurl) && (openCurve == closeCurve) && (openSq == closeSq)) {

				//if string starts with closed bracket or ends in open bracket return "not balanced"
				if(str.startsWith("]") || str.startsWith("}") || str.startsWith(")")) {
					result = "not balanced";
				}
				else if(str.endsWith("[") || str.endsWith("{") || str.endsWith("(")) {
					result = "not balanced";
				}
				else {

					//if string looks good, lets check the middle of it for matches
					for(int index = 0; index < str.length(); index++) {
						evenSpaceIncrement = 3;
						areBracketsMatching = false;
						exitLoop = false;


//** start of if. all other ifs follow the same logic ****************************************************************************************

						//checking if index is ( and a matched ) is available somewhere in the rest of the string
						if((str.charAt(index) == '(')) {

							//if the next character is the closing brace then increment noOfMatchedBrackets by 1
							if(str.charAt(index+1) == ')') {
								noOfmatchedBrackets++;
								areBracketsMatching = true;

								// else if not matched check every increment of 2 from index+1 for matching brace
								// will stop incrementing just before index out of bounds and exit if nothing found
							} else if(str.charAt(index+1) != ')') {


								while (!areBracketsMatching && !exitLoop) {
									if(str.charAt(index+evenSpaceIncrement) == ')') {
										noOfmatchedBrackets++;
										areBracketsMatching = true;

										//only increment if it doesn't cause index out of bounds
									}  else if((index+evenSpaceIncrement+2) <= (str.length()-1)) {
										evenSpaceIncrement+=2;

										//exit loop if next increment is going out of bounds,
										//this means we have reached the end of str.length
									} else exitLoop = true;
								}
							}
						}                                              
//** end of if. all other ifs follow the same logic *******************************************************************************************


						//checking if index is [ and a matched ] is available somewhere in the rest of the string
						if((str.charAt(index) == '[')) {

							if(str.charAt(index+1) == ']') {
								noOfmatchedBrackets++;
								areBracketsMatching = true;

							} else if(str.charAt(index+1) != ']') {

								while (!areBracketsMatching && !exitLoop) {
									if(str.charAt(index+evenSpaceIncrement) == ']') {
										noOfmatchedBrackets++;
										areBracketsMatching = true;

									} else if((index+evenSpaceIncrement+2) <= (str.length()-1)) {
										evenSpaceIncrement+=2;

									} else exitLoop = true;
								}

							}

						}

						//checking if index is { and a matched } is available somewhere in the rest of the string
						if((str.charAt(index) == '{')) {

							if(str.charAt(index+1) == '}') {
								noOfmatchedBrackets++;
								areBracketsMatching = true;

							} else if(str.charAt(index+1) != '}') {

								while (!areBracketsMatching && !exitLoop) {
									if(str.charAt(index+evenSpaceIncrement) == '}') {
										noOfmatchedBrackets++;
										areBracketsMatching = true;

									} else if((index+evenSpaceIncrement+2) <= (str.length()-1)) {
										evenSpaceIncrement+=2;

									} else exitLoop = true;
								}

							}

						}

						//noOfMatches should equal half of the string length
						//this shows that all open braces found a closed brace
						if(noOfmatchedBrackets == str.length()/2) {
							result = "balanced";
						} else result = "not balanced";
					}

				}
			}//end of checking if all open braces have a matching close, before checking the characters specifically
			else result = "not balanced";
		}
		else result = "not balanced";

		return result;
	}

}