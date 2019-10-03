package uk.ac.belfastmet.examples;

/**
 * class to test return methods
 * @author off12066827
 *
 */
public class ExtraExamples {
	
	/**
	 * finding if one temperature is less than 0 and the other is greater than 100
	 * @param tempA
	 * @param tempB
	 * @return boolean
	 */
	public boolean icyHot(int tempA, int tempB) {
		
		boolean isTrue = false;
		
		if((tempA < 0 && tempB > 100) || (tempA > 100 && tempB < 0)) {
			
			isTrue = true;
		}
		
		return isTrue;
	}
}
