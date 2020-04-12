package MLDN.chapter_13.E_13_28;

import java.util.*;

public class hash_map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("mldn", "www.mldn.com");
        map.put("zhinangtuan", "www.zhinangtuan.com");
        map.put("java", "www.java.com");

        String str = map.get("java");
        System.out.print("取出的内容是：" + str);

        System.out.println();
        if (map.containsKey("zhinangtuan")){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
        if (map.containsValue("www.java.com")){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }

        // 输出全部的key
        // keySet()方法将一个Map中的全部key变为一个Set集合
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + "、 ");
        }

        System.out.println();
        // 输出全部的value
        // values()方法返回Collection
        Collection<String> values = map.values();
        Iterator<String> iter2 = values.iterator();
        while (iter2.hasNext()){
            System.out.print(iter2.next() + "、 ");
        }
    }
}
