package j0507.exercise;

public class stringToCharArray01 {

    private static String a="www.baidu.comwww.baidu.com www.baidu.com  www.baidu.com   www.baidu.com    www.baidu.com     www.baidu.com      ";
    private static char[] b=a.toCharArray();
    private static int c=b.length;

    private static String d = a.replaceAll(" ", "");//将字符串中的" "替换为""。
    private static char[] D=d.toCharArray();

    public static void main(String[] args) {
        System.out.print("字符数组长度："+c+"\n");
        System.out.println(a.trim());
//        for(int i=0;i<=c-1;i++){
//            if(b[i]==' '){
//                b[i]='1';
//            }
//        }

        for (char a:D) {
            System.out.print(a);
        }
    }
}
