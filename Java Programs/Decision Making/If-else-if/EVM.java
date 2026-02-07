// EVM (Voting Machine)
import java.util.Scanner;

class EVM {

    static int bjp, mns, shivsena, congress, rashtravadi, nota;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Population: ");
        int population = sc.nextInt();

        for (int i = 1; i <= population; i++) {

            System.out.println("\n********* Welcome *********");
            System.out.println("1. BJP");
            System.out.println("2. MNS");
            System.out.println("3. SHIVSENA");
            System.out.println("4. CONGRESS");
            System.out.println("5. RASHTRAVADI");
            System.out.println("6. NOTA");

            System.out.print("Enter your Response: ");
            String res = sc.next().toUpperCase();

            if (res.equals("BJP")) {
                bjp++;
                System.out.println("You have voted for BJP");

            } else if (res.equals("MNS")) {
                mns++;
                System.out.println("You have voted for MNS");

            } else if (res.equals("SHIVSENA")) {
                shivsena++;
                System.out.println("You have voted for SHIVSENA");

            } else if (res.equals("CONGRESS")) {
                congress++;
                System.out.println("You have voted for CONGRESS");

            } else if (res.equals("RASHTRAVADI")) {
                rashtravadi++;
                System.out.println("You have voted for RASHTRAVADI");

            } else if (res.equals("NOTA")) {
                nota++;
                System.out.println("You have voted for NOTA");

            } else {
                System.out.println("Entered Response is Invalid");
                i--; // invalid vote shouldn't count
            }
        }

        System.out.println("\n===== Voting Result =====");
        System.out.println("BJP: " + bjp);
        System.out.println("MNS: " + mns);
        System.out.println("SHIVSENA: " + shivsena);
        System.out.println("CONGRESS: " + congress);
        System.out.println("RASHTRAVADI: " + rashtravadi);
        System.out.println("NOTA: " + nota);
		
		if(bjp >= congress && bjp >= mns && bjp >= shivsena && bjp >= rashtravadi && bjp >= nota){
			System.out.println("BJP has won the election by " + bjp + " votes");
		} else if(mns >= bjp && mns >= congress && mns >= shivsena && mns >= rashtravadi && mns >= nota){
			System.out.println("MNS has won the election by " + mns + " votes");
		} else if(shivsena >= bjp && shivsena >= congress && shivsena >= mns && shivsena >= rashtravadi && shivsena >= nota){
			System.out.println("SHIVSENA has won the election by " + shivsena + " votes");
		} else if(congress >= bjp && congress >= shivsena && congress >= mns && congress >= rashtravadi && congress >= nota){
			System.out.println("CONGRESS has won the election by " + congress + " votes");
		} else if(rashtravadi >= bjp && rashtravadi >= shivsena && rashtravadi >= mns && rashtravadi >= congress && rashtravadi >= nota){
			System.out.println("RASHTRAVADI has won the election by " + rashtravadi + " votes");
			// similarly NOTA
		} else {
			System.out.println("Election is Tied bcoz of " + nota + " votes were given to NOTA");
		}
		
    }
}
