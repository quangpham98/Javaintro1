
package extracredit;


public class Extracredit {

   public static final int size=8;
public static final String chop="\\";
public static final String blank=" ";
public static final String brick="_";
public static final String core="|";
public static final String plus="*";
public static final String doc=".";
public static void main(String[] args) {
    String fake="";
    String fake2="";
    String fake3="";
    String fake4="";
   int sizeused=2*size+1;
  
    
    for(int i=1;i<=sizeused;i++){   
      if(i==1||i==sizeused){
          System.out.print(blank);} 
      else{
          System.out.print(brick);
      }}
System.out.print("\n");

    for (int a=1;a<=sizeused-1;a++){
      for(int b=1;b<=sizeused;b++){
        if(b==1||b==sizeused/2+1||b==sizeused){
     System.out.print(core);
    }
    else{
    System.out.print(brick);
    }}
      System.out.print("\n");
    }
    String doubedoc="..";
    for(int i=1;i<=sizeused-1;i++){
       for(int a=1;a<=sizeused*2+3;a++){ 
       // first and last line
           if(i==1||i==sizeused-1){
            if(a==1){
                System.out.print(blank);}
            else if(a!=sizeused*2+3){ 
            System.out.print(brick);}
           else{
               System.out.print("\n");
           }}
       //second line and second last line
           else if(i==2||i==sizeused-2){
            if(a==1||a==sizeused*2+2){
                System.out.print(core);}
             else if(a==((sizeused*2+3)/2)){
                System.out.print(brick+brick);}
            else if(a!=sizeused*2+3){ 
            System.out.print(blank);} 
            else {
               System.out.print("\n");}}
      //  mid
      else if(2<i&&i<(sizeused-2)/4){
          
            
        
            
        }
            
        }} 
    












           
    
    