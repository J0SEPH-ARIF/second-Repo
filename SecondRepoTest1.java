import java.util.*;

public class Area {
	public static void main (String[] args) {
		// Section1: Create the variables
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Radius");
		double area;
		int radius= sc.nextInt(); 
		final double PI=3.14;

		//Section2: Business logic
		area = 3.14 * radius * radius;

		//Section3: Produce out
		System.out.println("Radius: " + radius + ", area: " + area );

	}
}