package uk.ac.belfastmet.examples;

public class StringCat {

	private String word1;
	private String word2;
	
	public static String concatenated(String str1, String str2) {
		return str1 + str2;
	}
	
	public StringCat() {
		super();
	}

	public StringCat(String word1, String word2) {
		super();
		this.word1 = word1;
		this.word2 = word2;
	}
	
	public String getWord1() {
		return word1;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}

	public String getWord2() {
		return word2;
	}

	public void setWord2(String word2) {
		this.word2 = word2;
	}

}
