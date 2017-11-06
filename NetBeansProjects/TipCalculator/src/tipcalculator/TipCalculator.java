
package tipcalculator;
import java.util.Scanner;
public class TipCalculator {
 public static final double fixedammout=0.5;
  public static final int very_satisfied=20;   
  public static final int satisfied=15;
  public static final int very_dissatisfied=10;
// Quang Pham TuID 915371602 Assignment 2 Tip 
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("How much was the bill?");
    double bill=in.nextDouble();
    System.out.println("How many people were in your party?");
    int people=in.nextInt();
    System.out.println("How happy are you?");
    int happy=in.nextInt();
    double additional=fixedammout*people;
    double rate;
    if (happy==1){
        rate=very_satisfied;
        double tip=bill/100*rate+additional;
       tip = Math.round(tip*100)/100.0d;
       System.out.println(tip);
    }else if(happy==2){
        rate=satisfied;
        double tip=bill/100*rate+additional;
        tip = Math.round(tip*100)/100.0d;
        System.out.println(tip);
    }else if(happy==3){
        rate=very_dissatisfied;
        double tip=bill/10+additional;
        tip = Math.round(tip*100)/100.0d;
        System.out.println(tip);}
    
    }
    }
