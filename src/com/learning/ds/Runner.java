package com.learning.ds;

/**
 * Created by jejoseph on 3/3/15.
 */
public class Runner {
    public static void main(String args[]) {
        LinkedList list = new LinkedList<String>();
        list.add(new Node<String>("Jeevan"));
        list.add(new Node<String>("Joseph"));
        list.add(new Node<String>("Meriya"));
        list.add(new Node<String>("Thomas"));

        list.neatPrint();
//        list.search("Meriya").neatPrint();
        list.insertFirst(new Node<String>("Undampori"));
        list.neatPrint();
        list.delete("Joseph");
        list.neatPrint();
        list.delete("Undampori");
        list.neatPrint();
        list.delete("Thomas");
        list.neatPrint();
        list.findMidNode().neatPrint();
    }
}
