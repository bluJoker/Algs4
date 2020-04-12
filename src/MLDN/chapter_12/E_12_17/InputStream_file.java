package MLDN.chapter_12.E_12_17;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

public class InputStream_file {
    public static void main(String[] args) throws Exception{
        String path = File.separator + "Users" + File.separator + "matteo" + File.separator + "java_io"
                + File.separator + "test.txt";
        File f = new File(path);
        InputStream input = new FileInputStream(f);

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
