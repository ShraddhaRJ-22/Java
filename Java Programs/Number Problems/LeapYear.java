import java.util.Scanner;
class LeapYear
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int yr = sc.nextInt();
		
		leapYear(yr);
	}
	
	public static void leapYear(int yr){
		if((yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0){
			System.out.println("It is a Leap Year");
		} else {
			System.out.println("It is not a Leap Year");
		}
	}
}