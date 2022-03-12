import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrimeNumber rv = new PrimeNumber();
		System.out.println("Enter a Number : ");
		int number = scanner.nextInt();
		rv.prime(number);
	}
		void prime(int number) {
			boolean primeNumber = true;
			for(int i=2; i<number; i++) {
				if(number%i == 0) {

					primeNumber = false;
					break;
					}

			}
			if(primeNumber == true) {
				System.out.println("It is a prime number");
			}
			else {
				System.out.println("It is not a prime number");			}
		}
}