// Convert from Feet to Meters
import java.util.Scanner;
class FeetToMeters
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Feet: ");
		
		double feet = sc.nextDouble();
		
		final double METER = feet * 0.305;
		
		System.out.println("Feet into Meters is " + METER + " m");
	}
}