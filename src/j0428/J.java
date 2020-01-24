package j0428;

/**
 * 匿名内部类
 * 【虚方法匿名内部类】
 * 【形参匿名内部类】
 * 【返回值匿名内部类】
 */
public class J {
    public static void main(String[] args) {
//        new IJ() {//实例化匿名内部类
//            @Override
//            public void go() {
//                System.out.println("go");
//            }
//        }.go();

        new J().mark(new IJ() {
            @Override
            public void go(String name) {
                System.out.println(name);
            }

            @Override
            public void plan(int a) {

            }
        },"A");

        new J().plan(new IJ(){//返回值多态

            @Override
            public void go(String name) {
                System.out.println(name);
            }

            @Override
            public void plan(int a) {

            }
        },"B",99).plan(88);

        new J().ask(new IJ(){

            @Override
            public void go(String name) {
                System.out.println(name);
            }

            @Override
            public void plan(int a) {
                System.out.println(a);
            }
        },"K",100);

    }

    public void mark(IJ ij,String name) {
        ij.go(name);
    }

//    String name="D";

    public IJ plan(IJ ij,String bb,int aa){//返回值多态
        return new IJ(){

            @Override
            public void go(String name) {
                System.out.println(bb);
            }

            @Override
            public void plan(int a) {
                System.out.println(aa);
            }
        };
    }

    public void ask(IJ ij,String name,int a){
        ij.go(name);
        ij.plan(a);
    }

}

interface IJ {
    void go(String name);
    void plan(int a);
}