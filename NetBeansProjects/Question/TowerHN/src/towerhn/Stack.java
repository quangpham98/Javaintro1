/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerhn;
public class Stack<E> {
    Node<E> top;
String name;
public boolean empty(){
    return top==null;
}

public void push(E item){
    Node<E> temp=new Node(item);
    temp.next=top;
    top=temp;
}

public E peek(){
    return top.item;
}

public E pop(){
    E retval=top.item;
    top=top.next;
    return retval;
}}
