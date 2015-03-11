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
        Node<String> looper = new Node<String>("loop");
        list.add(looper);
        list.add(new Node<String>("Thomas"));
        list.add(new Node<String>("Lytle"));
        list.add(new Node<String>("Halstead"));
        list.add(new Node<String>("Racine"));
        list.add(new Node<String>("Taylor"));
        Node<String> ashland = new Node<String>("Ashland");
        list.add(ashland);
        ashland.next = looper;

        list.insertFirst(new Node<String>("Undampori"));
//        list.neatPrint();
//        list.delete("Joseph");
//        list.neatPrint();
//        list.delete("Undampori");
//        list.neatPrint();
//        list.delete("Thomas");
//        list.neatPrint();
//        list.findMidNode().neatPrint();
//        list.neatPrint();
//        list.recReverse();
//        list.neatPrint();

        if (list.containsLoop()) {
            System.out.println("contains loop");
        } else {
            System.out.println("no Loop");
        }
        list.removeLoop();
        neatPrint(list);

    }

    public static void neatPrint(LinkedList list){
        System.out.println();
        list.neatPrint();
    }
}
