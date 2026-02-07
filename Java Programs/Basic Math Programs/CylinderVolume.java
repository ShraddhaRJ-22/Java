// Compute the Volume of Cylinder
import java.util.Scanner;
class CylinderVolume
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		
		final double PI = 22/7.0;
		final double AREA = PI * radius * radius;
		final double VOLUME = AREA * height;
		
		System.out.printf("Area of Cylinder is %.4f %n",AREA);
		System.out.printf("Volume of Cylinder is %.4f",VOLUME);
	}
}