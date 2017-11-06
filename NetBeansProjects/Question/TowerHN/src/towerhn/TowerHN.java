/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerhn;
import java.util.*;

public class TowerHN {


public static void TowerHN(Stack core,int n,String d){
    
    if(n>0){
    for(int i=n;i>0;i--){
        
        core.push(i);
        
 
    }}
    
    core.name=d;
}


public static void solve(int n, Stack a,Stack b,Stack c) {
 if (n > 0){
   solve(n - 1, a, c, b);
    
   b.push(a.peek());
   System.out.println(" Move "+ a.peek()+" from " +a.name+" to "+ b.name);
   a.pop();
   solve(n - 1, c, b, a);
 }}

public static void main(String[] args) {
    int n=7;    
   Stack left=new Stack();
Stack right=new Stack();
TowerHN(right,0,"right");
Stack mid=new Stack();
TowerHN(left,n,"left");
TowerHN(mid,0,"mid");
solve(n,left,right,mid);
}}

    

