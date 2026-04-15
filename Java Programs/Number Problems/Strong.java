// Strong number
import java.util.Scanner;

class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if (isStrong(num)) {
            System.out.println(num + " is a Strong number");
        } else {
            System.out.println(num + " is not a Strong number");
        }
    }

    public static boolean isStrong(int num) {
        int sum = 0;

        for (int i = num; i != 0; i /= 10) {
            int last = i % 10;
            sum = sum + factorial(last);
        }

        return num == sum;
    }

    public static int factorial(int num) {
        int fact = 1;
        while (num > 1) {
            fact *= num;
            num--;
        }
        return fact;
    }
}