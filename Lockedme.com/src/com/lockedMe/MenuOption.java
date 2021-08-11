package com.lockedme;

import java.util.Scanner;

public class MenuOption {
	public static void displayMenu(){
		Object appName = "Lockedme";
		Object developerName = "Anil Sahoo" ;
		String companyDetails = String.format("*****************************************************\n"+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"+ "*****************************************************\n", appName, developerName);String appFunction = "You can use this application to :-\n"+ "� Retrieve all file names in the \"Director\" folder\n"+ "� Search, add, or delete files in \"Director\" folder.\n"+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
		
		String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"+ "1) Retrieve all files inside \"directory\" folder\n" + "2) Display menu for File operations\n"+ "3) Exit program\n";
		
		System.out.println(menu);
		System.out.println("Enter The Option");
		
	}
	public static void displayFileMenuOption() {
		String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
		System.out.println("Enter the option number:");
		
	}
	public static void FileMenuOptions() {
		
	}
}
