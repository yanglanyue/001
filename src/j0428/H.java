package j0428;
/**
 * 类H和内部类
 */
public class H {
    class H1{
        public void go(){
            class H2{
                public void mark(){
                    System.out.println("mark");
                }
            }
            new H2().mark();
        }
    }
    public void ok(){
        new H1().go();
    }
    static class H2{
        public void foot(){
            System.out.println("foot");
        }
        public void A(int a){
            System.out.println(a);
        }
    }
    static class H3{
        public class H1{
            public void go2(int a){
                System.out.println("计算结果："+a);
            }
            public void go1(int a){
                if(a<50){
                    a=a;
                }else if(a>=50){
                    a=a-50;
                    new H1().go2(a);
                }
            }
        }
    }
}

