package MLDN.chapter_13.E_13_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class array_list {
    public static void main(String[] args) {
        List<String> allList = new ArrayList<String>();
        Collection<String> allCollection = new ArrayList<String>();
        allList.add("Hello"); // 从Collection继承的方法
        allList.add(0, "World"); // List扩充的方法
        System.out.println(allList);

        allCollection.add("LXH");
        allCollection.add("www.mldn.com");

        allList.addAll(allCollection);
        System.out.println(allList);

        // 集合中数据增加的顺序即为输出后的顺序，即集合本身顺序不会发生改变
        for (int i=0; i<allList.size(); ++i){
            System.out.print(allList.get(i) + "、 ");
        }
    }
}
