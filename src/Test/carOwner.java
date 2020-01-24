package Test;

public class carOwner {
    private String name;
    private int age;
    private String sex;
    private String address;

    carOwner(){

    }

    carOwner(String name,int age,String sex,String address,int speed){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.address=address;
        this.speed(speed);
        this.print();
    }

    public void print(){
        System.out.println("车主信息："+this.getName()+"，"+this.getSex()+"，"+this.getAge()+"，"+this.getAddress());
    }

    public int speed(int speed){
        if(speed <= 60){
            System.out.println("时速："+speed+"km/h");
            System.out.println("低速行驶");
        }else if(speed>=120){
            System.out.println("时速："+speed+"km/h");
            System.out.println("超速行驶");
        }else {
            System.out.println("时速："+speed+"km/h");
            System.out.println("正常行驶");
        }
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

