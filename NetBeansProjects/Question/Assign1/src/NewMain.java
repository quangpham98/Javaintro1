import java.util.Scanner;
import java.util.ArrayList;
public class NewMain{


public static void Getinput(){  
    
    ArrayList<Guess> source=new ArrayList<Guess>();
   Scanner input=new Scanner(System.in);
       Guess gues= new Guess(0,0,0); 
   System.out.println("Please start the game");
       while(true){
       String cons=input.nextLine();
    
       if(cons.equals("answer")){
           System.out.println("please enter the true sequence with rule to check");
       String answer=input.nextLine();
      
       System.out.println(gues.checktheRule2(answer));
       break;
       }
       
       else if(cons.equals("previous")==true){
        
           for(int i=0;i<source.size();i++){
               
               source.get(i).toString();
          System.out.println (source.get(i).checktheRule(source.get(i)));
          
        }
       }
       
       else{
        
          
         
         gues.Guessin(cons);
         Guess b= new Guess(gues.guess[0],gues.guess[1],gues.guess[2]);
          String [] path=cons.split(" ");
           
          if(path.length==3){
         source.add(b);}
       
          System.out.println(gues.checktheRule(gues));
       
          
}}}

   
      
   
    public static void main(String[] args) {
        Getinput();
    }
}