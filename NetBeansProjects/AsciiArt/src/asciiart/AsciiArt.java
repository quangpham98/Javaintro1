
package asciiart;
public class AsciiArt {
public static final int size=10;
public static final String chop="/\\";
public static final String blank=" ";
public static final String brick="-";
public static final String core="|";
public static final String plus="+";
public static final String cute="~";
public static void main(String[] args) {
    String fake="";
    String fake2="";
    String fake3="";
    String fake4="";
   // draw chop
    for(int i=1;i<=size;i++){
        fake+=chop;
           for(int j=2*size-i;j>0;j--){
           System.out.print(blank);
           }
    System.out.print(blank+"/"+fake+"\\"+"\n");}
    
    //draw bottom
    
    for(int a=1;a<=4;a++){
        
            
              for(int k=size+1;k>0;k--){
                  System.out.print(brick);}
                for(int k=size*2+2;k>0;k--){
                    fake2+=core;
                    System.out.print(core);}
                for(int k=size+1;k>0;k--){
                  System.out.print(brick);}
                System.out.print(brick+"\n");}
          
     for(int a=1;a<=2;a++){
    
          for(int k=size;k>0;k--){
                  System.out.print(plus);}
          System.out.print("/");
                  
          for(int i=size+1;i>0;i--){
             for(int b=1;b<=2;b++){
                 fake3+=cute;
             System.out.print(cute);}
                 
             }
          System.out.print("\\");
            for(int k=size+1;k>0;k--){
                  System.out.print(plus);}
            System.out.print("\n");
            
            
           
          
     
     }        
                  
         
                
        
        
        for(int i=1;i<=size;i++){
        
           for(int j=size-i;j>0;j--){
           System.out.print(blank);
           }
        System.out.print('/');
           for(int k=2*(size+1)+2*i;k>0;k--){
         System.out.print(brick);
    }
    
   System.out.print("\\\n");
             
                       
           
           }
}}
    
    

