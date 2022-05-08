import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int number ;
		int previous = 0;
		Scanner sc =new  Scanner(System.in);
		System.out.println("Enter The Number   :");
		number =sc.nextInt();
		for(int i = 0 ; i <= number ; i++) {
		previous = previous + i;
		}
		System.out.println("The Fibonacci Series of Given Number is    :"+previous);
	}

}

