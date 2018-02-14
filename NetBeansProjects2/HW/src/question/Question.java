package question;
public  class Question {
public static final int MIN_DIFFICULTY=1;
public static final int MAX_DIFFICULTY=10;
    public int points;
    public int difficulty;
    public int answerSpace;
    public String questionText;

 public Question(int a,int b,int c, String d){
     points=a;
     if(MIN_DIFFICULTY<=b||b<=MAX_DIFFICULTY){
     difficulty=b;}
     
     answerSpace=c;
     questionText=d;
     }

    public void Represent(){
    
}
    public void Representas(){
           }
    
public String Tofile(){
return "" ;
   
    
}}
