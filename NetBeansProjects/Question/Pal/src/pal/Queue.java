
package pal;

public class Queue<E> {
    Node<E> front;
    Node<E> back;

public boolean empty(){
    return front==null;
}

public E peek(){
    return front.item;
}

public boolean offer(E item){
    Node<E> temp=new Node(item);
    if(empty()){
        front=temp;
        back=temp;
    }
    else{
        back.next=temp;
        back=temp;
    }
return true;
}

public E poll(){
    E retval=front.item;
    if(front.next==null){
        front=null;
        back=null;
    }
    else{
        front=front.next;
    }
return retval;
}
}


