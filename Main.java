import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        ArrayList array = new ArrayList<>();

        int red = 0, blue = 0, black = 0;
        String [] name = {"POWER RANGER RED", "POWER RANGER BLUE", "POWER RANGER BLACK"};
        do {         
        System.out.println("WELCOME TO COLLECTION");
        System.out.println("1.) SPIN");  
        System.out.println("2.) CHECK COLLECTION");  
        System.out.println("3.) EXIT");  
        int num_choice = scan.nextInt();
        //if else to 
        if(num_choice == 1){ //start 1.)

        String random_name = name[ran.nextInt(name.length)]; //created to random a name and store it in random_name
        System.out.println(random_name);
        if(random_name.equalsIgnoreCase("POWER RANGER RED")){
        red++;
        }else if(random_name.equalsIgnoreCase("POWER RANGER BLUE")){
        blue++;
        }else{
        black++;
        }

        } // end 1.)

        else if(num_choice == 2){
        System.out.println("POWER RANGER RED   : "+red);
        System.out.println("POWER RANGER BLUE  : "+blue);
        System.out.println("POWER RANGER BLACK : "+black);
        }
        
        else{
            break;
        }
        } while (true);       
    }
}