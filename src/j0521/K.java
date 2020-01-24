package j0521;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class K {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();

        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");

        Iterator it=s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
