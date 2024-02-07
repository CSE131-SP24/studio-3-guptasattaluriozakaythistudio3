package studio3;

import java.util.Scanner;


public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Till what number do you want to find primes for: ");
		int maxNumber = in.nextInt();
		
		int[] allNumbers = new int[maxNumber];
		
		
		for(int i = 0; i<allNumbers.length; i++) {
			allNumbers[i] = i+1;
			System.out.print(allNumbers[i] + " ");
		}
		System.out.println();
		
		
		for (int k = 2; k<allNumbers.length; k++) {
			
		for(int j = 0 ; j<allNumbers.length; j++) {
			
			if(allNumbers[j]==k) {
				System.out.print(allNumbers[j] + " ");
			}
			else if(allNumbers[j]%k == 0) {
				allNumbers[j] = 0;
				System.out.print(allNumbers[j] + " ");
			}
			else{
				System.out.print(allNumbers[j] + " ");
			}
		}
		System.out.println();
		}
	}
}
				
		
		
		
		
		
		



