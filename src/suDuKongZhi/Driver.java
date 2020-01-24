package suDuKongZhi;

public class Driver {

    public static String country="地球人";

    private int A;
    int B;
    protected int C;
    public int D;

    public static void main(String[] args) {
        Car BMW = new Car();
        BMW.setColor("white");
        BMW.setType("X6");
        BMW.getColor();
        BMW.getType();

        Driver driver1 = new Driver();
        String name="杨岚岳";
        driver1.setName(name);
        driver1.setAge(50);
        driver1.setCompany(name);
        driver1.setBracket(50);

        Car car1 = new Car();
        int a = 100;
        car1.setSpeed(a);
        car1.setType("truck");

        System.out.print("当前驾驶员：" + driver1.getName() +"，" + driver1.getAge() +"岁，");
        driver1.getBracket();
        System.out.print("来自：" );
        driver1.getCompany();
        System.out.print("当前速度："+ a +"km/h");
        System.out.println("已强制降速至：" + car1.getSpeed() + "km/h");
    }

    private String name;
    private String company;
    private int age;
    private String bracket;

//    Driver(int age){
//        this.age=0;
//    }
//
//    Driver(String name){
//        this.name="driver";
//    }

    public void setName(String name) {
        this.name = name;
    }

    ;

    public String getName() {
        return name;
    }

    ;

    public void setCompany(String name) {
        if (name.equals("马云")) {
            this.company = "阿里巴巴";
        } else if (name.equals("马化腾")) {
            this.company = "腾讯";
        } else if (name.equals("雷军")) {
            this.company = "小米";
        } else if (name.equals("李彦宏")) {
            this.company = "百度";
        } else {
            company = "不知道哪路的";
        }
    }
    public void getCompany(){
        System.out.println(company);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBracket(int age) {
        if (age > 60) {
            this.bracket = "老年";
        } else if (age < 30) {
            this.bracket = "青年";
        } else {
            this.bracket = "中年";
        }
    }
    public void getBracket(){
        System.out.println(bracket);
    }
}
