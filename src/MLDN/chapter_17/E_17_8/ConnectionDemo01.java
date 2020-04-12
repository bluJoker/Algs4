package MLDN.chapter_17.E_17_8;

import java.util.StringTokenizer;

public class ConnectionDemo01 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static void main(String[] args){
        try {
            Class.forName(DBDRIVER);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
