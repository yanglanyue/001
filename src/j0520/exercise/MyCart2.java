package j0520.exercise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyCart2 {
    public static List<Shoot> list=new ArrayList<Shoot>();
}

class Go{
    public static void main(String[] args) {
        Go go=new Go();

        Shoot s1=new Shoot("罗纳尔多",9,2,1);
        go.go(s1);
        Shoot s2=new Shoot("C罗",3,1,1);
        go.go(s2);
        Shoot s3=new Shoot("马拉多纳",13,2,1);
        go.go(s3);
        Shoot s4=new Shoot("齐达内",6,1,1);
        go.go(s4);
        Shoot s5=new Shoot("罗纳尔多",9,1,2);
        go.go(s5);
        Shoot s6=new Shoot("马拉多纳",13,2,2);
        go.go(s6);
        Shoot s7=new Shoot("罗纳尔多",9,1,3);
        go.go(s7);
        Shoot s8=new Shoot("C罗",3,2,4);
        go.go(s8);

        List<Shoot> list=MyCart2.list;

        float totalShoot = 0;
        float totalTime = 0;
        for (Shoot s:list) {
            totalShoot=s.getShoot()*s.getTime();
            System.out.println(s.getName()+" 参赛场数："+s.getTime()+"场，总共进球数："+s.getShoot()+"次");
        }
        System.out.println();
    }

    public List<Shoot> go(Shoot newShoot){
        List<Shoot> list=MyCart2.list;
        boolean f=false;
        for (Shoot oldShoot:list) {
            if(newShoot.getNumber()==oldShoot.getNumber()){
                oldShoot.setShoot(oldShoot.getShoot()+newShoot.getShoot());
                oldShoot.setTime(oldShoot.getTime()+1);
                f=true;
                break;
            }
        }
        if(!f){
            list.add(newShoot);
        }

        return list;
    }

}

class Shoot implements Serializable {
    private String name;
    private int number;
    private int shoot;
    private int time;

    public Shoot(){}

    public Shoot(String name, int number, int shoot, int time) {
        this.name = name;
        this.number = number;
        this.shoot = shoot;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getShoot() {
        return shoot;
    }

    public void setShoot(int shoot) {
        this.shoot = shoot;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}