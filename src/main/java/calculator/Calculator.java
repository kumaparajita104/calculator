package calculator;

import java.util.*;
public class Calculator {

	public static void main(String[] args){
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
			System.out.println("5. Power");
			System.out.println("6. Natural Log");
			System.out.println("7. Square Root");
			System.out.println("8. Factorial");
			System.out.println("9. Exit");
			System.out.println("Enter your choice");
			
			choice=scanner.nextInt();
			if(choice==9)
				flag=1;
			else
			{
				
				
				switch(choice)
				{
					case 1:
						System.out.println("Enter 2 numbers");
						System.out.println("First operand:");
						operand1=scanner.nextDouble();
						System.out.println("Second operand:");
						operand2=scanner.nextDouble();
						System.out.println(add(operand1,operand2));
						break;
					case 2:
						System.out.println("Enter 2 numbers");
						System.out.println("First operand:");
						operand1=scanner.nextDouble();
						System.out.println("Second operand:");
						operand2=scanner.nextDouble();
						System.out.println (subtract(operand1,operand2));
						break;
					case 3:
						System.out.println("Enter 2 numbers");
						System.out.println("First operand:");
						operand1=scanner.nextDouble();
						System.out.println("Second operand:");
						operand2=scanner.nextDouble();
						System.out.println (multiply(operand1,operand2));
						break;
					case 4:
						System.out.println("Enter 2 numbers");
						System.out.println("First operand:");
						operand1=scanner.nextDouble();
						System.out.println("Second operand:");
						operand2=scanner.nextDouble();
						
						System.out.println(divide(operand1,operand2));
						break;
					case 5:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + power(base, exponent));
                break;
            case 6:
                System.out.print("Enter number: ");
                double num = scanner.nextDouble();
                System.out.println("Result: " + naturalLog(num));
                break;
            case 7:
                System.out.print("Enter number: ");
                double number = scanner.nextDouble();
                System.out.println("Result: " + squareRoot(number));
                break;
            case 8:
                System.out.print("Enter number: ");
                int n = scanner.nextInt();
                System.out.println("Result: " + factorial(n));
                break;
		default:
			System.out.println("Exiting program");
			flag=1;
				}
			}
			System.out.println("");
		}while(flag==0);
	}

	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double subtract(double a, double b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		double result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
	}
	public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Method to calculate natural logarithm
    public static double naturalLog(double num) {
        return Math.log(num);
    }

    // Method to calculate square root
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
					
				

