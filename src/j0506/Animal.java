package j0506;
/**
 * 2019-5-23
 * equals的重写
 *
 * */
public class Animal {
    private int age;
    private String name;

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

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {//equals的重写
        //是否是同一个堆
        if(this==obj){
            return true;
        }
        if(obj==null){//被比对象没有堆，不能比较
            return false;
        }
        if(this.getClass()!=obj.getClass()){//.getClass表示这个对象所属的类，不属于同一种族
            return false;
        }
        Animal a=(Animal) obj;//以上三种情况都排除，只有比较其成员，必须强转（最费时间）

        return this.age==a.age&&this.name.equals(a.name);
    }
}

class Test{
    public static void main(String[] args) {
        Animal a=new Animal(10,"MIKE");
        Animal a1=new Animal(10,"MIKE");
        System.out.println(a==a1);//全等==比较的是栈的值（堆地址），a和a1的栈的值不是同一个东西
        System.out.println(a.equals(a1));//重写equals，a和a1得内容相同
    }
}
