package MLDN.chapter_13.E_13_33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map_iterator {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("mldn", "www.mldn.com");
        map.put("zhinangtuan", "www.zhinangtuan.net.cn");
        map.put("mldnjava", "www.mldnjava.cn");

        // 1、将Map接口的实例通过entrySet()方法变为Set接口实例
        Set<Map.Entry<String, String>> allSet = map.entrySet();

        // 2、通过Set接口实例为Iterator实例化
        Iterator<Map.Entry<String, String>> iter = allSet.iterator();
        while (iter.hasNext()){
            // 3、通过Iterator迭代输出，每个内容都是Map.Entry的对象
            Map.Entry<String, String> me = iter.next();

            //4、通过Map.Entry进行key、value分离
            System.out.println(me.getKey() + " --> " + me.getValue());
        }
    }
}
