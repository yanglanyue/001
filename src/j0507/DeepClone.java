package j0507;
/**
 * .clone：深层克隆
 * */
public class DeepClone {
    public static void main(String[] args) {
        Sheep s=new Sheep("白色");
        Bird b=new Bird(10,"mike",s);

        try {
            Bird b1=(Bird) b.clone();
            b.getSheep().setColor("黑色");

            System.out.println(b1.getSheep().getColor());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Sheep implements Cloneable{
    private String color;

    public Sheep(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override//相关联的类也要重写克隆
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Bird implements Cloneable{
    private int age;
    private String name;
    private Sheep sheep;


    public Bird(int age, String name, Sheep sheep) {
        this.age = age;
        this.name = name;
        this.sheep = sheep;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setPro(Sheep sheep) {
        this.sheep = sheep;
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

    @Override//clone方法需要重写
    protected Object clone() throws CloneNotSupportedException {//CloneNotSupportedException（clone不支持异常）
        Bird b=(Bird) super.clone();//将父类的clone方法强转（降级）为
        b.sheep=(Sheep) this.sheep.clone();
        return b;
    }
}