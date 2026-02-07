// Alphabet (UPPER, lower) , Digit, Special Char
import java.util.Scanner;

class AlDiSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");

        char ch = sc.next().charAt(0);

        String op =
            (ch >= 65 && ch <= 90) ? (ch + " is UPPER CASE") :
            (ch >= 97 && ch <= 122) ? (ch + " is lower case") :
            (ch >= 48 && ch <= 57) ? (ch + " is a Digit") :
            (ch + " is a Special Character");

        System.out.println(op);
    }
}
