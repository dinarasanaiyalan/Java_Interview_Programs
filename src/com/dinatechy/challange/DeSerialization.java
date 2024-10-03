package com.dinatechy.challange;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DeSerialization {
	//Stream to object conversion
	
	public static void main(String[] args) {
		
		File file = new File("D://Sample/Student.txt");
		
		try {
			//Open
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
			Student std = (Student) input.readObject();
			System.out.println(std.getId()+" "+std.getName());
			input.close();
			//Close
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
