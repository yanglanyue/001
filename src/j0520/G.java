package j0520;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class G {

    @Test
    public void go(){
        LinkedList<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addLast(6);
        list.offer(7);//对应Double queue
        list.offerFirst(8);
        list.offerLast(9);

        list.remove();//对应Collection
        list.removeFirst();
        list.removeLast();

        list.push(10);
        list.pop();//对应stack
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();

        System.out.println(list.peek());//只看不删
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.poll();//又看又删
        list.pollFirst();
        list.pollLast();
        System.out.println("===========");

        Iterator<Integer> it=list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
