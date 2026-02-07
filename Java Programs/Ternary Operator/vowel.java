// Vowels & Consonants
import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");

        char ch = sc.next().charAt(0);

        String op =
            ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) ?
                ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    ? ch + " is a Vowel"
                    : ch + " is a Consonant")
            : ch + " is not a Character";

        System.out.println(op);
    }
}
