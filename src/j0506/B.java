package j0506;
/**
 * 日期时间
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class B {
    public static void main(String[] args) {
//        System.out.println(new Date());
        int year=2019;
        Date date=new Date();
        date.setYear(year-1900);//加上1900年后

        SimpleDateFormat a=new SimpleDateFormat("yyyy-MM-dd");//转换成需要的格式
        SimpleDateFormat b=new SimpleDateFormat("a hh:mm:ss:SSS");
        b.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        SimpleDateFormat c=new SimpleDateFormat("w");//月份中的周数
        SimpleDateFormat d=new SimpleDateFormat("F");//月份中的星期
        SimpleDateFormat e=new SimpleDateFormat("D");//年中的天数
        SimpleDateFormat f=new SimpleDateFormat("E");//星期中的天数

        System.out.println(System.currentTimeMillis());//计算机的时间系统
        System.out.println(new Date());
        System.out.println(a.format(date)+"（"+f.format(date)+"）");
        System.out.println(b.format(date));
        System.out.println("这一年的第"+c.format(date)+"周");
        System.out.println("这个月的第"+d.format(date)+"周");
        System.out.println("这一年的第"+e.format(date)+"天");

        System.out.println("Calendar方法");
        Calendar C=Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));//TimeZone时区
        System.out.println(C.getTime());

        C.add(Calendar.DAY_OF_MONTH,10);//往后推10天
        System.out.println(C.get(Calendar.DAY_OF_MONTH));
    }
}
