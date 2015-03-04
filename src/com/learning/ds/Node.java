package com.learning.ds;

/**
 * Created by jejoseph on 3/3/15.
 */
public class Node<E> {
    E data;
    Node next;

    public Node() {
        data = null;
        next = null;
    }

    public Node(E type) {
        data = type;
        next = null;
    }

    public void neatPrint() {
        System.out.print(data + " ");
    }

    public boolean equals(Node<E> node) {
        if (node.data instanceof String) {
            return this.data.equals(node.data);
        } else {
            return this.data == node.data;
        }
    }
}