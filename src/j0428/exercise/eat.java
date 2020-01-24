package j0428.exercise;
/**
 * Polymorphism：多态
 * 作业
 * 中国人吃饺子，日本人吃寿司，韩国人吃泡菜
 */
public class eat extends korea{
    public static void main(String[] args) {
        eat E=new china();
        System.out.print(((china) E).a);
        ((china)E).eat();//【虚方法调用】

        new eat().eat(new janpan());//【形参多态】

        System.out.print(((korea) E).a);
        new eat().K("korea").eat();//【返回值多态】
    }

    public void eat(china a){
        System.out.print(a.a);
        a.eat();
    }
    public void eat(janpan a){
        System.out.print(a.a);
        a.eat();
    }
    public void eat(korea a){
        System.out.print(a.a);
        a.eat();
    }
    public korea K(String a){
        switch (a){
            case "china":
                return new china();
            case "janpan":
                return new janpan();
            case "korea":
                return new korea();
        }
        return null;
    }
}
class china extends eat{
    String a="中国人";
    public void eat(){
        System.out.println("吃饺子");
    }
}
class janpan extends eat{
    String a="日本人";
    public void eat(){
        System.out.println("吃寿司");
    }
}
class korea {
    String a="韩国人";
    public void eat(){
        System.out.println("吃泡菜");
    }
}