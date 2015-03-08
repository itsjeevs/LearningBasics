package com.learning.ds;

/**
 * Created by jejoseph on 3/3/15.
 */
public class LinkedList<E> {
    Node<E> first;

    public LinkedList() {
        first = null;
    }

    public LinkedList(Node<E> node) {
        first = node;
    }

    public void add(Node<E> node) {
        if (isEmpty()) {
            first = node;
        } else {
            Node ptr = first;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = node;
        }
    }

    public void insertFirst(Node<E> node) {
        System.out.print("\n## Inserting into first position: " + node);
        if (isEmpty()) {
            first = node;
        } else {
            Node<E> ptr = first;
            first = node;
            first.next = ptr;
        }
    }

    public Node<E> search(E value) {
        return search(first, value);
    }

    public Node<E> search(Node<E> node, E value) {
        if (node == null) {
            return null;
        } else {
            if (node.data.equals(value)) {
                return node;
            } else {
                return search(node.next, value);
            }
        }
    }

    public void delete(E value) {
        System.out.print("\n## Deleting " + value);
        Node<E> ptr = first;
        if (ptr == null) {
            return;
        }
        if (ptr.equals(new Node<E>(value))) {
            first = ptr.next;
        }
        while (ptr.next != null) {
            if (ptr.next.equals(new Node<E>(value))) {
                ptr.next = ptr.next.next;
                return;
            }
            ptr = ptr.next;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void neatPrint() {
        System.out.println();
        if (isEmpty()) {
            System.out.println("Empty Linked List");
        }
        if (first.next == null) {
            first.neatPrint();
        }
        Node ptr = first;
        while (ptr.next != null) {
            ptr.neatPrint();
            System.out.print("-> ");
            ptr = ptr.next;
        }
        ptr.neatPrint();
    }

    public Node<E> findMidNode(){
        if (isEmpty())
            return null;
        Node<E> runner = first;
        Node<E> fastRunner = first;
        while (fastRunner.next != null && fastRunner.next.next != null) {
            fastRunner = fastRunner.next.next;
            runner = runner.next;
        }
        return runner;
    }

    public void reverse() {
        if (isEmpty() || first.next == null) {
            return;
        }

        Node<E> runner = first.next;
        first.next = null;
        Node<E> head = first;
        Node<E> temp;
        while (runner.next != null) {
            temp = runner.next;
            runner.next = head;
            head =runner;
            runner = temp;
        }
        runner.next=head;
        first = runner;
    }

    public void recReverse(){
        if(isEmpty() || first.next == null){
            return;
        }
        reverse(first);
    }

    public Node<E> reverse(Node<E> node){
        Node<E> rest = node.next;
        if(rest == null){
            first = node;
            return node;
        }
        node.next = null;
        reverse(rest);
        rest.next = node;
        return node;
    }


    public Node<E> reverseRecursive(Node<E> node){
        Node<E> rest = node.next;
        node.next = null;
        
        return null;
    }
}
