package MLDN.chapter_12.E_12_27;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/*
* 字符流使用了缓冲区，而字节流没有使用缓冲区
* */

public class writer_no_close {
    public static void main(String[] args) throws Exception{
        String path = File.separator + "Users" + File.separator + "matteo" + File.separator + "java_io"
                + File.separator + "test.txt";
        File f = new File(path);
        Writer wr = new FileWriter(f, true);
        String str = "\thuakeda";
        wr.write(str);

        // 字符流在操作时使用了缓冲区，通过缓冲区再操作文件。
        // 在关闭字符流时会强制性地将缓冲区中的内容进行输出，如果没有关闭，则缓冲区中的内容不会输出
        // 可使用flush()方法强制刷新缓冲区
        wr.flush();
    }
}
