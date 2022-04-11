package my_Package;

import java.util.Scanner;

public class Class_1 {

	public static void main(String[] args) {
	 //Scanner sc= new Scanner(System.in);
	 //System.out.println("Enter the number");

		for(int i=1;i<=4;i++) 
		{
			
			for(int j=1;j<=i;j++) {
				if(j%2==0)
			System.out.print("><<>");
				else
					System.out.print("<>");
				}
			
			System.out.println("");

			
		}
	}

}
