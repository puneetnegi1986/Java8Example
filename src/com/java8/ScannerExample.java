package com.java8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (
				FileInputStream inputStream = new FileInputStream("file Path");
				Scanner  sc = new Scanner(inputStream, "UTF-8")){
				while (sc.hasNextLine()) {
			        String line = sc.nextLine(); 
			        System.out.println(line);
			    }
		}
	}

}
