import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main{
    static Scanner scan = new Scanner(System.in);
    static Random ran = new Random();
    static ArrayList array = new ArrayList<>();
    static int red = 0, blue = 0, black = 0;
    static String [] name = {"POWER RANGER RED", "POWER RANGER BLUE", "POWER RANGER BLACK"};
    static int arraycount = 0;
    static boolean access = true;

    static int method1(){
    System.out.println("WELCOME TO THE RANDOM ROLL POWER RANGER");
    System.out.println("(PRESS THE NUMBER)");
    System.out.println("1.) ROLL A POWER RANGER");
    System.out.println("2.) INVENTORY");
    System.out.println("3.) EXIT");
    int choicenumber = scan.nextInt();
    return choicenumber;
    }

    static String method2(){
    String youget = name[ran.nextInt(name.length)];
    System.out.println("YOUVE PULL A "+ youget +"\n");
    if(youget.equalsIgnoreCase(name[0])){
        red++;
    }else if(youget.equalsIgnoreCase(name[1])){
        blue++;       
    }else if(youget.equalsIgnoreCase(name[2])){
        black++;       
    }else{     
    }
    arraycount++;
    String entry = "\n ("+ arraycount + ") [" + youget + "]\n"; // create the string
    array.add(entry); 
    return youget;
    }
    static void method3(){
    System.out.println("POWER RANGER RED  : "+red);
    System.out.println("POWER RANGER BlUE : "+blue);
    System.out.println("POWER RANGER BLACK: "+black);
    System.out.println(array);
    }
    public static void main(String[] args) {
    while (access) {
        int choice = method1();
        if (choice == 1) {
            System.out.println("\n");
            method2();
        }
        else if(choice == 2){
            System.out.println("\n");
           method3();
        }   
        else if(choice == 3){
            access = false;
        }
        else {
            System.out.println("\n\n\n\nyou entered incorrect dumbass!!");
        }
    }
    
    }
}