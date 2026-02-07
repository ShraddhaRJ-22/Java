// Leap Year
import java.util.Scanner;
class LeapYear
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		
		int yr = sc.nextInt();
		
		String op = (yr % 400 == 0 || (yr % 4 == 0) && (yr % 100 != 0)) ? (yr + " is a Leap year") : (yr + " is not a Leap Year");
		System.out.println(op);
	}
}