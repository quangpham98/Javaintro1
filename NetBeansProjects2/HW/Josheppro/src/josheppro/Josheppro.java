/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josheppro;
import java.util.Random;
import java.util.Iterator;
/**
 *
 * @author Quangpham
 */
public class Josheppro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
		CircularLinkedList<Integer> l =  new CircularLinkedList<>();
		int n=200;
		int k=7;
		
Random rand = new Random();


		// add your nodes here!
		for(int i=0;i<n;i++){
                    int a=rand.nextInt(50);
                    l.add(i,i+1);
                    
       
    }
          
                   
                  System.out.println(l.toString());
		// add your nodes before this
		// use the iterator to iterate around the list
		Iterator<Integer> iter = l.iterator();
               int a=0;
                while(l.size>1){
                for(int i=1;i<k+1;i++){
                   iter.next();
              
                   if(i==k){
                     iter.remove();
                     System.out.println(l.toString());
                   }
                   
               }}
		
		System.out.println(l.toString());
		
		
		
	}

    }
    

