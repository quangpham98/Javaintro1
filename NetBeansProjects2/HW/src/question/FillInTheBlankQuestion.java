
package question;


public class FillInTheBlankQuestion extends Question {
    public String correctAnswer;
      
	public FillInTheBlankQuestion(int a,int b,int c,String d,String e){
	    super(a,b,c,d);
     
	    correctAnswer=e;}
      
     
     
	public void Represent(){
	    System.out.println("Question point: "+points);
	    System.out.println("Difficulty: "+difficulty);
	    String space="";
	    for(int i=0;i<answerSpace;i++){
		space+="__";}
    
	    String question=questionText.replace(correctAnswer,space);
	   
    
    
	    System.out.println("answerSpace:"+answerSpace);
	    System.out.println("Question:"+question);
             System.out.println("\n");
        }
        
     
        public void Representas(){
            System.out.println("Correct Answer:"+questionText);
                     System.out.println("\n");
    
	}
   
    public String Tofile(){
	   String ques="";
              ques+="Question point: "+points+"\n";
	    ques+="Difficulty: "+difficulty+"\n";
	    String space="";
	    for(int i=0;i<answerSpace;i++){
		space+="__";}
    
	  String question=questionText.replace(correctAnswer,space);
    
    
	    ques+="answerSpace:"+answerSpace+"\n";
	    ques+="Question:"+question+"\n";
            
	    
            
                
               
    ques+="Correct Answer:"+questionText+"\n";
                
                
                return ques;
                

}
}


