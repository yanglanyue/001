package j0603.sigle;
/**
 * 单例模式：Singleton Pattern
 *
 * 外观模式：Facade Pattern
 *
 */

public class People {

    private People() {
    }

    //单例模式一
    //缺陷：多线程不能正常工作
    public static People p = null;

    public static People getInstance1() {
        if (p == null) {
            p = new People();
        }
        return p;
    }

    //单例模式二,加入synchronized
    public static synchronized People getInstance2() {
        if (p == null) {
            p = new People();
        }
        return p;
    }

    //单例模式三，内部类写法
    private static class PeopleHolder {//内部类（内部类成员有static标记，内部类也必须为静态类）
        public static final People p = new People();
    }

    public static People getInstance3() {
        return PeopleHolder.p;
    }

    //单例模式四（模式二的升级版，双重检查锁定版）
    private static volatile People people = null;//单重检查，JVM层次进行锁定

    public static People getInstance4() {
        if (people == null) {
            synchronized (People.class) {
                if(people == null){
                    people = new People();
                }
                return people;
            }
        }
        return people;
    }
}
