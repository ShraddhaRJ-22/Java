import java.util.Scanner;

class RangeOfFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        fibo(start, end);
    }

    public static void fibo(int start, int end) {
        int n1 = 0, n2 = 1;

        while (n1 <= end) {
            if (n1 >= start) {
                System.out.print(n1 + " ");
            }

            int ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }
    }
}