// Rotate the number by N times
import java.util.Scanner;

class AllRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        
        System.out.println("Enter number of rotations: ");
        int n = sc.nextInt();

        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        n = n % digits;

        while (n > 0) {
            int last = num % 10;
            int remaining = num / 10;

            int multiplier = 1;
            temp = remaining;

            while (temp > 0) {
                multiplier = multiplier * 10;
                temp = temp / 10;
            }
            num = last * multiplier + remaining;
			System.out.println(num);
            n--;
        }
        System.out.println("After rotation: " + num);
    }
}