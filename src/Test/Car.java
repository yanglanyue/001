package Test;

public class Car {
    //颜色
    private String color;
    //制造国
    private String country;

    Car(){}

    public void setColor(String color) {
        this.color = color;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }
}

class BMW extends Car{
    //型号
    private String model;
    //等级
    private String level;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

class TOYOTA extends Car{
    //型号
    private String model;
    //等级
    private String level;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
