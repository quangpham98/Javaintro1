/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quangpham
 */
public class Node<E> {
    
	E item;
	Node<E> next;
        Node<E>prev;
	
	public Node() {

		this.item = null;
		this.next = null;
                this.prev=null;
		
	}
	
	public Node(E e) {
		this.item = e;
		this.next = null;
                this.prev=null;
	}
	
	
	public E getElement() {
		return this.item;
	}
	
	
	public void setElement(E element) {
		this.item= element;
	}

}

    

