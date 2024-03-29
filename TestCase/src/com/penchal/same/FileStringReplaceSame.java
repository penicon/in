package com.penchal.same;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

///Same file - Same Name - Same Location - Same Format (Without create file name on console)


public class FileStringReplaceSame {
	public static void main(String args[]) {
		try {
			
			String line = "", oldText = ""; int content;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter File Name and Location :");	
			System.out.println("------------------------------");
			
			//open the file on local machine
			String localMachineFile = sc.nextLine();
			File file = new File(localMachineFile);
			
			BufferedReader reader = new BufferedReader(new FileReader(file)); //FileReader connection open
			
			// File content displaying--Start
			System.out.println("Existing text file content is :");
			System.out.println("------------------------------");
			try (FileInputStream fis = new FileInputStream(file)) {
				
				while ((content = fis.read()) != -1) {
					// convert to char and display it
					System.out.print((char) content);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			// File content displayed--End
			
			
			//search the word 		
			System.out.println("Search word in the above file content :");
			System.out.println("---------------------------------------");
			String existWord = sc.nextLine();
			
			//replace the word 
			System.out.println("'" + existWord + "'" + " is replace to -->");
			System.out.println("------------------------------------------");
			String replaceWord = sc.nextLine();

			while ((line = reader.readLine()) != null) {
				oldText += line + "\r\n";
			}
			reader.close();     //FileReader connection closed
			
			
			//business logic for replace a word in a file
			String newText = oldText.replaceAll(existWord, replaceWord);

			//the replaced content will be saved on same location and same file
			FileWriter writer = new FileWriter(localMachineFile); 
			
			//Directory creation
			
			writer.write(newText);
			
			System.out.println("'" + existWord + "'" + " is replaced to " + "'" + replaceWord + "'"
					+ " into the file.The updated content of the file is : ");
			System.out.println("-----------------------------------------------------------------");
			
			//replaced content display			
			System.out.println(newText);
			
			
			writer.close(); // FileWriter connection is closed

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
