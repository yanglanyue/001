package j0603.adapter;
/**
 * 结构型模式：适配器模式
 *
 * */
public class Adapter extends Telephone implements Outlet {
    @Override
    public void gongDian() {
        super.chongDian();
        System.out.println("开始充电");
    }
}
