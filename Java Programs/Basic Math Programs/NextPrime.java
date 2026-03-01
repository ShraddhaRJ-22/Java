// Check for Prime and if not Prime then Print the next Prime number
import java.util.Scanner;

class NextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = sc.nextInt();
        int i;

        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                break;
            }
        }

        if (i > num / 2 && num > 1) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
            num++;

            while (true) {
                for (i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        break;
                    }
                }

                if (i > num / 2) {
                    System.out.println("Next Prime is: " + num);
                    break;
                }

                num++;
            }
        }
    }
}