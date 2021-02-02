package com.hembiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * @author Amina Mounir
 *
 * 
 */

public class ReadDocument {
	public static void Reader(String document, ArrayList<String> listSymptoms) 
															throws IOException {
		
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
