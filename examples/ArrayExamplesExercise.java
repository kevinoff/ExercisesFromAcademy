package uk.ac.belfastmet.examples;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * class to testing passing and returning arraylists and booleans
 * @author off12066827
 *
 */
public class ArrayExamplesExercise {

	public static void main(String[] args) {
		
		ArrayExamplesExercise arrEx = new ArrayExamplesExercise();

		ArrayList<String> arrStr = arrEx.beginArr();
		System.out.println("arraylist contains: " + arrStr);
		
		ArrayList<String> arrStr2 = arrEx.addToArr(arrStr);
		System.out.println("arraylist contains: " + arrStr2);
		
		boolean outcomeIsRemoved = arrEx.removeEle(arrStr2);
		System.out.println("is elephant remove: " + outcomeIsRemoved);
		
		boolean outcomeIsAllRemoved = arrEx.removeAllFromArr(arrStr2);
		System.out.println("is the array empty: " + outcomeIsAllRemoved);
	}
	
	/**
	 * creating an ArrayList
	 * @return
	 */
	public ArrayList<String> beginArr () {
		
		ArrayList<String> arrStr = new ArrayList<String>(Arrays.asList("Elephant", "Rhino", "Lion"));

		return arrStr;
	}
	
	/**
	 * add new elements to ArrayList
	 * @param strArr
	 * @return
	 */
	public ArrayList<String> addToArr(ArrayList<String> strArr) {
		
		strArr.add("Dog");
		strArr.add("Cat");
		
		return strArr;
	}
	
	/**
	 * remove element and check if its removed, return true if removed else false
	 * @param strArr
	 * @return
	 */
	
	public boolean removeEle(ArrayList<String> strArr) {
		
		strArr.remove("Elephant");
		boolean isItRemoved = false;
		boolean doesItContain = strArr.contains("Elephant");
		
		if(doesItContain == false) {
			isItRemoved = true;
		}
		
		return isItRemoved;
	}
	
	/**
	 * remove all elements from arraytlist, return true if removed else false
	 * @param strArr
	 * @return
	 */
	public boolean removeAllFromArr(ArrayList<String> strArr) {
				
		strArr.removeAll(strArr);
		
		boolean isRemoveAll = strArr.isEmpty();
		
		return isRemoveAll;
		
	}

}
