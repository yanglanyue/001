package j0507;
/**
 * .clone：浅层克隆
 * Object的clone是protected（受保护的），需要自己写
 * */
public class FleetClone extends Object{
    public static void main(String[] args) {
        color co=new color("蓝色");//实例化color类，并将co的color设置为“蓝色”（在外面进行实例化，属于聚合）

        Cat c=new Cat(10,"花猫",co);//实例化Cat类，并将c的age设置为10，name设置为“花猫”，color设置为实例co
        try {//还必须以try catch的形式实行克隆

            Cat c1=(Cat) c.clone();//对c进行克隆，并强转为Cat类生成新的实例c1
            System.out.println(c1.getColor().getColor());//输出实例c1的getColor()方法的getColor()方法

            c.setName("黑猫");//从新对实例c的name进行赋值
            c.getColor().setColor("红色");//从新对实例c的getColor()方法的getColor()方法进行赋值为“红色”

            System.out.println(c1.getName());
            System.out.println(c1.getColor().getColor());
            /**
             * 克隆失败（浅层克隆）：
             * 按理说c1克隆的c，对c的setColor()做改变不会影响到c1的setColor()，
             * 但事实却是c1的setColor()也连同被改变了。
             * 实例c所牵连的属性color只是以引用方式指向了c1，所以c的color改变的时候c1的color也会随之改变
             * */
        } catch (CloneNotSupportedException e) {//捕获错误
            e.printStackTrace();//打印栈轨迹
        }
    }
}

class color{
    private String color;

    public color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Cat implements Cloneable{
    private int age;
    private String name;
    private color color;

    public Cat(int age, String name, color color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public color getColor() {
        return color;
    }

    public void setColor(color color) {
        this.color = color;
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
        return super.clone();
    }
}