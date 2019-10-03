package uk.ac.belfastmet.examples;

public class HelloNameEx {

	private static String helloStr = "Hello ";
	private static String exclaim = "!";
	
	public static String helloName(String name) {
		String result = "";
		
		result = helloStr + name + exclaim;
		
		return result;
	}
	
}
