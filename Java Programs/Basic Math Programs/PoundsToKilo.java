// Convert Pounds into Kilograms
import java.util.Scanner;
class PoundsToKilo
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in Pounds: ");
		
		double pound = sc.nextDouble();
		
		final double KG  = pound * 0.454;
		
		System.out.println("Pounds to Kg: " + KG + " kg");
	}
}