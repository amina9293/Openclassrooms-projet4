package com.hembiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CreateFile {
	public static void newFile(Map<String, Integer> SymptomsMap) throws IOException {
	
		  // generate new file result.out
		
		//Create the file 
		
	    File newFile = new File ("result.out");
	    
	    //Write content
	    FileWriter writer = new FileWriter(newFile);
	    TreeMap<String, Integer> sortedSymptoms = new TreeMap<>();
        sortedSymptoms.putAll(SymptomsMap);

	    for (Map.Entry<String, Integer> val : sortedSymptoms.entrySet()) {
        	
            writer.write(val.getKey() + " = " + val.getValue() );
            writer.write(System.lineSeparator());
            System.out.println(val.getKey() + " = " + val.getValue()); 
	}
	    writer.flush();
	    writer.close();
	   
	    
	    
	    
	    	

	}
}