// Marks to Percentage
import java.util.Scanner;
class Marks
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Marks: ");
		double marks = sc.nextDouble();
		
		final double TOTAL_MARKS = 500;
		if(marks < 0 || marks > 500) {
			System.out.println("Entered marks is Invalid");
			System.exit(0); // JVM terminate or return;
		}
		
		double per = (marks/TOTAL_MARLS) * 100;
		String grade = "", remark = "";
		
		if(per >= 90){
			grade = "O";
			remark = "Outstanding";
		} else if(per >= 75) {
			grade = "A+";
			remark = "1st Class with Distinction";
		} else if(per >= 60) {
			grade = "A";
			remark = "1st Class";
		} else if(per >= 50) {
			grade = "B";
			remark = "2nd Class";
		} else if(per >= 35) {
			grade = "C";
			remark = "Pass";
		} else {
			grade = "F";
			remark = "Fail";
		}
		
		System.out.println("Grade: " + grade);
		System.out.println("Remark: " + remark);
		System.out.println("Percentage: " + per);
		System.out.println("Marks: " + marks);
	}
}