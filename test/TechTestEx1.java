package uk.ac.belfastmet.test;

public class TechTestEx1 {

	  /**
	  * method to add all integer multiples of 3 and 5 below a given number
	  */
	  public int solution(int number) {
	    //initialise the result i want to return
	    int sumOfMulitples = 0;
	    
	    //for every int less than given number
	    for(int currentNumber = 1; currentNumber < number; currentNumber++){
	      
	      //if the are multple of 5 and 3, just 5 or just 3 then add them to the result
	      if(((currentNumber % 5 == 0) && (currentNumber % 3 == 0)) || (currentNumber % 5 == 0) || (currentNumber % 3 == 0)){
	        
	        sumOfMulitples += currentNumber;
	      }   
	    }
	   
	    //return the result
	    return sumOfMulitples;
	  }
	}
