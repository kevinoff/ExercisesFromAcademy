package uk.ac.belfastmet.examples;

import java.util.ArrayList;

/**
 * class with examples statements and functions
 * @author off12066827
 *
 */
public class Examples {

	int a = 4;
	int b = 5;

	public static void main(String[] args) {

		Examples examples = new Examples();
		
		ArrayList<String> outcomeArrList = examples.returnArrList();
		
		// commented code to stop other methods calling
		//int outcomeMultiply = examples.returnMultipleInt(2, 4);
		//boolean outcome = examples.returnSomething();
		//examples.switchStringStatement();
		//examples.switchStatement();
		//examples.doWhileConditions();
		//examples.whileConditions();
		//examples.forConditions();
		//examples.ifConditions();
		
		System.out.println(outcomeArrList);
	}
	
	/**
	 * add to array list and return list
	 * @return
	 */
	public ArrayList<String> returnArrList(){
		ArrayList<String> strArrList = new ArrayList<String>();
		
		strArrList.add("Hello");
		strArrList.add("World");
		return strArrList;
	}

	/**
	 * take 2 ints and return the sum when multiplied
	 * @param a
	 * @param b
	 * @return
	 */
	public int returnMultipleInt(int a, int b) {
	
		int result = a * b;
		return result;
		
	}
	
	/**
	 * 
	 * @return boolean result
	 */
	public boolean returnSomething() {
		
		boolean result = false;
		return result;
	}
	
	
	/**
	 * switch case statement examples
	 */
	public void switchStringStatement() {

		String s = "Lundi";

		switch(s) {

			case "Monday":
				System.out.println(s + " is equal to Monday");
			break;
			case "Tuesday":
				System.out.println(s + " is equal to Tuesday");
			break;
			case "Wednesday":
				System.out.println(s + " is equal to Wednesday");
			break;
			case "Thursday":
				System.out.println(s + " is equal to Thursday");
			break;
			case "Friday":
				System.out.println(s + " is equal to Friday");
			break;
			case "Saturday":
				System.out.println(s + " is equal to Saturday");
			break;
			case "Sunday":
				System.out.println(s + " is equal to Sunday");
			break;
			default:
				System.out.println(s + " does not equal a day of the week.");
			break;
		}
	}

	/**
	 * switch statement examples
	 */
	public void switchStatement() {

		int day = 0;

		switch (day) {

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("defaulted");
			break;

		}
	}

	/**
	 * do while statement examples
	 */
	public void doWhileConditions() {
		int index = 0;

		do {
			System.out.println(index);
			index++;

		} while(index < 10);
	}

	/**
	 * while statement examples
	 */
	public void whileConditions() {

		int i = 0;
		while(i<5) {

			System.out.println(i);
			i++;
		}
	}

	/**
	 * for statement examples
	 */
	public void forConditions() {

		int index;

		for(index = 10; index >= 0; index--) {
			System.out.println("index: " + index);
		}
	}

	/**
	 * if statement examples
	 */
	public void ifConditions() {

		if(a == b) {
			System.out.println("A equals B");
		} else {
			System.out.println("false");
		}

		if(a < b) {
			System.out.println("A is less than B");
		} else {
			System.out.println("false");
		}

		if(a > b) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("false");
		}

		if(a <= 4) {
			System.out.println("A is less than or equal to 4");
		} else {
			System.out.println("false");
		}

		if(b >= 6) {
			System.out.println("B is greater than or equal to 6");
		} else {
			System.out.println("false");
		}

		if(a != b) {
			System.out.println("A is not equal to B");
		} else {
			System.out.println("false");
		}

		if(a > b || a < b) {
			System.out.println("A is greater than B OR A is less than B");
		} else {
			System.out.println("false");
		}

		if(3 < a && a < 6) {
			System.out.println("3 is less than a AND a is less than 6");
		} else {
			System.out.println("false");
		}
	}

}
