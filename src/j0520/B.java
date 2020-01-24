package j0520;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * 之前的文件夹拷贝作业
 */

public class B {
    public static void main(String[] args) {
        String readPath = "F://IdeaProjects/001";
        String targetPath = "C://Users/Mac mini/Desktop/001";

        new File(targetPath).mkdir();//创建根目录（文件夹）
        copyDir(readPath, targetPath);
    }

    public static void copyDir(String redPath, String targetPath) {//两个形参redPath（读目录），targetPath（目标目录）
        File file = new File(redPath);
        File[] fs = file.listFiles();//将当前文件目录下的各个文件梳理成完整的绝对路径文件数组

        if (fs != null) {
            for (File f : fs) {
                if (f.isDirectory()) {//是文件就拷贝，是目录就创建
                    File f1 = new File(targetPath + File.separator + f.getName());//getName()：目录列表里的所有类型文件的文件名，而不是绝对路径
                    f1.mkdir();
                    copyDir(f.getPath(), f1.getPath());
                    System.out.println(f.getAbsolutePath());
                } else {

                }
            }
        }
    }

    @Test
    public void go() {
        File f1 = new File("F://IdeaProjects/001");
        File[] fs = f1.listFiles();
//        new File("C://Users/Mac mini/Desktop/008").mkdir();

        for (File a : fs) {
            System.out.println(a.getName());
            System.out.println(a.getPath());
            System.out.println(a.getAbsolutePath());
//            System.out.println(f1.getPath()+File.separator+a.getName());
//            File f=new File("C://Users/Mac mini/Desktop/008"+File.separator+a.getName());
//            f.mkdir();
        }
    }
}
