package j0520.exercise;

import java.util.List;

public class F {
    public static void main(String[] args) {
        F f = new F();

        Goods g1 = new Goods(1, "牛奶", 10, 2);
        f.buy(g1);

        Goods g2 = new Goods(2, "奶牛", 5, 3);
        f.buy(g2);

        g1 = new Goods(1, "牛奶", 10, 3);
        List<Goods> list = f.buy(g1);

        float total = 0;
        for (Goods goods : list) {
            float sum=goods.getQuantity()*goods.getPrice();
            System.out.println(goods.getName()+"："+sum);
            total +=sum;
        }
        System.out.println("总计："+total);
    }

    public List<Goods> buy(Goods newGoods) {
        List<Goods> list = Cart.list;
        boolean flag = false;
        for (Goods oldG : list) {
            if (oldG.getNo() == newGoods.getNo()) {
                oldG.setQuantity(oldG.getQuantity() + newGoods.getQuantity());
                flag = true;
                break;
            }
        }
        if (!flag) {
            list.add(newGoods);
        }
        return list;
    }
}
