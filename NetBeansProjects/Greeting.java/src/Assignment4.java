import java.util.*;
public class Assignment4 {
public static final int Shult=1;
public static final int Knubbig=2;
public static final int Angland=3;
public static final int Hansakogg=4;
public static void main(String[] args){
Random rand=new Random();
Scanner namein=new Scanner(System.in);
System.out.println("Rule:Skull beats Knuggig and Angland");
System.out.println("Knugbig beats Angland");
System.out.println("Angland beats Hasakogg");
System.out.println("Hansakogg beats Shult and Kunbbig");
System.out.println("The computer win if tie");
System.out.println("Please enter a move as a number");
System.out.println("The moves are: 1-Shult,2-Knubbig,3-Angland,4-Hansakogg");
System.out.println("Please enter your choice:1,2,3,4");
int player=namein.nextInt();
if(player!=1 || player!=2 || player!=3 || player!=4){
    System.out.println("your enter is wrong");}
else{
    int commove=rand.nextInt(4)+1;
if(player==Shult){
    if(commove==Knubbig ||commove==Angland){
        System.out.print("Player win");}
    else{
                System.out.print("You lose");}
    }
else if(player==Knubbig){
    if(commove==Angland){
        System.out.println("Player win");}
        else{
                System.out.println("you lose");}
    }    
else if(player==Angland){
   if(commove==Hansakogg){
       System.out.println("Player win");}
   else{
       System.out.println("you lose");}
}
else{
    if(commove==Shult || commove==Knubbig){
        System.out.print("You win");}
    else{
        System.out.println("you lose");}
        
    }
}    
}
}


