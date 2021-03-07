package CSE215_labtask_04;

import java.util.Scanner;
public class Calculate_average_using_array {
	public static void main(String[] args) {
		int size = 6;
		Scanner input = new Scanner(System.in);
		
		int [] averagearray = new int [size];
		int sum = 0;
		double average = 0;
		for(int i=0; i<size; i++) {
			averagearray[i] = input.nextInt();
			sum += averagearray[i];
			average = (sum/size);
		}
		
		int count = 0;
		for(int i=0; i<averagearray.length; i++) {
			if(averagearray[i]>average) {
				count += 1;
			}
		}
		
		int percentageInitial = 100;
		double percentage = (count*percentageInitial)/size;
		System.out.print(count + " * " + percentageInitial + " / " + size + " = ");
		System.out.printf("%.2f",percentage);
		System.out.print("%");
		
		input.close();
	}
}
