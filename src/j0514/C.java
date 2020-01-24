package j0514;
/**
 * RandomAccessFile（随机流）
 * 功能一：复制文件
 * 功能二：从文件中特定位置开始读取和写入数据（合并）
 *
 * Serializable（序列化）
 * 将对象编译成二进制流将其保存于磁盘或传输到另一个网络节点
 * DeSerialize（反序列化）
 *
 * */
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class C {
    public static void main(String[] args) {

    }

    @Test//复制文件
    public void copy() {
        try (RandomAccessFile r = new RandomAccessFile("F://Beautyleg/[Be]2019.07.01 No.1787 Jennifer[58P383M]/0000.jpg", "r");
             RandomAccessFile w = new RandomAccessFile("F://Beautyleg/[Be]2019.07.01 No.1787 Jennifer[58P383M]/8888.jpg", "rw")) {

            byte[] buffer=new byte[1024*1024];

            int n=0;
            while((n=r.read(buffer))!=-1){
                w.write(buffer,0,n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test//合并
    public void merge(){
        File file=new File("C://Users/Mac mini/Desktop/Kheops - Armenian Song.mp3");

        try (RandomAccessFile r = new RandomAccessFile("C://Users/Mac mini/Desktop/岑宁儿 - 追光者.mp3", "r");
             RandomAccessFile w = new RandomAccessFile("C://Users/Mac mini/Desktop/Kheops - Armenian Song.mp3", "rw")) {

            byte[] buffer=new byte[1024*1024];
            w.seek(file.length()/2);//定位到写入文件的末尾位置

            int n=0;
            while((n=r.read(buffer))!=-1){
                w.write(buffer,0,n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//序列化
class person implements Serializable {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}