package j0520;
/**
 * 6种迭代
 *
 * ArrayList();//线程异步，性能快，不安全
 * Vector();//线程同步，性能慢，安全
 * */
import org.junit.Test;

import java.util.*;

public class JiHe1 {
    public static void main(String[] args) {

    }

    @Test//迭代（6种迭代）
    public void go(){
        List list=new ArrayList();//线程同步，性能慢，安全

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("==========方法1");

        Iterator it=list.iterator();//1.单向列表迭代（推荐）
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("==========方法2");

        ListIterator lit=list.listIterator();//2.双向列表迭代
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        System.out.println("==========方法3");

        //3.迭代
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("==========方法4");

        //4.迭代（推荐）
        for (Object s:list) {
            System.out.println(s);
        }

        System.out.println("==========方法5");

        //5.迭代
        Object[] os=list.toArray();
        for (Object o:os) {
            System.out.println(o);
        }

        System.out.println("==========方法6");

        //6.迭代、泛型<>
        Vector<Integer> list1=new Vector<Integer>();//线程异步，性能快，不安全
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        Enumeration es=list1.elements();

        while (es.hasMoreElements()){
            System.out.println(es.nextElement());
        }
    }
}
