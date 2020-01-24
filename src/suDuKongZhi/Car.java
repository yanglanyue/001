package suDuKongZhi;

public class Car {

    private double speed;
    public String type;
    public String color;

    Car(){
        this.color="red";
        this.type="760Li";
    }

    Car(String color,String type){
        this.color=color;
        this.type=type;
    }

    Car(double speed){
        this.speed=0;
    }

    Car(String type){
        this.type="car";
    }

    public String setColor(String color){
        this.color=color;
        return color;
    }

    public String setType(String type){
        this.type=type;
        return type;
    }
    public void getColor(){
        System.out.println(new Car().color);
    }
    public void getType(){
        System.out.println(new Car().type);
    }

    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed) {
        if (speed > 80) {
            this.speed = 60;
            System.out.println("危险！");
        } else {
            this.speed = speed;
            System.out.println("安全！");
        }
    }

//    public void setType(String type){
//        if (type=="truck"){
//            this.type=type;
////            System.out.println("危险！");
//        }else {
//            this.type = type;
//        }
//    }
}
