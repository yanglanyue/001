package Test;

public class X<T> {
    private T b;

    public X() {
    }

    public X(T b) {
        this.b = b;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public static void main(String[] args) {
        X x = new X();
        x.setB(123);
        System.out.println(x.getB());

        x.setB(12.3);
        System.out.println(x.getB());

        x.go(15,"k",(float) 175.5,true);
    }

    public void go(int a, String b, float c, boolean d){
        System.out.println();
    }
}
