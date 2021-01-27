package com.hembiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadDocument {
	public static void Reader(String document, ArrayList<String> listSymptoms) throws IOException {
		
		//read the symptoms file and store it in a list
		
			
				//read the file
				if (document != null) {
				BufferedReader br = new BufferedReader(new FileReader(document));
				String line = br.readLine();
				while ((line = br.readLine()) != null){
					
					//see the content of the files in the console 
					System.out.println(line);
					
					// add the symptoms in the list
					listSymptoms.add(line);
			       }
					// see the list in the console
					
					System.out.println(listSymptoms);
					
			        br.close();
			        
			        
				}
	}

}
