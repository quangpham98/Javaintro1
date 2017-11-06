
package greeting.java;

import java.util.Scanner;
public class GreetingJava {
   
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name?");
    String firstname= scan.nextLine();
    System.out.println("What is your last name?");
    String lastname=scan.nextLine();
    System.out.println("Greetings, " + firstname+ "" + lastname);
    }
    
    
}