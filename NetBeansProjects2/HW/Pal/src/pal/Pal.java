
package pal;
import java.util.*;

public class Pal {

    public static String cleanstuff(String a){
    String new1="";
    String stuff="!@#$%^&*(),.<;': '";
    for(int i=0;i<a.length();i++){
        if(stuff.indexOf(a.charAt(i))==-1){
            
           
            new1+=a.charAt(i);
        
        }
    }
    new1=new1.toLowerCase();
 return new1;           
}

    
    
    public static void main(String[] args) {
        

       Scanner inp=new Scanner(System.in);
       String check="";
       Stack<String> rev=new Stack<>();
       Queue<String> nom=new Queue<>();
       Stack<String> hold=new Stack<>();
       
       while(check.equals("quit")!=true){
           System.out.println("Please type in the string");
           String temp=inp.nextLine();
           temp=cleanstuff(temp);
           
       for(int i=0;i<temp.length();i++){
           rev.push(temp.charAt(i)+"");
           nom.offer(temp.charAt(i)+"");
           } 
       String reverse="";
       String nom1="";
       
       for(int a=0;a<temp.length();a++){
           reverse+=rev.pop();
           nom1+=nom.poll();
       }
       
       if(reverse.equals(nom1)){
           System.out.println("The input is Palindromes");
           hold.push(temp);
       }
       
       else{
           System.out.println("The input is not Palindromes ");
       }    
           check=temp;
       }
    
  System.out.println("All the Palindromes are:");
 
  while(hold.empty()==false){
      
             System.out.println(hold.pop()+"\n");
  } 
 
}}

