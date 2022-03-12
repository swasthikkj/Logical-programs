import java.util.*;
public class FibonaciiSeries {
		void fabonacii(int number) {
			int number1 = 0;
			int number2 = 1;
			int number3;
			System.out.print(" "+number1+ " "+number2);
			for(int i=0; i<number; i++) {
				number3 = number1+number2;
				System.out.print(" "+number3);
				number1 = number2;
				number2 = number3;
			}

		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			FibonaciiSeries rv = new FibonaciiSeries();
			System.out.println("Enter the value :");
			int number = scanner.nextInt();
			rv.fabonacii(number);

	}

}
