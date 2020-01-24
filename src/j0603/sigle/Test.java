package j0603.sigle;

public class Test {
    public static void main(String[] args) {
        System.out.println(People.getInstance1());
        System.out.println(People.getInstance1());

        System.out.println(People.getInstance2());
        System.out.println(People.getInstance2());

        System.out.println(People.getInstance3());
        System.out.println(People.getInstance3());

        System.out.println(People.getInstance4());
        System.out.println(People.getInstance4());
    }
}
