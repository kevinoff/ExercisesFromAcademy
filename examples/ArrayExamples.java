package uk.ac.belfastmet.examples;

import java.util.ArrayList;

/**
 * a class of methods to manipulate Strings
 * @author off12066827
 *
 */
public class ArrayExamples {

	public static void main(String[] args) {
		
		ArrayExamples arrExamples = new ArrayExamples();
		
		boolean outcomeIsEmpty = arrExamples.isEmptyList();
		//comments to stop methods being called
		//boolean outcomeArrList = arrExamples.containsString("Good"); 
		//arrExamples.containsString();
		//arrExamples.addStringToArrList();
		
		System.out.println(outcomeIsEmpty);

	}
	
	/**
	 * check is the String empty
	 * @return
	 */
	public boolean isEmptyList() {
		
		ArrayList<String> strArrList = new ArrayList<String>();
		strArrList.add("Good");
		boolean boolIsEmpty = strArrList.isEmpty();
		
		return boolIsEmpty;
		
	}
	
	/**
	 * remove a given word "Good" from a String
	 * @param string
	 * @return
	 */
	public boolean containsString(String string) {
		
		ArrayList<String> strArrList = new ArrayList<String>();
		strArrList.add("Good");
		strArrList.add("Morning");
		
		boolean didItRemove = strArrList.remove("Good");
		
		return didItRemove;
	}
	
	/**
	 * add Strings to a String
	 */
	public void addStringToArrList() {
		
		ArrayList<String> strArrList = new ArrayList<String>();
		strArrList.add("Good");
		strArrList.add("Morning");
		strArrList.add("Size of array: " + strArrList.size());
		
		for(int index = 0; index < strArrList.size(); index++) {
			
			String currIndex = strArrList.get(index);
			System.out.println(currIndex);
		}
	}

}
