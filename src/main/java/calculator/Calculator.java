package calculator;

import java.util.*;

public class Calculator{
	public static void main(String args[])
	{
		System.out.println("CALCULATOR");
		
		int choice,flag=0;
		double operand1,operand2;
		Scanner scanner= new Scanner(System.in);
		
		do
		{
			System.out.println("Option Menu");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			
			choice=scanner.nextInt();
			if(choice==5)
				flag=1;
			else
			{
				System.out.println("Enter 2 numbers");
				System.out.println("First operand:");
				operand1=scanner.nextDouble();
				System.out.println("Second operand:");
				operand2=scanner.nextDouble();
				
				switch(choice)
				{
					case 1:
						System.out.println(operand1+operand2);
						break;
					case 2:
						System.out.println(operand1-operand2);
						break;
					case 3:
						System.out.println(operand1*operand2);
						break;
					case 4:
						if(operand2==0)
							System.out.println("Please enter non zero number");
						System.out.println(operand1/operand2);
						break;
					default:
						System.out.println("Exiting program");
						flag=1;
				}
			}
			System.out.println("");
		}while(flag==0);
	}
	}
					
				

