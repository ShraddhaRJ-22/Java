// Factors
import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        fact(num);
    }

    public static void fact(int num) {
        int den = 1;

        while (den <= num) {
            if (num % den == 0) {
                System.out.print(den + " ");
            }
            den++;
        }
    }
}