package j0513;
/**
 * File类
 * 对文件和文件夹进行相关操作
 *
 * */

import org.junit.Test;

import java.io.*;

public class B {

    //创建文件对象方法一
    File A=new File("F:/Beautyleg/[Be]2019.06.28 No.1785 Vanessa[57P287M]/0000.jpg");
    //创建文件对象方法二
    File B=new File("F:/Beautyleg/[Be]2019.06.28 No.1785 Vanessa[57P287M]","0001.jpg");
    //创建文件对象方法三
    File C=new File("F:/Beautyleg/[Be]2019.06.28 No.1785 Vanessa[57P287M]");
    File D=new File(C,"0002.jpg");

    @Test
    public void ko() throws IOException {
        File AA=new File("F:/Beautyleg/[Be]2019.06.28 No.1785 Vanessa[57P287M]/000110.jpg");
        try {
            AA.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void ok() {
        File file=new File("F:"+System.getProperty("file.separator")+"Beautyleg/965Avril-MZ59Nk.jpg");//可以是相对目录，也可以是绝对目录；
        // +System.getProperty("file.separator")+JDK自行判断系统目录键，Windows下是“\”,linux下是“/”
        System.out.println(file.separator);//file.separator：当前系统下的文件分隔符
        System.out.println(System.getProperty("path.separator"));//path.separator：当前系统下的路径分隔符
        System.out.println(file.isDirectory());//判断是不是目录（文件夹）
        System.out.println(file.isFile());//判断是不是文件
    }

    //创建文件
    @Test
    public void create() throws IOException {
        File file=new File("F:"+System.getProperty("file.separator")+"Beautyleg/965Avril-MZ59Nk.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //删除文件
    @Test
    public void delete() throws IOException{
        File file=new File("F:"+System.getProperty("file.separator")+"Beautyleg/965Avril-MZ59Nk.txt");
        file.delete();
    }

    //查看文件大小
    @Test
    public void getLength(){
        String info="F:"+System.getProperty("file.separator")+"Beautyleg/965Avril-MZ59Nk.jpg";
        File file=new File(info);
        System.out.println(info+"大小为："+file.length()+"字节");
    }

    //.list遍历目录里的所有文件和文件夹（方法一），返回文件名。
    @Test
    public void traversalA(){
        String info="F:"+System.getProperty("file.separator")+"Beautyleg";
        File file=new File(info);
        String [] ss=file.list();//遍历目录里的内容（方法一），返回String类型。
        for (String s:ss){
            System.out.println(s);
        }
    }

    //.listFiles遍历目录里的所有文件和文件夹对象（方法二），返回绝对路径。
    @Test
    public void traversalB(){
        String info="F:"+System.getProperty("file.separator")+"Beautyleg";
        File file=new File(info);
        File [] fils=file.listFiles();//遍历目录里的内容对象（方法二），返回File对象。
        for (File f:fils){
            System.out.println(f+"--->>"+f.length()/1024f+"kb");
        }
    }

    //文件名过滤器：查找后缀名为xxx的文件，并打印出其文件名等信息
    @Test
    public void fileNameFilter(){
        String info="F:"+System.getProperty("file.separator")+"Beautyleg";
        File file=new File(info);
        File [] fils=file.listFiles(
                new FilenameFilter() {//匿名内部类（技术）
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.endsWith("jpg")||name.endsWith("txt");//文件后缀名，一旦找到后缀为jpg或txt的文件就返回true
                    }
                }
        );
        for (File f:fils){
            System.out.println(f.getName()+"--->>"+f.length()/1024f+"kb");
        }
    }

    @Test//java中System.getProperty()方法详解
    public void go(){
        System.out.println("java版本号：" + System.getProperty("java.version")); // java版本号
        System.out.println("Java提供商名称：" + System.getProperty("java.vendor")); // Java提供商名称
        System.out.println("Java提供商网站：" + System.getProperty("java.vendor.url")); // Java提供商网站
        System.out.println("jre目录：" + System.getProperty("java.home")); // Java，哦，应该是jre目录
        System.out.println("Java虚拟机规范版本号：" + System.getProperty("java.vm.specification.version")); // Java虚拟机规范版本号
        System.out.println("Java虚拟机规范提供商：" + System.getProperty("java.vm.specification.vendor")); // Java虚拟机规范提供商
        System.out.println("Java虚拟机规范名称：" + System.getProperty("java.vm.specification.name")); // Java虚拟机规范名称
        System.out.println("Java虚拟机版本号：" + System.getProperty("java.vm.version")); // Java虚拟机版本号
        System.out.println("Java虚拟机提供商：" + System.getProperty("java.vm.vendor")); // Java虚拟机提供商
        System.out.println("Java虚拟机名称：" + System.getProperty("java.vm.name")); // Java虚拟机名称
        System.out.println("Java规范版本号：" + System.getProperty("java.specification.version")); // Java规范版本号
        System.out.println("Java规范提供商：" + System.getProperty("java.specification.vendor")); // Java规范提供商
        System.out.println("Java规范名称：" + System.getProperty("java.specification.name")); // Java规范名称
        System.out.println("Java类版本号：" + System.getProperty("java.class.version")); // Java类版本号
        System.out.println("Java类路径：" + System.getProperty("java.class.path")); // Java类路径
        System.out.println("Java lib路径：" + System.getProperty("java.library.path")); // Java lib路径
        System.out.println("Java输入输出临时路径：" + System.getProperty("java.io.tmpdir")); // Java输入输出临时路径
        System.out.println("Java编译器：" + System.getProperty("java.compiler")); // Java编译器
        System.out.println("Java执行路径：" + System.getProperty("java.ext.dirs")); // Java执行路径
        System.out.println("操作系统名称：" + System.getProperty("os.name")); // 操作系统名称
        System.out.println("操作系统的架构：" + System.getProperty("os.arch")); // 操作系统的架构
        System.out.println("操作系统版本号：" + System.getProperty("os.version")); // 操作系统版本号
        System.out.println("文件分隔符：" + System.getProperty("file.separator")); // 文件分隔符
        System.out.println("路径分隔符：" + System.getProperty("path.separator")); // 路径分隔符
        System.out.println("直线分隔符：" + System.getProperty("line.separator")); // 直线分隔符
        System.out.println("操作系统用户名：" + System.getProperty("user.name")); // 用户名
        System.out.println("操作系统用户的主目录：" + System.getProperty("user.home")); // 用户的主目录
        System.out.println("当前项目所在目录：" + System.getProperty("user.dir")); // 当前项目所在目录
    }
}
