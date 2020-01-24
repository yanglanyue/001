package j0513;
/**
 * Reader/Writer（字符流）
 * 读取文件里的内容（字符串）
 * 向指定目录里创建文件写入内容（字符串）<不需要创建，直接写内容自动创建文件>
 */

import org.junit.Test;

import java.io.*;

public class D {
    private String info = "F:" + System.getProperty("file.separator") + "Beautyleg" + System.getProperty("file.separator") + "1.txt";

    //读取文件里的内容（字符串）
    @Test
    public void read() {
        try (Reader r = new FileReader(info);) {
            char[] buffer = new char[1024];
            int n = 0;
            while ((n = r.read(buffer)) != -1) {
                System.out.println(new String(buffer));
                //String(char[] value)
                //分配一个新的 String ，以便它表示当前包含在字符数组参数中的字符序列。
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //向指定目录里创建文件写入内容（字符串）<不需要创建，直接写内容自动创建文件>
    @Test
    public void write() {
        File file = new File("F:" + System.getProperty("file.separator") + "Beautyleg" + System.getProperty("file.separator") + "1.txt");
        try (Writer w = new FileWriter(file);) {
            w.write("我是你爷爷");//直接写入字符串
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //copy将指定目录下的文件的内容（字符串）拷贝到指定目录下的文件里
    @Test
    public void copy() {
        File rFile = new File("F:" + System.getProperty("file.separator") + "Beautyleg" + System.getProperty("file.separator") + "1.txt");
        File wFile = new File("F:" + System.getProperty("file.separator") + "Beautyleg" + System.getProperty("file.separator") + "2.txt");
        try (
                Writer w = new FileWriter(wFile);
                Reader r = new FileReader(rFile);
                ) {
            char[] buffer = new char[1024];
            int n = 0;
            while ((n = r.read(buffer)) != -1) {
                w.write(buffer,0,n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
