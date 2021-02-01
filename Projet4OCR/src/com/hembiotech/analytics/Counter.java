package com.hembiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
/**
 * Anything that will count each symptoms  from a list
 * The important part is, the return value from the operation, which is a map of strings (symptoms) and integer(counting)
 * It must not contain duplications
 * 
 * The implementation does not need to order the map
 * @author Amina Mounir
 */

public class Counter {
	

	 public static void countSymptoms(ArrayList<String> list, Map<String, Integer> counter )
			 														throws IOException 
	    { 
	        // hashmap to store the Symptoms with its number
	       
	  
	        for (String i : list) { 
	        	
	            Integer j = counter.get(i); 
	            counter.put(i, (j == null) ? 1 : j + 1); 
	            
	        } 
	        
	        // displaying the number of symptoms in the array list 
	        for (Map.Entry<String, Integer> val : counter.entrySet()) {
	        	
	            System.out.println(val.getKey() + " = " + val.getValue()); 
	           
	        }

}
}
