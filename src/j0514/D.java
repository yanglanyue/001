package j0514;
/**
 * 正则表达式
 *
 * 匹配
 * 替换，贪婪模式/勉强模式
 * */
import org.junit.Test;

public class D {

    public static void main(String[] args) {
        new D().go1();
    }
    @Test
    public void go1(){
        System.out.println("8.991".matches("^[0-9]*(\\.[0-9]{3})?$"));

        String regex1="010";
        System.out.println(regex1.matches("^(0?([1-9]|1)[0-2])$"));

        String regex2="01";
        System.out.println(regex2.matches("^(0?[1-9])|((1|2)[0-9])|30|31$"));//验证输入一个月的31天

        String regex3="01";
        System.out.println(regex3.matches("^[0-9]+$"));//验证输入的是数字

        String regex4="01325436567658769698";
        System.out.println(regex4.matches("^\\d*$"));//验证输入的是数字
    }

    /**
     * 替换，贪婪模式/勉强模式（?）
     * replaceFirst：左限不匹配
     * \w*：范围[0-n)，不匹配出现0次的
     *
     * replaceAll：左右限全都单独匹配
     * \w*?：范围[0-n)，单独匹配出现了0次的，再单独匹配出现了大于0次的
     */
    @Test
    public void go2(){
        String regex1="123,ABC";
        String a="\\w?";
        String b="\\w??";

        System.out.println(regex1.replaceFirst(a,"Ӝ"));//
        System.out.println(regex1.replaceFirst(b,"Ӝ"));//

        System.out.println(regex1.replaceAll(a,"Ӝ"));//
        System.out.println(regex1.replaceAll(b,"Ӝ"));//
    }
}
