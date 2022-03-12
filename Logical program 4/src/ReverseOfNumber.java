import java.util.*;
public class ReverseOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReverseOfNumber rv = new ReverseOfNumber();
		System.out.println("Enter a Number :");
		int number = scanner.nextInt();
		System.out.println("Reverse Number is "+rv.reverse(number));
		}
		int reverse(int number) {
			int a;
			int reverseNumber = 0;
			while(number!=0) {
				a = number%10;
				reverseNumber = (reverseNumber*10)+a;
				number = number/10;
			}
			return reverseNumber;
	} 
}