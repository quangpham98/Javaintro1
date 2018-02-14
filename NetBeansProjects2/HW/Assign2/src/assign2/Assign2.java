/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;
import java.util.*;
/**
 *
 * @author Quangpham
 */
public class Assign2 {
public static <E> String toString(List <E> list){
    String a="";
    for(int i=0;i<list.size();i++){
        a=a+(list.get(i))+"/n";
    }
return a;

}

public static String cleanstuff(String a){
    String new1="";
    String stuff="!@#$%^&*(),.<;':'";
    for(int i=0;i<a.length();i++){
        if(stuff.indexOf(a.charAt(i))==-1){
            new1+=a.charAt(i);
        }
    }
 return new1;           
}

public static <E> boolean unique(List <E> list){
    List<E> tem= new ArrayList<E>();
    tem=list;
    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            
        
        if(tem.get(i)==list.get(j)||tem.get(i).equals(list.get(j))){
            return false;
        }
    }}
  return true;  
}

public static int sum(List<Integer> list){
    int total=0;
    for(int i=0;i<list.size();i++){
        total+=list.get(i);
    }
return total;
}

public static List<Integer> allMultiples(List<Integer> list,int a){
    List<Integer> newo=new ArrayList<Integer>();
    for(int i=0;i<list.size();i++){
        if(list.get(i)%a==0){
            newo.add(list.get(i));
        }
    }
  return newo;  
}

public static List<String> allStringsOfSize(List<String> list,int a){
    List<String> newo=new ArrayList<String>();
    for(int i=0;i<list.size();i++){
        if(list.get(i).length()==a){
            newo.add(list.get(i));
        }
    }
return newo;
}
public static List<String>stringToListOfWords(String a){
    
    List<String> newo=new ArrayList<String>();
    String [] b=a.split(" ");
    for(int i=0;i<b.length;i++){
       b[i]=cleanstuff(b[i]);
    newo.add(b[i]);
    }
return newo;
}

public static <E> void removeAllInstances(List<E> list,E a){
   int con=list.size();
    for(int i=0;i<con;i++){
        if(list.get(i)==a||(list.get(i)).equals(a)){
            list.remove(a);
            con=con-1;
        }}
     
  
}



   
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<Integer>();
s.add(5);s.add(8);s.add(9);s.add(12);s.add(20);s.add(55);s.add(0);s.add(11);s.add(9);s.add(11);s.add(9);

List<Integer> c = new ArrayList<Integer>();
 c.add(1);c.add(2);c.add(3);

//Test method unique
System.out.println(unique(s));
System.out.println(unique(c));

//Test method Sum
System.out.println(sum(s));
System.out.println(sum(c));

///Test method Multiples
List<Integer> b = new ArrayList<Integer>();
b=allMultiples(s,2);
 System.out.println(b.toString());
 
//Test method Strings of Size
List<String> new1=new ArrayList<String>();
 new1.add("dcmm");new1.add("hi");new1.add("condiem");new1.add("dddd");new1.add("sad");
   List<String> new2=new ArrayList<String>();
    new2=allStringsOfSize(new1,3);
 System.out.println(new2.toString());
    
 //Test method String list to Words   
 System.out.println(stringToListOfWords("DM, anh nghi la! anhyeu e: quyk zyn: "));  

//Test method Remove All Instance
removeAllInstances(c,1);
System.out.println(c.toString());
    }}