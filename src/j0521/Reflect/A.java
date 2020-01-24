package j0521.Reflect;

import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class A {
    public static void main(String[] args) {

    }
    @Test
    public void testinnerClass() throws Exception {//用反射测试调用内部类
        Class c=Class.forName("j0521.Reflect.People");
        Class c1=Class.forName("j0521.Reflect.People$P1");

        Object o=c.newInstance();//创建外部类对象

        Object o1=c1.getDeclaredConstructors()[0].newInstance(o);

        Method m=c1.getDeclaredMethod("go");
        m.invoke(o1);
    }

    @Test
    public void testArray() {//用反射测试调用数组
        Object o = Array.newInstance(String.class, 10);

        Array.set(o, 0, "ROSE");
        Array.set(o, 1, "JACK");
        Array.set(o, 2, "ALICE");

        for (int i = 0; i < Array.getLength(o); i++) {
            System.out.println(Array.get(o, i));
        }
    }

    @Test
    public void testField2() {//用反射测试调用字段
        String s = "j0521.Reflect.People";
        try {
            Class<?> c = Class.forName(s);
            People p = (People) c.newInstance();
            Field name = c.getDeclaredField("name");
            name.setAccessible(true);//更改name的权限为可访问
            name.set(p, "JACK");

            System.out.println(name.get(p));
            System.out.println(p.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testField1() {//用反射测试调用字段
        String s = "j0521.Reflect.People";
        try {
            Class<?> c = Class.forName(s);
            Field[] fs1 = c.getFields();//不可调取私有字段
            Field[] fs2 = c.getDeclaredFields();//Declare：声明的，可调取私有字段

            for (Field f : fs2) {
                System.out.println(f.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMethod() {//用反射测试调用方法
        String s = "j0521.Reflect.People";
        try {
            Class<?> c = Class.forName(s);
            People p = (People) c.newInstance();

            Method m = c.getMethod("setName", String.class);
            m.invoke(p, "JSON");

//            Method ms[]=c.getMethods();//得到类的所有方法，包括所继承的Object的方法
//            for (Method m1:ms) {
//                System.out.println(m1.getName());
//            }

            Method m1 = c.getMethod("getName");
            System.out.println(m1.invoke(p));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUnDefCon() {//用反射测试调用非默认构造器
        String s = "j0521.Reflect.People";
        try {
            Class<?> c = Class.forName(s);
            Constructor c1 = c.getConstructor(int.class, String.class);
            People p = (People) c1.newInstance(100, "ROSE");
            System.out.println(p.getName());
            System.out.println(p.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDefCon() {//用反射测试调用默认构造器
        try {
            String s = "j0521.Reflect.People";
            Class<?> c = Class.forName(s);//Class：运行时类，class：编译时类
            People p = (People) c.newInstance();
            p.setName("MIKE");
            System.out.println(p.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
