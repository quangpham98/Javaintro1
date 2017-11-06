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
public class NewClass1  {
 
    public static void main(String[] args) {
        
    BankAccount q=new BankAccount(1,"a",15);
    BankAccount g=new BankAccount(1,"d",15);
    System.out.println(g.balance);
    g.transfer(q,10);
    }
}
