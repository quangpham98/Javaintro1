/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;
public class Test {
 
    public static void Twice(){
    Scanner input=new Scanner(System.in);
    System.out.println("Please give me a double");
    try{
        double b=input.nextDouble();
   b=b*2;
   System.out.println(b);
    }
    catch(Exception e){
        System.out.println("wrong input");
    }
 }
    
    public static int minmax(List<Integer> list){
        int min=list.get(0);
        int max=list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
            
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
    }}System.out.println(min);
    System.out.println(max);
    int a=min+max;
    return a;
    }
    public static void removePrefixStrings(List<String> list, String prefix){
        for(int i=0;i<list.size();i++){
            if(list.get(i).indexOf(prefix)==0){
              
                System.out.println("del"+list.get(i));
                list.remove(i);
                i=i-1;
            }
        }
  for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
  }
    }
    
  
    
    
   
    public static void main(String[] args) {
List<Integer> li=new ArrayList<Integer>();
        li.add(1);li.add(2);li.add(2);li.add(4);li.add(4);li.add(8);li.add(3);li.add(9);
    List <String> li2=new ArrayList<String>();
    li2.add("pama");li2.add("pakaka");li2.add("ohoho");li2.add("dca");li2.add("payoto");
    
     Twice();
             System.out.println(minmax(li));
             removePrefixStrings(li2,"pa");
 
}}
