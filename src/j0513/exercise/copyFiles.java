package j0513.exercise;

import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;

/**
 * 作业
 * 拷贝整个目录下的所有文件
 */

public class copyFiles {
    private String a=System.getProperty("file.separator");//获取系统文件分隔符

    private String from = "F:" + a + "Beautyleg" + a + "[Be]2019.06.10 No.1777 Jennifer[50P325M]";//将要操作的文件
    private String [] froms=new String[100000];

    private String to = "F:" + a + "H";
    private String [] tos=new String[100000];

    public static void main(String[] args) {
        copyFiles cf=new copyFiles();
        //cf.rec();
        //cf.copy();
        //cf.test();

        //cf.go1("F:\\H");
        cf.creatDir("F:\\小电影");
    }

    //遍历路径范围内的所有子目录和文件
    @Test
    public void go1(String path) {
        File file=new File(path);
        File[] fs=file.listFiles();
        if(fs!=null){
            for(int i=0;i<fs.length;i++) {
                if (fs[i].isDirectory()) {
                    go1(fs[i].getPath());
                } else {
                    System.out.println(fs[i].getAbsolutePath());
                }
            }
        }
    }

    //创建目录
    @Test
    public void creatDir(String path){
        File file=new File(path);
        file.mkdir();
    }

    //遍历整个文件目录
    @Test
    public void rec() {
        go(from);//递归不能在主方法里写，要重构：Refactor>Extract>Method
    }

    private void go(String from) {
        File file = new File(from);
        File [] files=file.listFiles();
        if(files!=null) {
            for (int i=0;i<files.length;i++) {
                if (files[i].isDirectory()) {
                    go(files[i].getPath());//当前目录的相对或绝对路径
                } else{
                    froms[i]=files[i].getAbsolutePath();//将遍历到的目录的绝对路径记录到froms字符串数组中
                    System.out.println(files[i].getAbsolutePath());
                }
            }
        }
    }

    public void copy() {
        for (int i=0;i<froms.length;i++) {
            try (FileInputStream fis = new FileInputStream(froms[i]);
                 FileOutputStream fos = new FileOutputStream(tos[i])) {
                byte[] buffer = new byte[1024];
                int n = 0;
                while ((n = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, n);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //测试
    @Test
    public void test(){
        try (FileInputStream fis = new FileInputStream(froms[0]);
             FileOutputStream fos = new FileOutputStream(to+a+"0000.jpg")) {
            byte[] buffer = new byte[1024];
            int n = 0;
            while ((n = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, n);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
