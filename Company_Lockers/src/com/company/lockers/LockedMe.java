package com.company.lockers;

import java.io.*;
import java.util.*;

public class LockedMe {
	static final String ProjectPath ="C:\\Users\\simra\\OneDrive\\Desktop\\java projects\\Company_Lockers\\locked me files";

	public static void main(String[] args) {
		int ch;
		do 
	{
		displayMenu();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		ch = Integer.parseInt(sc.nextLine());
		
		switch(ch) {
		
		case 1: getAllFiles();
		         break;
		case 2: createFiles();
				 break;
		case 3: deleteFiles();
		 		 break;
		case 4: searchFiles();
				 break;
		case 5: System.exit(0);
				 break;
		default: System.out.println("INVALID INPUT!, Enter the correct choice");
		}
	}
		while(ch>0);
	}
    public static void displayMenu() {
		System.out.println("\t\tWelcome to Company Lockers Pvt Ltd");
		System.out.println("\t\t\t                      -Developer Name: Simran Dhar");
		System.out.println("****************************************************************************");
		System.out.println("\t1. Display all the files");
		System.out.println("\t2. Add files to existing directory");
		System.out.println("\t3. Delete a file");
		System.out.println("\t4. Search a file");
		System.out.println("\t5. Exit");
		System.out.println("****************************************************************************");

		
	}
	public static void getAllFiles() {
		
		File[]listofFiles = new File(ProjectPath).listFiles();
		if (listofFiles.length == 0) 
		{
		 System.out.println("No files in directory");
		}
		else {
			for(var l:listofFiles) {
				System.out.println(l.getName());
			}
		}
	} 
	public static void createFiles() {
		try {
			Scanner sc= new Scanner(System.in);
			String fileName;
			int linesCount;
			
			System.out.println("Enter file name");
			fileName =sc.nextLine();
			
			System.out.println("Enter the number of lines to add in a file");
			linesCount=Integer.parseInt(sc.nextLine());
			
			FileWriter fw=new FileWriter(ProjectPath + "\\" + fileName );
			System.out.println("Enter File Content");
			for(int i=1;i<=linesCount;i++) {
				fw.write(sc.nextLine()+ "\n");
			}
		System.out.println("File Created");	
		fw.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public static void deleteFiles() {
		Scanner sc= new Scanner(System.in);
		try {
			String fileName;
			
		System.out.println("Enter the file name to be deleted");
		fileName=sc.nextLine();
		
		File fl= new File(ProjectPath + "\\" + fileName);
		if(fl.exists()) 
		{
			fl.delete();
			System.out.println("File deleted sucessfully");
		}
		
		else
		{
			System.out.println("File does not exist");
	    }
		
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public static void searchFiles() {
		Scanner sc= new Scanner(System.in);
		try {
			String fileName;
				
		System.out.println("Enter the file name to be searched");
		fileName=sc.nextLine();
		
		File fl= new File(ProjectPath + "\\" + fileName);
		if(fl.exists()) 
		{
			System.out.println("file is available");
		}
		
		else
		{
			System.out.println("File does not exist");
	    }
		
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	
}
