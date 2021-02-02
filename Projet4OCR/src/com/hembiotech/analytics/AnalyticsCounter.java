package com.hembiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * A class that gathers many classes
 * One that will read a file
 * The second that will count each Symptoms with their value and store them into a Map
 * The third that will generate a file with each symptoms and their value sorted by alphabetical order
 * @author Amina Mounir
 * @param listSymptoms : a list that store all the symptoms
 * @param file : a string variable that store the file path
 * @param counter : a map that store each symptoms with their values
 * 
 */
public class AnalyticsCounter {
	public static void main(String[] args) throws Exception {
		
		
		//list to store all the symptoms
		ArrayList<String> listSymptoms = new ArrayList<String>();
		
		// String to store the file path 
		String file = "symptoms.txt";
		
		//Map to store the symptoms with their values
		Map<String, Integer> counter = new HashMap<String, Integer>();
		
	    //CLASS 1 : read the file and put it in a list
	    ReadDocument.Reader(file, listSymptoms);
	        
	    //CLASS 2 : count the number of each symptoms and sort them in order
	    Counter.countSymptoms(listSymptoms, counter); 
	        
	    //CLASS 3 : Generate a new file and sort it by alphabetical order
	    CreateFile.newFile(counter);  
	        
	        
	       
	}             
}        








  
