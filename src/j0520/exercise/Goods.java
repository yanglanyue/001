package j0520.exercise;

import java.io.Serializable;

public class Goods implements Serializable {//Serializable：序列化，变成字节的形式方便存储
    private int no;
    private String name;
    private float price;
    private int quantity;

    public Goods() {
    }

    public Goods(int no, String name, float price, int quantity) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
