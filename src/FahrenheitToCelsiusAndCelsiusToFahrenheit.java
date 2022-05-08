import java.util.Scanner;
/*
1.creating a class FahrenheitToCelsiusAndCelsiusToFahrenheit
2.And creating a methods convertingfahrenheitToCelsius and convertingCelsiusToFahrenheit 
with the return type of double and parameter as double
3.in convertingfahrenheitToCelsius method using the formula  (fahrenheit-32)*5/9  converting fahrenheitToCelsius  
4.in convertingCelsiusToFahrenheit method using the formula  (celsius * 9/5)+32;  converting fahrenheitToCelsius  
5.In main class creating an obj as object for FahrenheitToCelsiusAndCelsiusToFahrenheit class
6.Getting the value for a to confirm the conversoin type of user
7.based on the user entered value the swith cases are executed 
8.if the user enterd is not matching displayed as "invalid input"

*/
public class FahrenheitToCelsiusAndCelsiusToFahrenheit {
	public double convertingfahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32)*5/9;
	}
	public double convertingCelsiusToFahrenheit(double celsius) {
		return (celsius * 9/5)+32;
	}
	public static void main(String[] args) {
		FahrenheitToCelsiusAndCelsiusToFahrenheit obj = new FahrenheitToCelsiusAndCelsiusToFahrenheit();		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Press 1 to Convert Fahrenheit to Celsius or Press 2 Convert Celsius to Fahrenheit ");
		int a= sc.nextInt();
		double input;
		switch(a) {
		case 1:
			System.out.println("Enter Fahrenheit   :  ");
			input =sc.nextDouble();
			System.out.println(obj.convertingfahrenheitToCelsius(input)+"  Celsius");
			break;
		case 2:
			System.out.println("Enter Celsius    :  1");
			input =sc.nextDouble();
			System.out.println(obj.convertingCelsiusToFahrenheit(input)+"  Fahrenheit");
			break;
		default :
			System.out.println("Please Enter Valid Input");
			break;
		}
	 }
}
