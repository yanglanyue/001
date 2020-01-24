package j0520.exercise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyCart {
    public static List<Food> list = new ArrayList<Food>();
}

class Buy {
    public static void main(String[] args) {
        Buy buy = new Buy();

        Food f1 = new Food(001, "方便面", 3, 3, "包");
        buy.buy(f1);
        Food f2 = new Food(002, "火腿肠", 2, 2, "根");
        buy.buy(f2);
        Food f3 = new Food(003, "可乐", 3, 1, "瓶");
        buy.buy(f3);
        Food f4 = new Food(004, "饼干", 12, 2, "包");
        buy.buy(f4);
        Food f5 = new Food(002, "火腿肠", 2, 2, "根");
        buy.buy(f5);
        Food f6 = new Food(005, "牛奶", 5, 2, "盒");
        buy.buy(f6);

        List<Food> list = MyCart.list;

        float total = 0;
        for (Food food : list) {
            float sum = food.getQuantity() * food.getPrice();
            System.out.println(food.getName() + food.getPrice() + "元/" + food.getU() + "，" + food.getQuantity() + food.getU() + "，一共：" + sum + "元");
            total += sum;
        }
        System.out.println("总计：" + total);
    }

    public List<Food> buy(Food newFood) {
        List<Food> list = MyCart.list;
        boolean flag = false;
        for (Food oldFood : list) {
            if (oldFood.getNo() == newFood.getNo()) {
                oldFood.setQuantity(oldFood.getQuantity() + newFood.getQuantity());
                flag = true;
                break;
            }
        }
        if (!flag) {
            list.add(newFood);
        }

        return list;
    }
}

class Food implements Serializable {
    private int no;
    private String name;
    private float price;
    private int quantity;
    private String U;

    public Food() {
    }

    public Food(int no, String name, float price, int quantity, String U) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.U = U;
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

    public String getU() {
        return U;
    }

    public void setU(String u) {
        this.U = u;
    }
}
