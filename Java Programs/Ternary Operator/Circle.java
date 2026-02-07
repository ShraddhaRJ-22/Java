// Perimeter & Area of Circle
import java.util.Scanner;
class Circle
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		final double PI = 22/7.0;
		final double AREA = PI * (radius * radius);
		final double PERIMETER = 2 * PI * radius;
		
		System.out.println("radius : " + radius + "cm");
		System.out.printf("Area of Circle: %.3f %n", AREA);
		System.out.printf("Perimeter of Cicle: %.3f", PERIMETER);
	}
}