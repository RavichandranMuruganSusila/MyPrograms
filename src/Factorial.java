import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int number;
		int previous = 1;
		int test;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number   :");
		number = sc.nextInt();
		if (number == 0) {

		} else {
			for (int i = 1; i <= number; i++) {
				previous = previous * i;
			}
		}

		System.out.println("The Factorial  of a Given Number is    :" + previous);
	}

}
