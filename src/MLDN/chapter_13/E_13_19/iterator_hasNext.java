package MLDN.chapter_13.E_13_19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator_hasNext {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        all.add("Hello");
        all.add("_");
        all.add("World");

        Iterator<String> iter = all.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + "、");
        }
    }
}
