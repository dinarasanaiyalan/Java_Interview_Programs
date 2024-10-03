package com.dinatechy.challange;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) throws IOException {
		
		// data transfer
		// to make the data transfer more effective manner
		// It convert's object into stream(sequence of data)
		// we need to inherit the Serializable interface
		
		Student std = new Student();
		std.setId(101);
		std.setName("Dina");
		
		File file = new File("D://Sample/Student.txt");
		
		if(!file.exists()) {
			if(file.createNewFile()) {
				ObjectOutputStream output = 
						new ObjectOutputStream(new FileOutputStream(file));
				output.writeObject(std);
				output.close();
				System.out.println("Success");
			}
		}
		
	}

}
