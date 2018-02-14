
package question;


public class MultipleChoiceQuestion extends Question{
public String [] possibleAnswers;
public String correctAnswer;
public MultipleChoiceQuestion(int a,int b,int c,String d,String e,String g[] ){
    super(a,b,c,d);
correctAnswer=e;
possibleAnswers=g;}

public void Represent(){
	    System.out.println("Question point: "+points);
	    System.out.println("Difficulty: "+difficulty);
	    String space="";
	    for(int i=0;i<answerSpace;i++){
		space+="__";}
    
	  
    
    
	    System.out.println("answerSpace:"+answerSpace);
	    System.out.println("Question:"+questionText);
	    
            for(int i=0;i<possibleAnswers.length;i++){
                System.out.println(i+1+"."+possibleAnswers[i]);}
                System.out.println("\n");
   
            
    
	}
 public void Representas(){
     System.out.println("Question:"+questionText);
    for(int i=0;i<possibleAnswers.length;i++){
               if(possibleAnswers[i].equals(correctAnswer)){
                  
                   possibleAnswers[i]+="(This is the correct)";}
                   
               }
    for(int i=0;i<possibleAnswers.length;i++){                   
    System.out.println(i+1+"."+possibleAnswers[i]);
                
    
	}
  System.out.println("\n");}
 

public String Tofile(){
	   String ques="";
              ques+="Question point: "+points+"\n";
	    ques+="Difficulty: "+difficulty+"\n";
	    String space="";
	    for(int i=0;i<answerSpace;i++){
		space+="__";}
    
	  
    
    
	    ques+="answerSpace:"+answerSpace+"\n";
	    ques+="Question:"+questionText+"\n";
	    
            for(int i=0;i<possibleAnswers.length;i++){
                ques+=i+1+"."+possibleAnswers[i]+"\n";}
                System.out.println("\n");
                
                for(int i=0;i<possibleAnswers.length;i++){
               if(possibleAnswers[i].equals(correctAnswer)){
                  
                   possibleAnswers[i]+="(This is the correct)";}}
                  
               
    for(int i=0;i<possibleAnswers.length;i++){                   
    ques+=i+1+"."+possibleAnswers[i]+"\n";}
                
                
                return ques;
                

}}
            



    
    

