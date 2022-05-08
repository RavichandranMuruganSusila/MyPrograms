import java.util.Scanner;

public class Sorting {
	int asc;
	int des;

	public void ascending(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					asc = array[j];
					array[j] = array[j - 1];
					array[j - 1] = asc;
				}
			}
		}
		System.out.println("The Ascending order of Given Number is :");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void descending(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] > array[j - 1]) {
					des = array[j];
					array[j] = array[j - 1];
					array[j - 1] = des;
				}
			}
		}
		System.out.println("The Descending order of Given Number is :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		Sorting srt = new Sorting();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Number To Sort : ");
		int a = sc.nextInt();
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter The Number   : " + i);
			int number = sc.nextInt();
			array[i] = number;
		}
		srt.ascending(array);
		srt.descending(array);
	}

}
