import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * 1.creating a class StudentMarkList and importing scanner class and HashMap 
 * 2.creating a static variable hsMap to store the mark Details in key value pair , percentage and total
 * 3.creating a method storingMarkDetails with parameter as String and int  to store subject name as key and mark as value
 * 4.creating a method gettingSumAndAverage with parameter as int ,in that method by using forEach loop 
 *  in hsMap.entrySet() getting the total and average
 * 5.creating an sml as object for StudentMarkList class
 * 6.then getting the input a  for total subject 
 * 7.using the forloop getting the subject  and mark then the entered details are stored in hsMap
 * 8.after Getting all marks by using loop using hsMap.entetSet() printing subject and mark
 * then total and percentage are printing
 * 
*/
public class StudentMarkList {
	static Map<String ,Integer> hsMap = new HashMap<String,Integer>();
	static float percentage;
	static int total;
	public void storingMarkDetails(String subject,int mark) {
		hsMap.put(subject, mark);
	}
	public void gettingSumAndAverage(int noOfSubject) {
		for (Map.Entry<String, Integer> me :
			hsMap.entrySet()) {
			total = total + me.getValue();
       }
		percentage = total / noOfSubject;
	}
	
	
	public static void main(String[] args) {
		StudentMarkList sml =new StudentMarkList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Subject : ");
		int a = sc.nextInt();
		for(int i = 1; i <= a ; i++ ) {
			System.out.println("Enter Subject Name   :");
			String subject = sc.next();
			System.out.println("Enter Mark in "+subject+ "  :");
			int mark = sc.nextInt();
			sml.storingMarkDetails(subject, mark);			
		}
		sml.gettingSumAndAverage(a);
		for (Map.Entry<String, Integer> me :
			hsMap.entrySet()) {
			System.out.println(me.getKey()  +"     :"+me.getValue());
			
       }
		System.out.println("Total       :"+total);
		System.out.println("Percentage     :"+percentage);
	}

}
