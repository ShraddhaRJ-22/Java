// Calculator using Ternary Operator
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Operand 1: ");
        double opr1 = sc.nextDouble();

        System.out.println("Enter Operator: ");
        char optr = sc.next().charAt(0);

        System.out.println("Enter Operand 2: ");
        double opr2 = sc.nextDouble();

        double op = (optr == '+') ? (opr1 + opr2) :
                    (optr == '-') ? (opr1 - opr2) :
                    (optr == '*') ? (opr1 * opr2) :
                    (optr == '/') ? (opr1 / opr2) :
                    (optr == '%') ? (opr1 % opr2) :
                    Double.MAX_VALUE;

        if (op != Double.MAX_VALUE) {
            System.out.println(opr1 + " " + optr + " " + opr2 + " = " + op);
        } else {
            System.out.println("Entered Operator is Invalid");
        }
    }
}
