package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
	static final String folderpath ="E:\\Simplilearn\\Phase-1 Assessment\\Lockedme.com\\Lockedme.com\\src\\directory";

	public static void main(String[] args)
	{
		HandleOptions.handleWelcomeScreenInput();


	}
	
	public static void getAllFiles(String directory) {
		//get file names
		
		List<String> fileName = LockedMeMain.getAllFiles(folderpath);
		for (String f :fileName)
			System.out.println(f);		
	}
	public static void createFiles() {
		Scanner obj = new Scanner(System.in);
		String filename;
		int linesCount;
		List<String> content = new ArrayList<String>();
		//Read file name from user 
		System.out.println("Enter file Name:");
		filename =obj.nextLine();
		//Read number of lines from user
		System.out.println("Enter how many lines in the file:");
		linesCount=Integer.parseInt(obj.nextLine());
		//Read line from user 
		for (int i = 1;i<=linesCount;i++)
		{
			System.out.println("Enter line "+i+":");
			content.add(obj.nextLine());	
		}
		//save the content into the file
		boolean isSaved = LockedMeMain.createFiles(folderpath, filename, content);
		if(isSaved)
			System.out.println("File and data saved successfully");
		else
			System.out.println("some error occured .please contact admin@123.com");
		//close scanner object
		obj.close();
	}
	public static void deleteFile() {
		String fileName;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter file name to be deleted:");
		fileName = obj.nextLine();
		boolean isDeleted = LockedMeMain.deleteFile(folderpath, fileName);
		if(isDeleted)
			System.out.println("File deleted sucessfully");
		else
			System.out.println("Enter file not there or some access issuse");
	}
	public static void searchFile() 
	{
		//code for searching a file
				String fileName;
				Scanner obj = new Scanner(System.in);
				System.out.println("Enter file name to be searched:");
				fileName = obj.nextLine();
				boolean isFound = LockedMeMain.searchFile(folderpath, fileName);
				if(isFound)
					System.out.println("File is present in the folder");
				else
					System.out.println(" file is not present in te folder");
	}
}
