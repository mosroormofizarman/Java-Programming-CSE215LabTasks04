package CSE215_labtask_04;

import java.util.Scanner;

public class Repeating_Number_in_Consecutive_order {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = input.nextInt();
		
		int [] randomnumbers = new int [size];
		System.out.println();
		System.out.print("Enter elements: ");
		for(int i=0; i<randomnumbers.length; i++) {
			randomnumbers[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.print("Output: ");
		for(int i=0; i<randomnumbers.length-2; i++) {
			if(randomnumbers[i] == randomnumbers[i+1]) {
				if(randomnumbers[i] == randomnumbers[i+2]) {
					System.out.print(randomnumbers[i] + " ");
				}
			}
		}
		input.close();
	}
}
