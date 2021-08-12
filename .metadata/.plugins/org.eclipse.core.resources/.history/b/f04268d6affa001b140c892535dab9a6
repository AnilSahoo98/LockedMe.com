package com.lockedme;

import java.util.Scanner;

public class HandleOptions 
{
	public static boolean handleWelcomeScreenInput() 
	{
		do { //Using While Condition for Displaying Option
		
			try {	
				Scanner sc = new Scanner(System.in);
				int input;
				MenuOption.displayMenu();
				input = Integer.parseInt(sc.nextLine()); //Taking Input from the user
				switch (input) {
				case 1:
					FileManager.getAllFiles("directory"); //Display files in the directory
					break;
				case 2:
					HandleOptions.handleFileMenuOptions(); //option to add,delete,search
					break;
				case 3:
					System.out.println("Program exited successfully."); //exit the program
					return true;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");//In case of invailed Entery   
					
				}
			} 
			catch (Exception e)
			{
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
			
		}while (true);
		
	

}

	public static boolean  handleFileMenuOptions() { //Option to add,delete,search the file
		
		Scanner sc = new Scanner(System.in);
		do {
		
			try {
				MenuOption.displayFileMenuOption();				
				
				int input = Integer.parseInt(sc.nextLine());; //user input option
				switch (input) 
				{
				case 1:
					FileManager.createFiles(); //Create a file 
					break;
				case 2:
					FileManager.deleteFile(); // delete the file from the directory
					break;
				case 3:
					FileManager.searchFile(); // search the file from the directory
					break;
				case 4:
					return false ; //return to the previous Menu
				case 5:
					// Exit
					System.exit(0);
					System.out.println("Program exited successfully."); //exit the program
					return false;
				
					
				default:
					System.out.println("Please select a valid option from above.");
				}
				
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				 e.printStackTrace();
//				handleFileMenuOptions();
			}
			
		}while (true);
		
	}

}
