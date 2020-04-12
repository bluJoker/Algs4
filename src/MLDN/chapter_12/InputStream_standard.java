package MLDN.chapter_12;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStream_standard {
    public static void main(String[] args) throws Exception{
        // 从标准输入(键盘)读取数据
        InputStream input = System.in;

        byte[] b = new byte[1024];

        // Returns:
        // the total number of bytes read into the buffer,
        // or -1 if there is no more data because the end of the file has been reached.
        int len = input.read(b);
        System.out.println("写入字节数目：" + len);
        System.out.print(new String(b, 0, len));

        input.close();
    }
}
