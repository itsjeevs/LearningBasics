package com.learning.ds;

/**
 * Created by jejoseph on 3/12/15.
 */
public class Queue<E> {
    Node<E> qEntry;
    Node<E> qExit;

    public Queue(){
        qEntry = null;
        qExit = null;
    }
    public Queue(E value){
        Node<E> node = new Node<E>(value);
        qEntry = node;
        qExit = node;
    }
    public void neatPrint() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            Node<E> runner = qEntry;
            while(runner != null){
                runner.neatPrint();
                runner = runner.next;
            }
        }
    }

    public boolean isEmpty() {
        if (qEntry == null && qExit == null) {
            return true;
        }
        return false;
    }

    public void push(Node<E> node){
        if(isEmpty()){
            qEntry = node;
            qExit = node;
        }
        node.next = qEntry;
        qEntry = node;
    }

    public Node<E> pop(){
        if(isEmpty()) {
            return null;
        }
        Node<E> node = qEntry;
        while(!node.next.equals(qExit)) {
            node = node.next;
        }
        Node<E> eNode = qExit;
        qExit = node;
        return eNode;
    }
}
