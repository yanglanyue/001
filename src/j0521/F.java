package j0521;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class F {
    public static void main(String[] args) {
        Properties pro=new Properties();
        try {
            pro.load(new FileInputStream(new File("my")));
            Set<Object> s=pro.keySet();
            Iterator iterator=s.iterator();

            while (iterator.hasNext()){
                System.out.println(pro.get(iterator.next()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
