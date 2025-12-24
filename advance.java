import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class advance {

    // Global variables for the game
    static Scanner scan = new Scanner(System.in);
    static Random ran = new Random();
    static ArrayList<String> collection = new ArrayList<>();
    static int red = 0, blue = 0, black = 0;
    static String[] names = {"POWER RANGER RED", "POWER RANGER BLUE", "POWER RANGER BLACK"};

    public static void main(String[] args) {
        while (true) {
            int choice = menu(); // show menu and get choice

            if (choice == 1) {
                spin(); // spin a random ranger
            } else if (choice == 2) {
                showCollection(); // show the collection
            } else if (choice == 3) {
                System.out.println("Exiting game... Bye!");
                break; // exit the game
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
        scan.close();
    }

    // Method to display the menu and get user input
    public static int menu() {
        System.out.println("\nWELCOME TO COLLECTION");
        System.out.println("1.) SPIN");
        System.out.println("2.) CHECK COLLECTION");
        System.out.println("3.) EXIT");
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        scan.nextLine(); // consume leftover newline
        return choice;
    }

    // Method to spin and get a random ranger
    public static void spin() {
        String random_name = names[ran.nextInt(names.length)];
        System.out.println("YOU GOT: " + random_name);
        collection.add(random_name);

        // Increment counters
        if (random_name.equalsIgnoreCase("POWER RANGER RED")) red++;
        else if (random_name.equalsIgnoreCase("POWER RANGER BLUE")) blue++;
        else black++;
    }

    // Method to display the collection and counts
    public static void showCollection() {
        System.out.println("\n---YOUR COLLECTION---");
        System.out.println("POWER RANGER RED   : " + red);
        System.out.println("POWER RANGER BLUE  : " + blue);
        System.out.println("POWER RANGER BLACK : " + black);
        System.out.println("ALL SPINS          : " + collection);
    }
}
