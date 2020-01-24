package j0521;

import java.util.*;

public class I {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();

        map.put("A",1);
        map.put("B",3);
        map.put("C",2);
        map.put("D",4);

        Set<String> s=map.keySet();
        Iterator<String> it=s.iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next()));
        }

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -(o1.getValue()-o2.getValue());
            }
        });

        for (Map.Entry<String,Integer> m:
             list) {
            System.out.println(m.getKey()+"---"+m.getValue());
        }
    }
}
