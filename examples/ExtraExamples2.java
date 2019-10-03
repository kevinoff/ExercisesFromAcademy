package uk.ac.belfastmet.examples;

/**
 * class of additional string modifier examples
 * @author off12066827
 *
 */
public class ExtraExamples2 {

	public static void main(String[] args) {
		
		ExtraExamples2 exE = new ExtraExamples2();
		String newString = exE.everyNth("Hello", 2);
		System.out.println(newString);
		
		String newString2 = exE.everyNth("abcde", 2);
		System.out.println(newString2);
		
		String newString3 = exE.everyNth("abcdefgh", 3);
		System.out.println(newString3);
		
		if((newString.equals("Hlo")) && (newString2.equals("ace")) && (newString3.equals("adg"))) {
			System.out.println("success");
		} else System.out.println("not success or code broke");
	}
	
	/**
	 * print every nth character
	 * @param notMade
	 * @param i
	 * @return
	 */
	public String everyNth(String notMade, int i) {

		String made = "";
		
		for(int index = 0; index < notMade.length(); index+=i) {
			
			made += notMade.charAt(index);
			
		}
		
		return made;
	}
	
}