package j0507;
/**
 * .compareTo()：字符串的比较（第53行）
 * 此知识点将涉及到j0507的C类（第60行）对对象数组里对象的String属性进行比较
 *
 * 来自CSDN网友的解释
 * 1.当两个比较的字符串是英文且长度不等时，
 *
 * 1）长度短的与长度长的字符一样，则返回的结果是两个长度相减的值
 *
 * a="hello";
 * b="hell";
 * num=1;
 * 或者
 * a="h";
 * b="hello";
 * num=4;
 *
 * 2)长度不一样且前几个字符也不一样,从第一位开始找，当找到不一样的字符时，则返回的值是这两个字符比较的值
 * a="assdf";
 * b="bdd";
 * num=-1;
 *
 * 2.当两个比较的字符串是英文且长度相等时，
 * 1)一个字符
 * a="a";   //97
 * b="b";   //98
 * num=-1;
 *
 * 2）多个字符,第一个字符不同则直接比较第一个字符
 * a="ah";    //a=97
 * b="eg";    //e=101
 * num=-4
 *
 * 3）多个字符,第一个字符相同则直接比较第二个字符,以此类推
 *
 * a="ae";   //e=101
 * b="aa";   //a=97
 * num=4;
 * */
public class A {
    public static void main(String[] args) {
        String s=String.valueOf(10.1);

        /*
        * .compareTo()：比较两个字符串。
        * 1.从两个字符串的第一个字符开始比较。无论两个字符串长度是否相同，只要有差异，将所比较的字符的Unicode码和被比较字符的Unicode码相减，得到一个整数。
        * 其后的任何差异（字符是否相同，字符串长度是否一致）一律不管。
        * 2.若相比较的两个字符串长的一个的内容完全覆盖短的一个的内容（即这段内容完全一样），超出的长度按照每个字符为1进行减法计算。
        * */
        String a="affffffff";
        String b="affffffffffffdddd";
        System.out.println(a.compareTo(b));


        /*
        * .startsWith()：从头部查找（必须连续）
        * .endsWith()：从尾部查找（必须连续）
        * .indexOf()：查找字符串从什么位置开始（必须连续）
        * .lastIndexOf()：查找字符串从什么位置开始（必须连续）
        * */
        String c="www.baidu.comwww.baidu.com www.baidu.com  www.baidu.com   www.baidu.com    www.baidu.com     www.baidu.com      ";
        System.out.println(c.startsWith("www.baidu"));
        System.out.println(c.endsWith("baidu.com"));
        System.out.println(c.indexOf("baidu.com",10));//从第10个开始往右看，查找相应的字符串在整个字符串中起始于哪个
        System.out.println(c.lastIndexOf("baidu.com",20));
        /*
        * 从第20个开始往左看，查找相应的字符串在整个字符串中起始于哪个。
        * 当左边无结果，打印-1。
        * 当第20个刚好落在要查找的相应字符串时，以此字符串起始位置算。（就近原则）
        * */

        /*
        * .trim()：去掉字符串两头空格
        * */
        System.out.println(c.trim());

        System.out.println(c.toCharArray());//将字符串转换为字符数组
        /*
        *
        *
        *
        * */
    }
}
