package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeProject {
	static final String folderpath ="E:\\Simplilearn\\Phase-1 Assessment\\Lockedme.com\\Lockedme.com\\src\\directory";

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String fileName;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter file name to be deleted:");
		fileName = obj.nextLine();
		boolean isDeleted = FileManager.deleteFile(folderpath, fileName);
		if(isDeleted)
			System.out.println("File deleted sucessfully");
		else
			System.out.println("Enter file not there or some access issuse");

		
		
		
	
		 
//		
	}
}