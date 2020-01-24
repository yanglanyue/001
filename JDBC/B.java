package JDBC;
/*
 * 操作MySQL存储过程
 * CallableStatement：此类用于操作MySQL的存储过程
 *
 * 操作MySQL函数
 * */
import org.junit.Test;

import java.sql.*;

public class B {
    static Connection conn=null;//此类用于连接MySQL
    static CallableStatement cs=null;//此类用于操作MySQL的存储过程
    static ResultSet rs=null;//此类用于操作MySQL输出结果

    @Test
    public void ep(){
        exeProc();
    }
    @Test
    public void ef(){
        exeFunc();
    }

    public static void exeProc(){//执行MySQL存储过程
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1/a?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC","root","dangerous");

            //执行存储过程
            cs=conn.prepareCall("call y_001(?,?,?)");
            cs.setInt(1,5000);
            cs.setString(2,"男");
            cs.registerOutParameter(3,JDBCType.LONGVARCHAR);

            boolean flag=cs.execute();//布尔判断是否有结果集（select * from ...之类的数行内容）

            while(flag){
                rs=cs.getResultSet();//取出结果集
                while (rs.next()){//遍历结果集n
                    System.out.printf("%s %.2f %d \n",rs.getString("供应商"),rs.getFloat("商品价格"),rs.getInt("商品数量"));
                    System.out.println("总计："+rs.getFloat("商品价格")*rs.getInt("商品数量"));
                }
                flag=cs.getMoreResults();//判断是否有更多结果集
                System.out.println(cs.getString(3));//输出MySQL存储过程y_001的返回值（与前面的cs代码相关联）
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            new B().close();
        }
    }

    public static void exeFunc(){//执行MySQL函数
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1/a?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC","root","dangerous");

            String s="iphone11";
            //执行函数
            cs=conn.prepareCall("{?=call f001(?,?,?)}");
            cs.registerOutParameter(1,JDBCType.DOUBLE);
            cs.setString(2,s);
            cs.setDouble(3,0.125);
            cs.setInt(4,20);

            cs.execute();//是否有结果集
            System.out.println(s+"这批货税后总计："+cs.getDouble(1));

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            new B().close();
        }
    }

    public static void close(){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(cs!=null){
            try {
                cs.close();
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
