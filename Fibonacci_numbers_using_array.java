package CSE215_labtask_04;

import java.util.Scanner;
public class Fibonacci_numbers_using_array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int maxnumber = input.nextInt();
		int previousnumber = 0;
		int nextnumber = 1;
		int sum = 0;
		
		System.out.println();
		System.out.print("First " + maxnumber + " Fibonacci" + " numbers" + ":" + " ");
		for(int i=0; i<maxnumber; i++) {
			System.out.print(previousnumber + " ");
			sum = previousnumber + nextnumber;
			previousnumber = nextnumber;
			nextnumber = sum;
			//System.out.print(previousnumber + " ");
		}
		
		input.close();
	}
}
