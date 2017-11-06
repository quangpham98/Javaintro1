
package assignment7;
//Quang Pham TUID 915371602 
import java.util.Scanner;
public class Assignment7 {
public static final String vowels="ueoaiUEOAI";

    /* returns true if c is an upper case or lower case vowel
    * or false otherwise */
    public static boolean isVowel(char c){
        if (vowels.indexOf(c)!=-1){
            return true;}
        else{return false;}
        }
    

    /* returns the index of the first vowel in s or -1
     * if s contains no vowels */
    public static int indexOfFirstVowel(String s) {
	for(int i=0;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                return i;                
            }}
        return -1;
        
    }

    /* returns the index of the first occurrence of a vowel
     * in s starting from index startPosition or -1 if
     * there are no vowels in s at index startPosition or later */

    /* notice that this method has the same name as the previous
     * one, but that it takes a different number of arguments.
     * This is perfectly legal in Java. It's called "method overloading" */
    public static int indexOfFirstVowel(String s, int startPosition) {
	for(int i=startPosition;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                return i;                
            }}
        return -1;
    }

    /* returns the index of the last occurrence of a vowel in
     * s or -1 if s contains no vowels */
    public static int indexOfLastVowel(String s) {
	for(int i=s.length()-1;i>=0;i--){
            if(vowels.indexOf(s.charAt(i))!=-1){
                return i;                
            }}return -1;
    }

    /* returns s in reverse. For example, if s is "Apple", the method
     * returns the String "elppA" */
    public static String reversed(String s) {
	String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
            }
        return reverse;
    }

    /* returns the number of times that n occurs
     * in h. For example, if h is "Mississippi" and n is "ss"
     * the method returns 2. */
    public static int numOccurrences(String h, String n) {
	int count=0;
        while (h.indexOf(n)!=-1){
         int len2=n.length();
         int len3=h.length();
        int newstart=h.indexOf(n)+len2; 
         count+=1;
         h=h.substring(newstart,len3);}
        if(count>0){
            return count;}
        else{
         
    
        return -1;
    }}

    /* returns true if s is the same backwards and forwards
     * and false otherwise */
    public static boolean sameInReverse(String s) {
	String a=reversed(s);
       for(int i=0;i<s.length();i++) 
           if (s.charAt(i)!=a.charAt(i)){
            return false;}
        return true;
    }

    /* returns a new String which is the same as s, but with
     * all of the vowels removed. For example, if s is "summer vacation"
     * the method returns "smmr vctn" */
    public static String devoweled(String s) {
	String newword="";
        for(int i=0;i<s.length();i++){
            if (vowels.indexOf(s.charAt(i))==-1){
                newword+=s.charAt(i);}
        }
        return newword;
    }

    /* Returns a new string consisting of all of the characters of s1
     * and s2 interleaved with each other. For example, if s1 is
     * "Spongebob" and s2 is "Patrick", the
     * function returns the string "SPpaotnrgiecbkob" */
    public static String zipped(String s1, String s2) {
	int a=s1.length();
        int b=s2.length();
        String zip="";
        if(a>b){
            for(int i=0;i<b;i++){
                String mid="";
                mid+=s1.charAt(i);
                mid+=s2.charAt(i);
              
                zip+=mid;}
            
            for(int i=b;i<a;i++){
                zip+=s1.charAt(i);}
        return zip;}
       
        else if(a==b){
            for(int i=0;i<b;i++){
                String mid="";
                mid+=s1.charAt(i);
                        mid+=s2.charAt(i);
                zip+=mid;}
        return zip;}
        
        else{
                    for(int i=0;i<a;i++){
                String mid="";
                mid+=s1.charAt(i);
                        mid+=s2.charAt(i);
                zip+=mid;}
                  for(int i=a;i<b;i++){
                zip+=s2.charAt(i);}   
                    return zip;}   
       
    }

    /* returns a new String consisting of all of the letters
     * of s, but where tab characters ('\t') are replaced
     * with n spaces */
    public static String tabToSpace(String s, int n) {
	String space="";
        String newword="";
        for(int i=1;i<=n;i++){
            space+=" ";}
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='\t'){
                newword+=space;}
            else{newword+=s.charAt(i);}
        }
    return newword;
    }

    /* returns true if all of the characters in chars are
     * found in the String s, or false otherwise */
    public static boolean containsAll(String s, String chars) {
    for(int i=0;i<chars.length();i++){
        if(s.indexOf(chars.charAt(i))==-1){
            return false;}}
    return true;
    }
    
    /* returns the index of the first occurrence of any of the
     * characters in chars in String s or -1 if none of the characters
     * in chars are found in s. */
    public static String indexOfAny(String s, String chars) {
       String out="";
       int test=0;
        for(int i=0;i<chars.length();i++){
        if(s.indexOf(chars.charAt(i))!=-1){
       test+=1;
       out+="the index of "+chars.charAt(i)+":"+s.indexOf(chars.charAt(i))+"\t";
        }}
        if(test>0){return out;}
       
       return "-1";
        }			  
    public static void main(String args[]) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter char for isVowel");
    String char1=in.next();
   System.out.println(isVowel(char1.charAt(0)));
System.out.println("enter String for indexOfFirstVowel");
    String word=in.next();
    System.out.println(indexOfFirstVowel(word));
 System.out.println("enter String for indexOfFirstVowel");
    String word2=in.next();
 System.out.println("enter number for indexOfFirstVowel");
    int index1=in.nextInt();
    System.out.println(indexOfFirstVowel(word2,index1));
 System.out.println("enter word for indexOfLastVowel");   
             String word3=in.next();   
            System.out.println(indexOfLastVowel(word3));
 System.out.println("enter word for reversed");
     String word4=in.next();
     System.out.println(reversed(word4));

  System.out.println("enter 2 word  for numOccurrences");   
  String word5=in.next();
  String small=in.next();
  System.out.println(numOccurrences(word5,small));
  System.out.println("enter word for sameInReverse");    
  String reverse=in.next();
  System.out.println(sameInReverse(reverse));
  System.out.println("enter word  for devoweled"); 
  String word6=in.next();
       System.out.println(devoweled(word6));
   System.out.println("enter 2 word  for zipped");
 String zip1=in.next();
 String zip2=in.next();
       System.out.println(zipped(zip1,zip2));
    System.out.println("enter word  for tabToSpace");
    String wordtab=in.nextLine();
    System.out.println("enter number  for tabToSpace");
    int num=in.nextInt();
       System.out.println(tabToSpace(wordtab,num));
    System.out.println("enter 2 word  for containsAll");
String con1=in.next();
String con2=in.next();
       System.out.println(containsAll(con1,con2));
       System.out.println("enter 2 word  for indexOfAny");
       String test1=in.next();
       String test2=in.next();
         System.out.println(indexOfAny(test1,test2));
    
    
    }}


    
    
    