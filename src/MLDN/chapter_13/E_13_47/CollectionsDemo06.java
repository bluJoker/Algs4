package MLDN.chapter_13.E_13_47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo06 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        Collections.addAll(all, "1、MLDN", "2、LXH", "X、mldnjava");
        Collections.addAll(all, "B、www.mldn.com");
        Collections.addAll(all, "A、www.dmlnjava.cn");
        System.out.println("排序之前的集合：");
        Iterator<String> iter = all.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + "、");
        }
        Collections.sort(all);
        System.out.println("排序之后的集合：");
        iter = all.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + "、");
        }
    }
}
