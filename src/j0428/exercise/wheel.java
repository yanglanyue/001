package j0428.exercise;
/**
 * 作业
 * 根据车轮半径和转速计算速度
 * abstract虚类的应用
 */

import static java.lang.Math.PI;

public abstract class wheel {
    public static void main(String[] args) {
        System.out.println(new wheelA().V());
        System.out.println(new wheelB().V());
        System.out.println(new wheelC().V());
    }

    public float V() {
        return (float) (getR() * 2 * PI * getS());
    }

    public abstract float getR();

    public abstract float getS();
}

class wheelA extends wheel {

    @Override
    public float getR() {
        return 0.35f;
    }

    @Override
    public float getS() {
        return 5.3f;
    }
}

class wheelB extends wheel {

    @Override
    public float getR() {
        return 0.3f;
    }

    @Override
    public float getS() {
        return 4.5f;
    }
}

class wheelC extends wheel {

    @Override
    public float getR() {
        return 0.32f;
    }

    @Override
    public float getS() {
        return 4.8f;
    }
}