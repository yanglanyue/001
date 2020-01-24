package j0520;

public class FanXing<T,E> {
    private T age;

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        if(name instanceof String){//instanceof：判断name是否从属于String类型
            System.out.println("String");
        }
        this.name = name;
    }

    private E name;

}
