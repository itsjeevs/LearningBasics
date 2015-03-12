package com.learning.ds;

/**
 * Created by jejoseph on 3/12/15.
 */
public class Stack<E> {
    Node<E> head;

    public Stack(){
        head = null;
    }
    public Stack(E value){
        head = new Node<E>(value);
    }
    public void neatPrint() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
        } else {
            Node<E> runner = head;
            while(runner != null){
                runner.neatPrint();
                runner = runner.next;
            }
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void push(Node<E> node){
        node.next = head;
        head = node;
    }

    public Node<E> pop(){
        if(isEmpty()) {
            return null;
        }
        Node<E> node = head;
        head = head.next;
        return node;
    }
}
