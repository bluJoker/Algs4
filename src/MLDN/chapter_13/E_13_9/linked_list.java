package MLDN.chapter_13.E_13_9;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("A");
        link.add("B");
        link.add("C");

        // element() 找到表头
        System.out.println("1-1、element()方法找到表头：" + link.element());
        System.out.println("1-2、找完之后的链表内容：" + link);

        // peek() 找到不删除表头
        System.out.println("2-1、peek()方法找到表头：" + link.peek());
        System.out.println("2-2、找完之后的链表内容：" + link);

        // poll() 找到并删除表头
        System.out.println("3-1、pool()方法找到表头：" + link.poll());
        System.out.println("3-2、找完之后的链表内容：" + link);
    }
}
