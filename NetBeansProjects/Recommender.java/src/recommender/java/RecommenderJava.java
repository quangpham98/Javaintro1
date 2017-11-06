
package recommender.java;

import java.io.*;
import java.util.*;

public class RecommenderJava {
 

    public static double [][] loadRatings(String filename) 
    {
        double [][] ret = new double[30][20];

        try {
	    Scanner sc = new Scanner(new File(filename));
	    String line = null;
	    Scanner lineSc = null;
	    int i=0;
	    while(sc.hasNextLine() && i < ret.length)
		{
		    line = sc.nextLine();
		    lineSc = new Scanner(line);
		    for(int j=0; j<ret[i].length && lineSc.hasNextDouble(); j++)
			{
			    ret[i][j] = lineSc.nextDouble();
			}
		    i++;
		}
	    
	    sc.close();
	} catch (IOException e) {
	    System.out.println("Error opening " + filename + 
			       " for reading.  Quitting ...");
	    System.exit(1);
	}
        return ret;
    }

    public static String [] loadMovieNames(String filename) {
        String [] ret = new String[20];
        
        try {
	    Scanner sc = new Scanner(new File(filename));
	    String line = null;
	    int i=0;
	    while(sc.hasNextLine() && i < ret.length)
		{
		    ret[i] = sc.nextLine();
		    i++;
		}
	    
	    sc.close();
	} catch (IOException e) {
	    System.out.println("Error opening " + filename + 
			       " for reading.  Quitting ...");
	    System.exit(1);
	}
        return ret;
    }
  public static double moviescore(double A[]){
      double total=0.0;
      for(int i=0;i<A.length;i++){
          if(A[i]!=-1.0){
              total+=A[i]*A[i];
              } }
      return Math.sqrt(total);
  }
 
  public static double productrating(double A[],double B[]){
    int total=0;
for(int i=0;i<A.length;i++){
    if(A[i]!=-1.0 && B[i]!=-1.0){
        total+=A[i]*B[i];
    }
}
return total;
}

public static double [] similarscore(double A[],double B[][]){
    double p1=moviescore(A);
    double [] similar=new double[30];
    
    for(int i=0;i<B.length;i++){
        double both=productrating(A,B[i]);
        double p2=moviescore(B[i]);
        double point=both/(p1*p2);
        similar[i]=point;
        
    }
    return (similar);
    
   
}  

public static double [] weighted(double B[],double A[][]){
    double [] movieweight=new double[20];
    
    for(int i=0;i<20;i++){
      
        double total1=0.0;
      double total2=0.0;
        
      for(int j=0;j<B.length;j++){
          total1=total1+A[j][i]*B[j];
          total2+=B[j];}
        
        movieweight[i]=total1/total2;
    }
     return (movieweight);
     
}

public static String movierecommen(double A[],String B[]){
    double max=0;
    int maxindex=0;
    for(int i=0;i<A.length;i++){
        if(A[i]>max){
         max=A[i];
        maxindex=i;}
        
    }
    return B[maxindex];
}

public static String [] movielist(double A[],String B[],int a){
 String [] list =new String[a];
    for(int j=0;j<a;j++){
     double max=0.0;
    int maxindex=0;
     
    for(int i=0;i<A.length;i++){
        if(A[i]>max){
         max=A[i];
        maxindex=i;}}
        
    list[j]=""+B[maxindex];
        A[maxindex]=0.0;}
        
            

return list;
}
    
    public static void main(String[] args) {
        //Load the files
        Scanner in= new Scanner(System.in);
        String [] moviename=loadMovieNames("movies.txt");
        double [][] ratingnum=loadRatings("ratings.txt");
        
        //Create array of user input
        double [] userpoints= new double[moviename.length];
        for(int i=0;i<moviename.length;i++){
            System.out.println("What is the rating of "+ moviename[i]+" in range 1 to 5, -1 if haven't seen");
            int ratepoint=in.nextInt();
            userpoints[i]=ratepoint+0.0;}
        
        //create array of similarity score
        double [] similarscore=new double[30];
        similarscore=similarscore(userpoints,ratingnum);
        
    
        //caculate movieweigth
        double [] weight= new double[20];
                weight=weighted(similarscore,ratingnum);
    
                //recommen movie
System.out.println(movierecommen(weight,moviename));

//Recomen movie list with 7 movie that most suitable to user
System.out.println(Arrays.toString(movielist(weight,moviename,7)));
  
    }
    }
            
            

  
      

    
   
