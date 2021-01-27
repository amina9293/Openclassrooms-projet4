package com.hembiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Counter {
	

	 public static void countSymptoms(ArrayList<String> list, Map<String, Integer> counter ) throws IOException 
	    { 
	        // hashmap to store the Symptoms with its number
	       
	  
	        for (String i : list) { 
	        	
	            Integer j = counter.get(i); 
	            counter.put(i, (j == null) ? 1 : j + 1); 
	            
	        } 
	        
	        /*
	        // Create a TreeMap to sort the symptoms
	        TreeMap<String, Integer> sortedSymptoms = new TreeMap<>();
	        sortedSymptoms.putAll(counter);

	        
	        // displaying the number of symptoms in the array list 
	        for (Map.Entry<String, Integer> val : sortedSymptoms.entrySet()) {
	        	
	            System.out.println(val.getKey() + " = " + val.getValue()); 
	           
	        }*/

}
}