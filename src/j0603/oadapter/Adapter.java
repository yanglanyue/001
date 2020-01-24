package j0603.oadapter;

public class Adapter implements IA {
    private Type t=new Type();

    @Override
    public void drink() {
        t.eat();
        System.out.println("喝");
    }
}
