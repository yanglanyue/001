package j0521.Reflect;

public class People {
    public class P1{
        public P1() {
        }

        public void go(){
            System.out.println("hello");
        }
    }

    public String address;

    private int age;
    private String name;

    public People() {
    }

    public People(int age, String name) {
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

}
