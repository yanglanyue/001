package j0513;
/**
 * 流
 * .read
 * .write
 * .print（注意和.write的区别）
 *
 * 拷贝
 * */
import org.junit.Test;
import java.io.*;
import java.text.SimpleDateFormat;

public class A {
    public static void main(String[] args) throws IOException {
//        A a=new A();
//        a.writeB();
//        a.readB();

        FileInputStream fis=new FileInputStream("F://H/DTT-021/DTT-021.mp4");
        FileOutputStream fos=new FileOutputStream("F://Beautyleg/DTT-021.mp4");
        byte[] buf=new byte[1024*1024];
        int n;
        while ((n=fis.read(buf))!=-1){
            fos.write(buf,0,n);
        }
    }

    //read读（写法一）
    @Test
    public void read() throws FileNotFoundException {//将异常抛给JDK，不推荐
        FileInputStream fis=new FileInputStream("F://Beautyleg/897Kaylar-E8nP7.jpg");
    }

    //read读（写法二）
    @Test
    public void readA(){
        FileInputStream fis=null;//将堆和栈分开写
        try {
            fis = new FileInputStream("F://Beautyleg/1.txt");
            Read(fis);
        }catch (IOException e){
            e.printStackTrace();
        }finally {//实现打开文件的关闭命令
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //read读（写法三）JDK1.7新语法，会自动关闭，不用readA那样写finally执行关闭
    @Test
    public void readB(){
        //打开路径为F://Beautyleg/897Kaylar-E8nP7.jpg的文件，然后自动关闭
        try (InputStream fis=new FileInputStream("F://Beautyleg/1.txt")){
            byte[] buffer=new byte[1024];//声明一个1KB的缓存，代表一次读1KB
            int n=0;
            while((n=fis.read(buffer))!=-1){//read的return内容翻译为：只要没读到文件末尾就不返回-1。没到文件末尾，继续读
                System.out.write(buffer);
                System.out.print(new String(buffer));//print：打印字符串
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //read读（自定义读方法）
    public void Read(InputStream fis) throws IOException {
        byte[] buf=new byte[1024];
        int n;
        while((n=fis.read(buf))!=-1){
            System.out.write(buf);
        }
    }

    //write写
    @Test
    public void writeB(){
        try(OutputStream os=new FileOutputStream("F://Beautyleg/1.txt") ){
            os.write("我是你爸爸".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //copy拷贝文件（边读边写）
    @Test
    public void copy(){
        try(FileInputStream fis=new FileInputStream("F://H/DTT-021/DTT-021.mp4"); FileOutputStream fos=new FileOutputStream("D://U盘/H/DTT-021.mp4"))
        {
            byte[] buffer=new byte[1024];
            int n=0;

            long start=System.currentTimeMillis();//设定开始时间，以毫秒计算

            while ((n=fis.read(buffer))!=-1){
                fos.write(buffer,0,n);
            }

            long end=System.currentTimeMillis();//设定结束时间，以毫秒计算

            SimpleDateFormat sdf=new SimpleDateFormat("s");//将毫秒转换为秒
            System.out.println(sdf.format(end-start));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
