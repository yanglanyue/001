package j0507;
/**
 * Exception：异常
 * catch（被动的）
 * */
public class D {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);//分母为零，将会出现算术异常
        }catch (Exception e){//catch是被动的，用Exception代替所有类型的异常（多态）
            System.out.println("出现错误");
        }finally {
            System.out.println("放在finally里面无论如何都执行");//无论try里面有无异常，都执行的代码放finally里面
        }
        System.out.println("放在外面也可以执行");
    }
}
