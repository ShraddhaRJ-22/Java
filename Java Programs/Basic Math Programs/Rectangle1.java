// Area & Perimeter of Rectangle
import java.util.Scanner;
class Rectangle1
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width: ");
		double width = sc.nextDouble();
		
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		
		final double AREA = width * height;
		final double PERIMETER = (2 * height) + (2 * width);
		
		System.out.printf("Area of Rectangle: %.3f %n", AREA);
		System.out.printf("Perimeter of Rectangle1: %.3f", PERIMETER);
	}
}