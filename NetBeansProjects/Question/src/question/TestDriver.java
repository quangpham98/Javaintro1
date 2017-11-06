
package question;
import java.io.*;
public class TestDriver {
    
    public static void saveDoc(String contents, String filename) {
    PrintWriter pw = null;
    try {
	pw = new PrintWriter(new FileWriter(new File(filename)));
	pw.print(contents);
    } catch (IOException ioe) {
	ioe.printStackTrace();
	System.err.println("Error writing to file:  " + filename);
    } finally {
	if(pw!=null) {
	    pw.close();
	}
    }
}

    public static void main(String args[]){
        
        String [] possible={"hello","Scooby Doo","Spongebob Squarepants","Eric Cartman"};
     
        Question ques2=new MultipleChoiceQuestion(5,2,3,"Who lives in a pineapple under the sea?","Spongebob Squarepants",possible);
        Question ques1=new FillInTheBlankQuestion(2,3,4,"Abraham Lincoln was the 16th US President","Abraham Lincoln");
        Question ques3=new ObjectiveQuestion(6,2,5,"2+3=","5");
        Question[] theQuestions={ques1,ques2,ques3};
        
        Test theTest= new Test(theQuestions);
        System.out.println("Total point: "+theTest.getTotalPoints());
        System.out.println();
        theTest.toQuestion();
       theTest.toAnswerString();
        
    
String test="";

for(int i=0;i<theQuestions.length;i++){
test+="Question"+(i+1)+":"+"\n";
    test+=theQuestions[i].Tofile();    
}
System.out.println(test);
saveDoc(test,"Quangtest");
}}
