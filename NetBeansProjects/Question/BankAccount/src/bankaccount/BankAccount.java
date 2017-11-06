/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author Quangpham
 */
public class BankAccount {
long accountId;
String name;
double balance=0;

public BankAccount(long a,String b,double c){
    accountId=a;
    name=b;
    balance=c;
    
}

public void transfer(BankAccount a,double c){
    a.balance+=c;
    balance-=c;
    
    System.out.println(balance);
    System.out.println(a.balance);
}
    /**
     * @param args the command line arguments
     */
    
    
    
}
