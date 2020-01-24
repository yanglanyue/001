package j0521;
/**
 * Map的遍历
 * 遍历键、遍历值、遍历键值
 *
 * */
import org.junit.Test;

import java.util.*;

public class H {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> table=new Hashtable<>();

        map.put("A",100);
        map.put("B",200);
        map.put("C",300);

        Set<String> s=map.keySet();

        Iterator<String> it=s.iterator();
//        while (it.hasNext()){//遍历键
//            System.out.println(it.next());//得到键
//        }
        while (it.hasNext()){//遍历值
            System.out.println(map.get(it.next()));//得到值（通过键）
        }

        Collection cs=map.values();
        Iterator<Integer> it1=cs.iterator();
        while (it1.hasNext()){//遍历值
            System.out.println(it1.next());//得到值（直接）
        }

        Set<Map.Entry<String, Integer>> set=map.entrySet();
        Iterator<Map.Entry<String, Integer>> it2=set.iterator();
        while (it2.hasNext()){//遍历键值
            Map.Entry<String, Integer> e=it2.next();
            System.out.println(e.getKey()+"："+e.getValue());
        }

        for (String key:map.keySet()) {//遍历值（通过键）
            System.out.println(map.get(key));
        }
        for (Integer value:map.values()) {//遍历值（直接）
            System.out.println(value);
        }
    }

    @Test//Hashtable/HashMap
    public void go(){
        //HashMap没有Enumeration，和枚举不搭边
        //Hashtable有Enumeration
        Hashtable<Integer,Integer> map=new Hashtable<>();
        map.put(1,100);
        map.put(2,200);
        map.put(3,300);

        Enumeration<Integer> es=map.elements();
        while(es.hasMoreElements()){
            System.out.println(es.nextElement());
        }
    }
}
