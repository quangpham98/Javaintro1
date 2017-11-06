
package taxtax;

import java.util.Scanner;
public class TaxTax {

   
      // Quang Pham TuID 915371602 Assignment 2 Tax
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    System.out.println("What is your income?");
    int income= in.nextInt();
    if (income <= 50000){
    int tax=income/100;
    System.out.println(tax);
    
    }else if (50000<income && income<=75000){
    int tax=(income-50000)/50+50000/100;
    System.out.println(tax);
    }else if (75000<income && income<=100000){
    int tax=(income-75000)/100*3+25000/50+50000/100;
    System.out.println(tax);
    }else if (100000<income && income<=2500000){
    int tax=(income-100000)/25+25000/20+50000/100;
    System.out.println(tax);
    } else if (250000<income && income<=500000){
    int tax=(income-250000)/20+1500000/25+250000/20+50000/1;
    System.out.println(tax);
    } else{
    int tax=(income-500000)/100*6+250000/20+150000/25+250000/20+500000/100;
    System.out.println(tax);
    
    }
    }
}
