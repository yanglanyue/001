package j0506.exercise;
/**
 * 作业
 * 随机生成10个A-Z（unicode：65-90）的字母，且不重复
 */
public class fromAtoZ {

    static fromAtoZ az=new fromAtoZ();
    static int x[] = new int[10];//生成一个长度10位的数组
    static int X=az.go();//生成一个65-90之间的随机数，放到X里面
    static int x1[]=new int[26];//生成一个长度26位的数组
    static int i=0;

    public static void main(String[] args) {
        int A=65;
        for(int k=0;k<26;k++){//将65-90依次填充到数组x1
            x1[k]=A;
            A++;
        }

        for(;i<10;i++) {
            int i1 = az.go();//生成一个65-90之间的随机数，放到i1里面
            x[i] = x1[i1 - 65];//将i1的这个随机数减去65，范围缩小至0-25之间，将x1数组里面对应的数依次赋值给x数组
            x1[i1 - 65] = 0;//并将赋值后的x1数组对应那个位置赋值为0
        }
//        for(;i<10;i++){
//            if(x[i]==0){
//                x[i]=az.go();
//            }else {
//
//            }
//        }

        for(; i<10;i++ ){
            x[i] = az.go();
            az.go1(x1[x[i]-65]);
        }

        char C[]=new char[10];//将int类数字转换成char数组
        for(int j=0; j<10;j++ ){
            C[j]=(char)x[j];
        }

        for (int d:x1) {
            System.out.print(d+" ");
        }System.out.println();

        for (int d:x) {
            System.out.print(d+" ");
        }System.out.println();

        for (char d:C) {
            System.out.print(d+" ");
        }

    }
    public int go(){
        return (int) (Math.random() * 26 + 65);
    }
    public int[] go1(int a){
        x1[x[i]-65]=0;
        return x1;
    }
}
