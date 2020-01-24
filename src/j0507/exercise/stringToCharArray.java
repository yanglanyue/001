package j0507.exercise;
/**
 * 作业：
 * 将字符串转换为不含空格的字符数组
 * */
public class stringToCharArray {

    private static String a="www.baidu.comwww.baidu.com www.baidu.com  www.baidu.com   www.baidu.com    www.baidu.com     www.baidu.com      ";
    private static char[] b=a.toCharArray();
    private static int c=b.length;

    public static void main(String[] args) {
        stringToCharArray A=new stringToCharArray();

        String str = "汉语pinyin";
        String unicode = stringToUnicode(str);
        System.out.println("字符串转unicode结果：" + unicode);
        String s = unicodeToString(unicode);
        System.out.println("unicode转字符串结果：" + s);
    }

    public stringToCharArray(){
    }

    public stringToCharArray(char[] b,int c){
        this.b=b;
        this.c=c;
        this.go(c);
    }

    public void go(int x){

        for (int i=0;i<=x;i++) {

//            if(){
//
//            }
        }
    }
    /**
     * 字符串转Unicode方法
     * */
    public static String stringToUnicode(String str) {
        StringBuffer sb = new StringBuffer();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            sb.append("\\u" + Integer.toHexString(c[i]));
        }
        return sb.toString();
    }

    /**
     * Unicode转字符串方法
     * */
    public static String unicodeToString(String unicode) {
        StringBuffer sb = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            int index = Integer.parseInt(hex[i], 16);
            sb.append((char) index);
        }
        return sb.toString();
    }
}
