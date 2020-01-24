package Java从入门到精通.内部类;

public class test001 {
    public static void main(String[] args) {
        test001 t1=new test001();
        test001.inner in1=t1.go();
        System.out.println(in1.a1+in1.b1);
    }

    class inner{
        public inner() {
        }
        public inner(int a,String b) {
            this.a1=a;
            this.b1=b;
        }
        public inner(int a,String b,int c) {
            new inner().go(a,b,c);
        }
        public void go(int a,String b,int c){
            System.out.println(a+"号："+b+"，"+c+"岁");
        }
        int a1=100;
        String b1="ABC";
    }inner in1=new inner(7,"lucy",20);

    public test001() {
    }

    public inner go(){
        return new inner(999,"XXX");
    }
}
