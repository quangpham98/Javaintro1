
public class Guess {

    int[] guess=new int [3];
    
    public Guess(int a,int b,int c){
        guess[0]=a;
        guess[1]=b;
        guess[2]=c;
    }
   
    public int [] Guessin(String a){

      String [] path=a.split(" ");
      
         
      try{
         
               
           
         
          for(int i=0;i<3;i++){
         
              guess[i] =Integer.parseInt(path[i]);
       
    }}
           catch (NumberFormatException e){
             System.out.println("wrong type");

           }
              catch(ArrayIndexOutOfBoundsException e){
                  System.out.println("too short");
                          
}
 
      Guess b= new Guess(guess[0],guess[1],guess[2]);
        
      return b.guess;}
    
      

    
    @Override
    public String toString(){
        for(int i=0;i<3;i++){
        System.out.print(guess[i]+"-");
   }

        return "/n";}
    
    public String checktheRule(Guess a){
    if((a.guess[0]+2==a.guess[1])&&(a.guess[1]+2==a.guess[2])){
        return "The rule you guess is true";
    }
    return "the rule is false";
} 
    


    public String checktheRule2(String a ){
    if(a.indexOf("increased by 2")>=0|| a.indexOf("2 more than previous")>=0||a.indexOf("2 more")>=0) {
        return "The rule you guess is true";
    }
    return "the rule is false";
}}
