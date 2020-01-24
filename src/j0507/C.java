package j0507;
/*
* 对象数组
* */
import java.util.Arrays;

public class C {
    private static int [] i={9,0,4,10,1,2,3,4,5};
    private static String s[]={"","",""};
    public static void main(String[] args) {
        Arrays.sort(i);//排序
        System.out.println(Arrays.binarySearch(i,3));//JDK的二分查找法查找整数3

        //对象数组
        Dog [] d={
                new Dog(10,"MIKE"),
                new Dog(15,"ROSE"),
                new Dog(5,"JACK")
        };
        for (Dog a:d) {
            System.out.printf("%d -- %s\n",a.getAge(),a.getName());
        }
        Arrays.sort(d);
        for (Dog a:d) {
            System.out.printf("%d -- %s\n",a.getAge(),a.getName());
        }
        System.out.println(Arrays.binarySearch(d,new Dog(10,"MIKE")));
    }
}
class Dog implements Comparable{
    private int age;
    private String name;

    public Dog() {}

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Dog d=(Dog)o;//比的是Dog里的age和name，所以Object必须强转
        return this.age-d.age==0?this.name.compareTo(d.name):this.age-d.age;
        /*
        * ?：三目运算符
        * .compareTo()，相关知识点在package j0507下A类第45行
        * */
    }
}