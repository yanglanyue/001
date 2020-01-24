package suDuKongZhi;

public class Car1 extends Car {
    private String made;

    Car1(){

    }

    Car1(String color,String type,String made){
        super("silver","M6");
        this.made="BMW";
    }

    Car1(String color){
        this.color=color;
        this.made="华晨宝马";
    }
}
