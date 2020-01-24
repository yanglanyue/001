package j0513;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

/**
 * recursion：递归
 * 遍历整个文件目录
 * 创建目录
 */

public class C {

    //遍历整个文件目录
    @Test
    public void rec() {
        String info = "F:" + System.getProperty("file.separator")+"Beautyleg";
        //当前目录下的目录层级数未知，所以要用递归方法
        go(info);//递归不能在主方法里写，要重构：Refactor>Extract>Method
    }

    private void go(String info) {
        File file = new File(info);
        File [] files=file.listFiles();
        if(files!=null) {
            for (int i=0;i<files.length;i++) {
                if (files[i].isDirectory()) {
                    go(files[i].getPath());//当前目录的相对或绝对路径
                } else{
                    System.out.println(files[i].getAbsolutePath() + "--->" + files[i].length() / 1024f + "kb");//打印当前目录的绝对路径
                }
            }
        }
    }

    //创建目录
    @Test
    public void cre(){
        String info = "F:" + System.getProperty("file.separator")+"cre1";//指定目录下创建一个叫“cre1”的文件夹
        File file=new File(info);
        file.mkdir();

    }

    //测试用
    @Test
    public void traversalB(){
        String info="F:"+System.getProperty("file.separator")+"Beautyleg"+System.getProperty("file.separator")+"[Be]2018.11.23 No.1690 Kaylar[57P407M]"+System.getProperty("file.separator");
        File file=new File(info);
        File [] fils=file.listFiles();//遍历目录里的内容对象（方法二）
        System.out.println(fils[0].getPath());
        System.out.println(fils[0].getAbsolutePath());
    }

}
