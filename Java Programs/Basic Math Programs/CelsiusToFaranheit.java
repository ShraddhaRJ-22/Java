// Convert Celsius to Faranheit
import java.util.Scanner;
class CelsiusToFaranheit
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius: ");
		
		double celsius = sc.nextDouble();
		
		final double FARANHEIT  = (9.0/5.0) * celsius + 32;
		
		System.out.println("Faraheit : " + FARANHEIT);
	}
}