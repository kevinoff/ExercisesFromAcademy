package uk.ac.belfastmet.test;

import uk.ac.belfastmet.test.*;

public class TechTestEx2 {
    
  /**
  * method accepts a String braces and calculates number of all types opening and closing 
  * returns number of matches, or -1 if there is an unmatched brace or 0 if the string is empty
  */  
  public static Integer numberOfBracePairs( String braces ) {
    
    //initialise the result i want to return
    int numberOfPairs = 0;
    
    //initialise counters for each brace type
    int noOfOpenCurly = 0;
    int noOfCloseCurly = 0;
    int noOfOpenCurved = 0;
    int noOfCloseCurved = 0;
    int noOfOpenSquare = 0;
    int noOfCloseSquare = 0;
    
    //loop to check every character of braces and increase its type counter by one
    for(int index = 0; index < braces.length(); index++){
      
      if(braces.charAt(index) == '{'){
            noOfOpenCurly++;
        } else if(braces.charAt(index) == '}'){
            noOfCloseCurly++;
        } else if(braces.charAt(index) == '('){
            noOfOpenCurved++;
        } else if(braces.charAt(index) == ')'){
            noOfCloseCurved++;
        } else if(braces.charAt(index) == '['){
            noOfOpenSquare++;
        } else if(braces.charAt(index) == ']'){
            noOfCloseSquare++;
        }
      }
    
    //if braces is less than 1 then there are no matches, empty string
    if(braces.length() < 1){
      
      numberOfPairs = 0;
      
    } else {
      
      //if equal to then its a matching pair
      if((noOfOpenCurly == noOfCloseCurly) && (noOfOpenCurved == noOfCloseCurved) && (noOfOpenSquare == noOfCloseSquare)){
      
        numberOfPairs = noOfOpenCurly + noOfOpenCurved + noOfOpenSquare;
      
      } else numberOfPairs = -1;
    }

    return numberOfPairs;
  }

}