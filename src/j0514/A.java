package j0514;

import org.junit.Test;

import java.io.*;

public class A {

    @Test
    public void copy(){
        File file=new File("F://Beautyleg/[Be]2019.06.28 No.1785 Vanessa[57P287M]/0030.jpg");
        try(
                InputStream fis=new FileInputStream(file);
                BufferedInputStream bis=new BufferedInputStream(fis,1024*1024);
                OutputStream fos=new FileOutputStream("C://Users/Mac mini/Desktop/0.jpg");
                BufferedOutputStream bos=new BufferedOutputStream(fos,1024*1024);)
        {
            byte[] buffer=new byte[1024*1024];
            int n=0;
            while ((n=bis.read(buffer))!=-1){
                bos.write(buffer,0,n);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
