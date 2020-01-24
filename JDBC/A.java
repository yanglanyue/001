package JDBC;
/*
* 对MySQL增删改查
* Connection：此类用于连接MySQL
* PreparedStatement：此类用于操作MySQL
* ResultSet：此类用于操作MySQL输出结果
* */
import org.junit.Test;
import java.sql.*;

public class A {

    Connection conn=null;//此类用于连接MySQL
    PreparedStatement pstmt=null;//此类用于操作MySQL
    ResultSet rs=null;//此类用于操作MySQL输出结果

    static int a=0;

    //增加
    @Test
    public void add(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/a?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC","root","dangerous");

            String gys="苹果公司";
            String spm="macbookAir(2020)";
            int spjg=6098;
            int spid=1;
            pstmt=conn.prepareStatement("insert into pro_test0(供应商,商品名,商品价格,商品ID) values (?,?,?,?)");
            pstmt.setString(1,gys);
            pstmt.setString(2,spm);
            pstmt.setInt(3,spjg);
            pstmt.setInt(4,spid);
            A.plus();

            //System.out.println(pstmt.executeUpdate()>1?"成功":"失败"+"更新"+ex+"行");
            if(pstmt.executeUpdate()>0){
                System.out.println("成功更新 "+a+" 行数据");
            }else {
                System.out.println("更新失败");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            new A().close();
        }
    }

    //删除
    @Test
    public void del(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/a?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC","root","dangerous");

            String gys="苹果公司";
            pstmt=conn.prepareStatement("delete from pro_test0 where 供应商=?");
            pstmt.setString(1,gys);

            System.out.println(pstmt.executeUpdate()>1?"删除成功":"删除失败");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            new A().close();
        }
    }

    //更改
    @Test
    public void update(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/a?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC","root","dangerous");

            String gys1="华为（上海）公司";
            String gys2="华为";
            pstmt=conn.prepareStatement("update pro_test0 set 供应商=? where 供应商=?");
            pstmt.setString(1,gys1);
            pstmt.setString(2,gys2);

            System.out.println(pstmt.executeUpdate()>1?"更改成功":"更改失败");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            new A().close();
        }
    }

    //查询
    @Test
    public void guery(){

        try {
            //第1步，加载驱动进入内存
            Class.forName("com.mysql.cj.jdbc.Driver");//视频所讲地址：com.mysql.jdbc.Driver

            //第2步，连接数据库（127.0.0.1：本机地址），将连接赋值给连接对象
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/a?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC","root","dangerous");
            //useUnicode=true
            //characterEncoding=utf-8
            //时区设置：serverTimezone=UTC

            //第3步，执行MySQL语句，prepareStatement可以有效防止二次执行SQL提高性能
            int spid=5000;
            String gys="苹果公司";
            pstmt=conn.prepareStatement("select * from pro_test where 供应商=? and 商品价格 >?");
            pstmt.setString(1,gys);
            pstmt.setInt(2,spid);

            //第4步，遍历数据
            rs=pstmt.executeQuery();//取出数据集
            //.next()类似于MySQL游标，sqlstate '02000'一样，最后一行没数据就跳出循环
            while (rs.next()){
                System.out.printf("%d %f %s \n",rs.getInt("商品数量"),rs.getFloat("商品价格"),rs.getString("供应商"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //第5步，全部关闭（注意先进后出，最后加载的内容最先关闭）
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void close(){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void plus(){
        a=a+1;
    }
}
