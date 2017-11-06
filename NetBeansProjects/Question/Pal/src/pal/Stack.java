
package pal;


public class Stack<E> {
    Node<E> top;

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
