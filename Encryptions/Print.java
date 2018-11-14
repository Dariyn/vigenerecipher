import java.util.Scanner;
public class Print {
    public void prints () {
        Scanner input = new Scanner(System.in);
        System.out.println("You can choose to encrypt or decrypt or stop the program");
        String userChoice = input.next();
        if (userChoice.toLowerCase().equals("encrypt")) {
            System.out.println("what do u want to encrypt");
            String x = input.next();
            System.out.println("Keyword:");
            String y = input.next();
            input.close();
            Cipher cypher = new Cipher(x,y);
            System.out.println(cypher.encrypt(x,y));
            Print console = new Print();
            console.prints();
        }
        else if (userChoice.toLowerCase().equals("decrypt")) {
            System.out.println("what do u want to decrypt");
            String x = input.next();
            System.out.println("Keyword:");
            String y = input.next();
            input.close();
            decipher cypher = new decipher(x,y);
            System.out.println(cypher.decrypt(x,y));
            Print console = new Print();
            console.prints();
        }
        else if (userChoice.toLowerCase().equals("stop")) {
            System.out.println("Bye!");
            System.exit(0);
        }
        
        else {
            input.close();
            Print console = new Print();
            console.prints();
        }
    }
}