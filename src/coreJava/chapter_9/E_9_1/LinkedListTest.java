package coreJava.chapter_9.E_9_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");
        System.out.println("List a: " + a);

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");
        System.out.println("List b: " + b);

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()){
            if (aIter.hasNext()){
                aIter.next();
            }
            aIter.add(bIter.next());
        }
        System.out.println("add List a: " + a);

        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next(); // skip one elements
            if (bIter.hasNext()){
                bIter.next(); // skip next element which should be removed
                bIter.remove(); // remove that element
            }
        }
        System.out.println("remove List b: " + b);

        a.removeAll(b);
        System.out.println("removeAll List a: " + a);

        System.out.println("add before b: " + b);
        bIter = b.iterator();
        b.add("F");
        System.out.println("add after b1: " + b);
        b.add("G");
        System.out.println("add after b2: " + b);

        ListIterator<String> cIter = b.listIterator();
        System.out.println(cIter.next());
        cIter.next();
        cIter.add("H");
        System.out.println("add after b3: " + b);

        System.out.println("===================");
        List<String> staff = new LinkedList<>();
        staff.add("C");
        staff.add("R");
        staff.add("D");
        System.out.println("iterator before: " + staff);
        ListIterator<String> iter = staff.listIterator();
        iter.next();
        iter.add("Juliet");
        System.out.println("iterator after: " + staff);
    }
}
