package j0428.exercise;
/**
 * 作业
 * 计算圆形、三角形、平行四边形的面积和周长
 */
import static java.lang.Math.PI;

public abstract class areaAndPerimeter {
    public static void main(String[] args) {
        System.out.println(new roundness().roundnessA());
        System.out.println(new roundness().roundnessP());
        System.out.println(new triangle().triangleA());
        System.out.println(new triangle().triangleP());
        System.out.println(new rectangle().rectangleA());
        System.out.println(new rectangle().rectangleP());
    }

    public float roundnessA(){
        return (float) PI*getroundnessR()*getroundnessR();
    }
    public float roundnessP(){
        return (float) PI*getroundnessR()*2;
    }
    public abstract float getroundnessR();

    public float triangleA(){
        return (gettriangleW()*gettriangleH())/2;
    }
    public float triangleP(){
        return gettriangleW()+gettriangleA()+gettriangleB();
    }
    public abstract float gettriangleW();
    public abstract float gettriangleH();
    public abstract float gettriangleA();
    public abstract float gettriangleB();

    public float rectangleA(){
        return getrectangleW()*getrectangleH();
    }
    public float rectangleP(){
        return (getrectangleW()+getrectangleA())*2;
    }
    public abstract float getrectangleW();
    public abstract float getrectangleH();
    public abstract float getrectangleA();
}

class roundness extends areaAndPerimeter {
    @Override
    public float getroundnessR() {
        return 5.8f;
    }

    @Override
    public float gettriangleW() {
        return 0;
    }

    @Override
    public float gettriangleH() {
        return 0;
    }

    @Override
    public float gettriangleA() {
        return 0;
    }

    @Override
    public float gettriangleB() {
        return 0;
    }

    @Override
    public float getrectangleW() {
        return 0;
    }

    @Override
    public float getrectangleH() {
        return 0;
    }

    @Override
    public float getrectangleA() {
        return 0;
    }

}
class triangle extends areaAndPerimeter {
    @Override
    public float getroundnessR() {
        return 0;
    }

    @Override
    public float gettriangleW() {
        return 8f;
    }

    @Override
    public float gettriangleH() {
        return 5f;
    }

    @Override
    public float gettriangleA() {
        return 7.5f;
    }

    @Override
    public float gettriangleB() {
        return 6.6f;
    }

    @Override
    public float getrectangleW() {
        return 0;
    }

    @Override
    public float getrectangleH() {
        return 0;
    }

    @Override
    public float getrectangleA() {
        return 0;
    }

}
class rectangle extends areaAndPerimeter {
    @Override
    public float getroundnessR() {
        return 0;
    }

    @Override
    public float gettriangleW() {
        return 0;
    }

    @Override
    public float gettriangleH() {
        return 0;
    }

    @Override
    public float gettriangleA() {
        return 0;
    }

    @Override
    public float gettriangleB() {
        return 0;
    }

    @Override
    public float getrectangleW() {
        return 12f;
    }

    @Override
    public float getrectangleH() {
        return 6f;
    }

    @Override
    public float getrectangleA() {
        return 8.5f;
    }
}
