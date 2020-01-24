package j0428.exercise;

/**
 * 作业
 * 试图运行mark方法
 */
public class I {
    public static void main(String[] args) {
        new I().new I1().I1();
    }

    public abstract class I0 {
        class I1 {
            public void go() {
                class I2 {
                    void mark() {
                        System.out.println("mark");
                    }
                }
                new I2().mark();
            }
        }

        public abstract void I1();
    }

    class I1 extends I0 {
        @Override
        public void I1() {
            new I1().go();
        }
    }
}
