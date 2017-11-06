
package question;


public class Test {
Question [] theQuestions;

public Test(Question a[]){
    theQuestions=a;
}


public void toQuestion(){
    String test="";
    for(int i=0;i<theQuestions.length;i++){
       System.out.println("Question "+(i+1)+":");
        theQuestions[i].Represent();
        
    }
}

public void toAnswerString(){
    String test="";
    for(int i=0;i<theQuestions.length;i++){
        System.out.println("Question "+(i+1)+":");
        theQuestions[i].Representas();
        
    }
}
public int getTotalPoints(){
    int sum=0;
     for(int i=0;i<theQuestions.length;i++){
        sum+=theQuestions[i].points;
}
        

return sum;}
}

