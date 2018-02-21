package PrimeNumGen;

public class PrimeNumber {

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public static int counter(int userNum) {
		int i;
		int count;
		for(count=0,i=2;count<userNum;i++) {
			if(PrimeNumber.isPrime(i)) {
				count++;
			}
		}return i-1;
		
	}
}
