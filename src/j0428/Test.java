package j0428;
/**
 * 调用H类的内部类
 */
public class Test {
    public static void main(String[] args) {
        new H().ok();
        new H().new H1().go();

        new H.H2().foot();
        new H.H2().A(100);
        new H.H3().new H1().go1(100);
    }
}
