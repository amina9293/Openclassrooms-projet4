package com.hembiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	public static void main(String[] args) throws Exception {
		
		
		//list to store all the symptoms
		ArrayList<String> listSymptoms = new ArrayList<String>();
		
		// String to store the file path 
		String file = "/Users/macbook/git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt";
		
		//Map to store the symptoms with their values
		Map<String, Integer> counter = new HashMap<String, Integer>();
		
	    //CLASS 1 : read the file and put it in a list
	    ReadDocument.Reader(file, listSymptoms);
	        
	    //CLASS 2 : count the number of each symptoms and sort them in order
	    Counter.countSymptoms(listSymptoms, counter); 
	        
	    //CLASS 3 : Generate a new file 
	    CreateFile.newFile(counter);  
	        
	        
	       
	}             
}        








  
