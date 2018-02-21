package PrimeNumGen;
import java.util.Scanner;

public class PrimeNumberRun {
	public static void main(String[] args) {
		System.out.println("Let's locate some primes!");
		System.out.println("This application will find you any prime, in order, from first prime number on.");
		boolean done=false;
		
		do {
		System.out.println("Which prime number are you looking for?");
		Scanner scan = new Scanner(System.in);
		int userNum = scan.nextInt();
		
		
		int i = PrimeNumber.counter(userNum);
		System.out.printf("The %dth prime is %d\n",userNum,i);
		System.out.print("Do you want to find another prime number?(y/n):");
		scan.next();
		done = scan.nextLine().equalsIgnoreCase("y");
		}while(!done);
	}

}
