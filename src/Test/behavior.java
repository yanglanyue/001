package Test;

public class behavior {
    private float speed;
    Car car=new Car();
    BMW bmw=new BMW();
    TOYOTA toyota=new TOYOTA();

//    carOwner carOwner=new carOwner("马云",50,"男","杭州",150);
//    carOwner l=new carOwner("雷军",45,"男","北京");

//    public int speed(int speed){
//        if(speed <= 60){
//            System.out.println("时速："+speed+"km/h");
//            System.out.println("低速行驶");
//        }else if(speed>=120){
//            System.out.println("时速："+speed+"km/h");
//            System.out.println("超速行驶");
//        }else {
//            System.out.println("时速："+speed+"km/h");
//            System.out.println("正常行驶");
//        }
//        return speed;
//    }

    public static void main(String[] args) {

        carOwner carOwner=new carOwner("马云",50,"男","杭州",150);

//        carOwner f=new carOwner();
//        f.setName("范冰冰");
//        f.setSex("女");
//        f.setAge(38);
//        f.setAddress("北京");
//
//        BMW  cf=new BMW();
//        cf.setModel("M6");
//        cf.setColor("红色");
//        cf.setCountry("德国");
//        cf.setLevel("运动型");
//
//        System.out.println("车主信息："+f.getName()+"，"+f.getSex()+"，"+f.getAge()+"，"+f.getAddress());
//        System.out.println("车辆信息："+cf.getModel()+"，"+cf.getColor()+"，"+cf.getCountry()+"，"+cf.getLevel());
//        new behavior(180);
    }
    behavior(){

    }

//    behavior(float speed,carOwner carOwner,Car car){
//        this.speed=speed;
//        this.carOwner=carOwner;
//        this.car=car;
//    }

    public behavior(int speed){
        if(speed>120){
            new behavior().print1();
        }
    }

    public void print1(){
//        System.out.println("车主信息："+carOwner.getName()+"，"+carOwner.getSex()+"，"+carOwner.getAge()+"，"+carOwner.getAddress());
//        System.out.println("车辆信息："+bmw.getModel()+"，"+bmw.getColor()+"，"+bmw.getCountry()+"，"+bmw.getLevel());
//        System.out.println("超速行驶！");
    }

    public static class j {
    }
}
