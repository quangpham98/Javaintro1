
package question;


    
    public class ObjectiveQuestion extends Question{
	public String correctAnswer;
      
	public ObjectiveQuestion(int a,int b,int c,String d,String e){
	    super(a,b,c,d);
     
	    correctAnswer=e;}
      
     
     
	public void Represent(){
	    System.out.println("Question point: "+points);
	    System.out.println("Difficulty: "+difficulty);
	    String space="";
	    for(int i=0;i<answerSpace;i++){
		space+="__";}
    
	    
	   
    
    
	    System.out.println("answerSpace:"+answerSpace);
	    System.out.println("Question:"+questionText+space);
         System.out.println("\n");
        }
        
     
        public void Representas(){
            System.out.println("Correct Answer:"+correctAnswer);
             System.out.println("\n");
    
	}
   
    public String Tofile(){
	   String ques="";
              ques+="Question point: "+points+"\n";
	    ques+="Difficulty: "+difficulty+"\n";
	    String space="";
	    for(int i=0;i<answerSpace;i++){
		space+="__";}
    
	  
    
    
	    ques+="answerSpace:"+answerSpace+"\n";
	    ques+="Question:"+questionText+space+"\n";
            
	    
            
             
               
    ques+="Correct Answer:"+correctAnswer+"\n";
                
                
                return ques;
                

}
}


