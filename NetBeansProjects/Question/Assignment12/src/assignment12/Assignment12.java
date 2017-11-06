
package assignment12;

import java.util.*;
import java.io.*;

public class Assignment12 {

       

     public static int counting(String a){
         int len=0;
                 if(a.length()>15){
                     len=15;
             
         }
                 else{
                     len=a.length();
                 }
       return len;  
     } 
      
     public static int [] num(Scanner a,int b[]){
         String text="";
        int c=0;
        
      while(a.hasNext()){
            text=a.next();
            c=counting(text);
            b[c-1]+=1;
            }
       return b;  
     }
     
     public static int  max(int a[]){
         int maxnum=0;
         for(int i=0;i<a.length;i++){
             if(a[i]>maxnum){
                 maxnum=a[i];
             }
         }
     return maxnum;
     }
     
     public static int unit(int a[]){
         int minratio=a[0];
         for(int i=0;i<a.length;i++){
             if(max(a)/a[i]<70){
                 if(a[i]<minratio){
                     minratio=a[i];
                 }
             }
         }
     return minratio;
     }
     
     public static void draw(int a,int b[]){
         for(int i=0;i<a/unit(b);i++){
             System.out.print("*");
             
         }
         System.out.println();
     }
     
     public static void histogram(int a[]){
         System.out.println("Len"+"\t"+"Count");
         for(int i=0;i<a.length;i++){
             System.out.print((i+1)+"\t"+a[i]+"\t");
                    draw(a[i],a); 
         }
     }
     
    public static void main(String[] args) 
    throws FileNotFoundException{
        Scanner input=new Scanner(new File("PJ.txt"));
       
        input.useDelimiter("\\W+");
      
        int sets[]=new int[15];
        for(int i=0;i<sets.length;i++){
            sets[i]=0;
        }
         
        sets=num(input,sets);
        
     histogram(sets);
       input.close();
    }
    
}
