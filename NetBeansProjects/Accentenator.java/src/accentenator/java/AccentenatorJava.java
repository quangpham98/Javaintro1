
package accentenator.java;

import java.io.*;
import java.net.*;

public class AccentenatorJava {
    public static final String vowels="ueoaiUEOAI";

 public static boolean isVowel(char c){
        if (vowels.indexOf(c)!=-1){
            return true;}
        else{return false;}
        }
 
    public static String getWebContents(String url) {
    BufferedReader br = null;
    String result = null;
    try {
	URL toFetch = new URL(url);
	br = new BufferedReader(new InputStreamReader(toFetch.openStream()));
	StringBuilder ret = new StringBuilder();
	String line = br.readLine() + "\n";
	while (line != null) {
	    ret.append(line);
	    line = br.readLine();
	}
	result = ret.toString();
    } catch (MalformedURLException ex) {
	ex.printStackTrace();
	System.err.println("Malformed URL:  " + url);
    } catch (IOException ioe) {
	ioe.printStackTrace();
	System.err.println("Error reading from URL:  " + url);
    } finally {
	if(br!=null) {
	    try {
		br.close();
	    } catch (IOException ex) {
		ex.printStackTrace();
		System.err.println("Couldn't close connection to url properly:  " + url);
	    }
	}
	return result;
    }
}
    public static String Rule1(String a){
    String newword="";
        for(int i=0;i<a.length();i++){
        if(isVowel(a.charAt(i))==false){
            newword+=a.charAt(i);}
        
        else{
            
            if(a.charAt(i+1)=='r'){
                if(a.charAt(i+2)==' '){
                    if(a.charAt(i)=='i'||(a.charAt(i)=='e'&&a.charAt(i-1)=='e')){
                        newword+=a.charAt(i)+"yah";
                    i++;}
                    else if(a.charAt(i)=='o'&&a.charAt(i-1)=='o'){
                        newword+=a.charAt(i)+"wah";
                        i++;}
                    else{  
                
                newword+=a.charAt(i)+"h";
                i++;}}
            else{  
                
                newword+=a.charAt(i)+"h";
                i++;}}
            
            else if(a.charAt(i+1)=='R'){
                 if(a.charAt(i+2)==' '){
                    if(a.charAt(i)=='i'||(a.charAt(i)=='e'&&a.charAt(i-1)=='e')){
                        newword+=a.charAt(i)+"YAH";
                    i++;}
                    else if(a.charAt(i)=='o'&&a.charAt(i-1)=='o'){
                        newword+=a.charAt(i)+"WAH";
                        i++;}
                    else{  
                
                
                newword+=a.charAt(i)+"H";
                i++;}}
                  else{  
                
                
                newword+=a.charAt(i)+"H";
                 i++;}}
            else{
                     newword+=a.charAt(i);
        }
    }
    }
        
    
    
    return newword;}
    
    public static String Rule2(String a){
        String newword="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='a'||a.charAt(i)=='A'){
                newword+=a.charAt(i);}
            else{
                if(a.charAt(i+1)==' '){
                    if(a.charAt(i-1)==' '){
                        newword+=a.charAt(i);}
                    else{
                        if(a.charAt(i)=='a'){
                            newword+=a.charAt(i)+"r";}
                        else{newword+=a.charAt(i)+"R";}
                    }}
               else{
                        newword+=a.charAt(i);}
                
            }
        }
    a=newword;
            return newword;
    }
    public static String Rule3(String a){
        String newword="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='v'||a.charAt(i)!='V'){
                newword+=a.charAt(i);}
            else{
                if(a.charAt(i+1)=='e'&&a.charAt(i+2)=='r'&&a.charAt(i+3)=='y'&&a.charAt(i-1)==' '){
                    if(a.charAt(i)!='v'){
                    newword+="wicked";
                    i=i+3;}
                    else{newword+="Wicked";}}
                else{newword+=a.charAt(i);}
                }
  }
       
    return newword;}
   
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
    
    public static void main(String[] args) {
        String script=getWebContents("https://cis.temple.edu/~jfiore/2017/spring/1068/assignments/08/files/jaws.txt");
       
       script=Rule1(script);
        script=Rule2(script);
        script=Rule3(script);
        saveDoc(script,"brody-crib-sheet.txt");
   
    
}}
