package com.lockedme;

import java.util.Scanner;

public class HandleOptions 
{
	public static boolean handleWelcomeScreenInput() 
	{
		
		Scanner sc = new Scanner(System.in);
		
			try {
				MenuOption.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					FileManager.getAllFiles("directory");
					break;
				case 2:
					HandleOptions.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					return true;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
					
				}
			} 
			catch (Exception e)
			{
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		 while (true);
	

}

	public static boolean  handleFileMenuOptions() {
		
		Scanner sc = new Scanner(System.in);
		do {
		
			try {
				MenuOption.displayFileMenuOption();				
				
				int input = sc.nextInt();
				switch (input) 
				{
				case 1:
					FileManager.createFiles();
					break;
				case 2:
					FileManager.deleteFile();
					break;
				case 3:
					FileManager.searchFile();
					break;
				case 4:
					return false ;
				case 5:
					// Exit
					System.exit(0);
					System.out.println("Program exited successfully.");
					return false;
				
					
				default:
					System.out.println("Please select a valid option from above.");
				}
				
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				 e.printStackTrace();
				handleFileMenuOptions();
			}
			
		}while (true);
		
	}

}
