package j0526;
/**
 * Timer：计时器
 * TimerTask
 * 通过继承TimerTask的EventTimer的构造器将Timer对象和TimerTask实现类开到同一个堆（详见class E的main方法）
 *
 * */
import java.util.Timer;
import java.util.TimerTask;

public class E {
    public static void main(String[] args) {
        Timer timer=new Timer();
        EventTimer myTask=new EventTimer(timer,10);

        System.out.println("开始加载游戏");
        timer.schedule(myTask,2000,500);//delay（延时时间）period（周期，间隔时间）
    }
}

class EventTimer extends TimerTask{
    public EventTimer(Timer timer,int imgCount) {
        this.timer = timer;
        this.imgCount = imgCount;
    }

    private int imgCount;//总共加载几张图片
    private int imgCurrent=0;//当前图片的号码
    private Timer timer;//计数器

    @Override
    public void run() {
        if(++imgCurrent<=imgCount){
            System.out.println("游戏正在加载，加载到第"+imgCurrent+"张");
        }else {
            timer.cancel();//取消计数器
            System.out.println("游戏加载完毕");
        }
    }
}
