package uk.ac.belfastmet.examples;



/**
 * class with examples of String methods in the String class
 * @author off12066827
 *
 */
public class StringExamples {
	
	String name = "kevin";

	public static void main(String[] args) {
		StringExamples examples = new StringExamples();
		
		examples.missingChar("kitten", 3);
		
		//**commented code to stop methods calling, testing one method at a time
		//examples.sleepIn(false, true);
		//examples.lowerCaseString();
		//examples.upperCaseString();
		//examples.splitString();
		//examples.indexString();
		//examples.containsString();
		//examples.subChar();
		//examples.endChar();
		//examples.startChar();
		//examples.firstChar();
	}
	
	/**
	 * print string with missing char or chars
	 * @param s
	 * @param n
	 */
	public void missingChar(String s, int n) {
		
		String part1 = s.substring(0, n);
		String part2 = s.substring(n+1, s.length());
		System.out.println(part1 + part2);
	}
	
	/**
	 * if weekday is false OR if vacation is true, sleep in
	 * else don't sleep in
	 * @param weekDay
	 * @param vacation
	 */
	public void sleepIn(boolean weekDay, boolean vacation) {
			
		if(!weekDay || vacation) {
			System.out.println("sleep in - true");
		} else 
			System.out.println("dont sleep in - false");
	}
	
	/**
	 * string to lower case
	 */
	public void lowerCaseString() {
		
		System.out.println("name to lower case: " + name.toLowerCase());
	}
	
	/**
	 * string to upper case
	 */
	public void upperCaseString() {
		
		System.out.println("name to upper case: " + name.toUpperCase());
	}
	
	/**
	 * split string of multiple words into sub strings
	 */
	public void splitString() {
		
		int index;
		
		String sentence = "Hello World!";
		String[] strings = sentence.split(" ");
		
		for(index = 0; index<strings.length; index++) {
			
			System.out.println(strings[index]);
		}
	}
	
	/**
	 * finding index of string
	 */
	public void indexString() {
		
		int index = name.indexOf("in");
		System.out.println("in is positioned at index " + index);
	}
	
	/**
	 * finding if string contains a char or string
	 */
	public void containsString() {
		
		boolean doesContain = name.contains("ev");
		
		if(doesContain) {
			System.out.println(name + " contains ev.");
		}
	}
	
	/**
	 *  finding part of string and printing
	 */
	public void subChar() {
		
		String subString = name.substring(2, 4);
		System.out.println(subString);
	}
	
	/**
	 * check if string ends with defined char or string
	 */
	public void endChar() {
		
		boolean endsWith = name.endsWith("n");
		if(endsWith) {
			System.out.println(name + " ends with n");
		}
	}
	
	/**
	 * check if string starts with defined char or string
	 */
	public void startChar() {
		
		boolean startsWith = name.startsWith("k");
		if(startsWith) {
			System.out.println(name + " starts with k");
		}
	}
	
	/**
	 * checking char at index 0
	 */
	public void firstChar() {
		
		System.out.println(name.charAt(0));
	}
	
}
