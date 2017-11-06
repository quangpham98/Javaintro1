
package assignment5;
// Quang Pham Tuid 915371602 Assignment 5
import java.util.*;
public class Assignment5 {
    public static void main(String[] args) {
      System.out.println("Enter a string");
      Scanner strin=new Scanner(System.in);
      String enter=strin.next();
      String reverse="";    
      int len=enter.length();
      for(int i=len-1;i>=0;i--){
       reverse+=enter.charAt(i);}
      if(enter.equals(reverse)){
          System.out.println("String spelled back and forward the same");}
      else{
          System.out.println("Not the same");}
     String vowel="ueoaiUEOAI";
     int count=0;
     for(int i=0;i<=len-1;i++){
         if(vowel.indexOf(enter.charAt(i))!=-1){
             count+=1;}}
     System.out.println("Number of vowels:"+ count);
      for(int i=0;i<=len-1;i++){
         if(vowel.indexOf(enter.charAt(i))!=-1){
             System.out.println("The index of first vowel "+  i);
             break;}}
     for(int i=len-1;i>=0;i--){
         if(vowel.indexOf(enter.charAt(i))!=-1){
             System.out.println("the index of last vowel "+  i);
             break;}}
     
   System.out.println("Enter the second string");
   String enter2=strin.next(); 
   int count2=0;
   
    
    while (enter.indexOf(enter2)!=-1){
         int len2=enter2.length();
         int len3=enter.length();
        int newstart=enter.indexOf(enter2)+len2; 
         count2+=1;
         enter=enter.substring(newstart,len3);}
         
    
    System.out.println("number of times that the second String appears within the first String:   " +count2);

    }}    

