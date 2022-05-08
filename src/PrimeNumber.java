import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int number;
		boolean check = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number   :");
		number = sc.nextInt();

		if (number == 0 || number == 1) {
			System.out.println("Not a Prime Number");
		} else {
			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					check = true;
					break;
				} else {
					check = false;
					break;
				}
			}

		}
		if (!check) {
			System.out.println("Prime Number ");

		} else {
			System.out.println("Not a Prime Number");

		}
	}

}
