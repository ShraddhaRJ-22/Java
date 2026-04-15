// Negative Power 
import java.util.Scanner;
class NegPower
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		double num = sc.nextDouble();
		
		System.out.println("Enter Power: ");
		double power = sc.nextDouble();
		
		if(power < 0){
			power *= -1;
			num = 1/num;
		} 
		double op = 1;
		for(int i = 1; i <= power; i++) op *= num;
		
		System.out.println("User Defined: " + op);
		System.out.println("Built-in: " + Math.pow(num, power));
	}
}