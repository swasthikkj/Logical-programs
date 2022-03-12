import java.util.*;
public class PerfectNumber {
		void perfectNumber(int number) {
			int divisor = 0;
					for(int i=1; i<number; i++) {
						if(number%i == 0) {
							divisor = divisor+i;

						}

					}
					if(divisor == number) {
						System.out.println("It is a Perfect Number");
					}
					else {
						System.out.println("It is not a Perfect NUmber");
					}
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			PerfectNumber rv = new PerfectNumber();
			System.out.println("Enter the Number : ");
			int number = scanner.nextInt();
			rv.perfectNumber(number);
   	}
}
