import java.util.Scanner;

class VolumeOfSphere {
	 float pie=(float) 3.14285714286; 
	public double volume(float radius) {
		return (4.0/3.0)*pie*(radius*radius*radius);  
	}
}

public class FindingVolume {
	public static void main(String[] args) {

		VolumeOfSphere vos =new VolumeOfSphere();
		float number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Radius To Find Volume Of Sphere  ::");
	    number  =sc.nextFloat();
	    System.out.println("The Volume Of Sphere is ::"+vos.volume(number));
		
	}

}
