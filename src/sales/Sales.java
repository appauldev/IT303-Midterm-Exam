package sales;

import java.util.Arrays;
import java.util.Scanner;

public class Sales {
	private static Scanner sc = new Scanner(System.in);
	private static int getInt() {
		int input = 0;
		try {
			input = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return input;
	}
	
	private static double getDouble() {
		double input = 0.0;
		try {
			input = sc.nextDouble();
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return input;
	}

	private static void fib(int input) {
		// initialize the required variables
		int fib0 = 0, fib1 = 1;
		int fib_sum = 0;
		// compute the fibonacci for the input
		for(int i = 0; i <= input; i++) {
			// print the values of the base cases 0 and 1
			if(i == 0 || i == 1) {
				System.out.print(i + " ");
				continue;
			}
			// compute the fibonaccie of inputs 2 and up
			fib_sum = fib0 + fib1; // current fib is the sum of the two previous fib values
			System.out.print(fib_sum + " "); // print the current fib value
			fib0 = fib1; // first fib value is now the second fib value
			fib1 = fib_sum; // second fib value is now the current fib value
		}
	}
	
	private static void factorial(int input) {
		int product = 1;
		for(int i = 0; i <= input; i++) {
			if(i == 0 || i == 1) {
				continue;
			}
			product *= i;
		}
		System.out.printf("factorial(%d) is %d", input, product);
	}
	
	private static void summation(int input) {
		// initialize the input array
		double[] arr_input = new double[input];
		double sum = 0;
		// get the input
		for (int i = 0; i < arr_input.length; i++) {
			System.out.printf("Input %d: ", i + 1);
			arr_input[i] = getDouble();
		}
		// get the sum
		for (double d : arr_input) {
			// add if and only if d is positive, hence, 0 is excluded
			if(d > 0) {
				sum += d;
			}
		}
		System.out.printf("The sum of %s is %.3f", Arrays.toString(arr_input), sum);
	}

	public static void main(String[] args) {
		System.out.println("+++++++++++++");
		System.out.println("| Fibonacci |:");
		System.out.println("+++++++++++++");
		System.out.print("Enter an integer input: ");
		int i = getInt();
		fib(i);
		
		System.out.println();
		System.out.println("+++++++++++++");
		System.out.println("| Factorial |:");
		System.out.println("+++++++++++++");
		System.out.print("Enter an integer input: ");
		int n = getInt();
		factorial(n);
		
		System.out.println();
		System.out.println("+++++++++++++");
		System.out.println("| Summation |:");
		System.out.println("+++++++++++++");
		System.out.print("Enter the number of inputs: ");
		int s = getInt();
		summation(s);
		
		// close the scanner
		sc.close();
	}

}
