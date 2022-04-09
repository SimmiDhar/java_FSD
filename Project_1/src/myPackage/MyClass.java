package myPackage;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
        
		String name;
		int Score=0,answer;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name");
		name = sc.nextLine();
		
		System.out.println("Hi, "+name+ "...Welcome to Quiz\n");
		System.out.println("\t******LET'S START*******\t\n");
		System.out.println("Q1 - Which of the following is not a keyword in java?\r\n"
				+ "A - static\n"
				+ "B - Boolean\n"
				+ "C - void\n"
				+ "D - private");
		answer= sc.next().charAt (0);
		
		if(answer =='B')
			Score+=2;
		  
		
		System.out.println("Q 2 - What is the size of long variable?\r\n"
				+ "A - 8 bit\n"
				+ "B - 16 bit\n"			
				+ "C - 32 bit\n"				
				+ "D - 64 bit\n");
		answer= sc.next().charAt (0);
		
		if(answer =='D')
			Score+=2;
		
		System.out.println("Q 3 - Which of these literals can be contained in a data type float variable?\r\n"
				+ "A-  1.7e-308 \n"
				+ "B-  3.4e-038 \n"
				+ "C-  1.7e+308 \n"
				+ "D-  3.4e-050");
		answer= sc.next().charAt (0);
		
		if(answer =='B')
			Score+=2;
		
		System.out.println(" Q 4 - . Which data type value is returned by all transcendental math functions?\r\n"
				+ "A. int \n"
				+ "B. float \n"
				+ "C. double \n"
				+ "D. long");
		answer= sc.next().charAt (0);
		
		if(answer =='C')
			Score+=2;
		
		System.out.println("Q 5 - Which one is a valid declaration of a boolean?\r\n"
				+ "A. boolean b1 = 1; \n"
				+ "B. boolean b2 = 'false'; \n"
				+ "C. boolean b3 = false; \n"
				+ "D. boolean b4 = 'true' \n");
		answer= sc.next().charAt (0);
		
		if(answer =='C')
			Score+=2;
		
		System.out.println(name + ",Your Total Score is :"+ Score);
		
		if(Score>5)
			System.out.println("You have passed the quiz");
		else
			System.out.println("Sorry! you didn't pass the quiz."
					+ "Better Luck Next Time.");
		
	}

}
