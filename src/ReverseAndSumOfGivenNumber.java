import java.util.Scanner;

public class ReverseAndSumOfGivenNumber {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number  :");
		int remainder;
		int reverse = 0;
		int total = 0;
		int number = sc.nextInt();
		while(number!=0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			total =total + remainder;
			number = number / 10;
		}
		System.out.println("The Reverse of Given Number = "+reverse);
		System.out.println("The Totel Of Given Number By Individual is  :"+total);
	}

}
