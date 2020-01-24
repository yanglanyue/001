package j0506.exercise;
/**
 * 作业
 * 随机生成26个A-Z（unicode：65-90）的字母，且不重复
 */
public class fromAtoZ01 {

    private static char x[] = new char[26];//生成一个长度26位的数组
    private static char AZ[] = new char[26];//生成一个长度26位的数组

    public static void main(String[] args) {
        fromAtoZ01 az=new fromAtoZ01();
        for(int i=0;i<26;i++){//给AZ这个长度26位的数组从A到Z每位依次赋值
            AZ[i]=(char)(i+65);
        }

//        for(int i=0;i<10;i++){
//            int Test.behavior.j = az.to6590() - 65;//随机生成一个0-25的整数，用来对应AZ数组里的任意一位
//            if(AZ[Test.behavior.j]!=0) {
//                x[i] = AZ[Test.behavior.j];
//                AZ[Test.behavior.j] = 0;
//            }else {
//                int k=az.to6590() - 65;
//                if(AZ[k]!=0){
//                    x[i] = AZ[k];
//                    AZ[k] = 0;
//                }else {
//                    int l=az.to6590() - 65;
//                    if(AZ[l]!=0){
//                        x[i] = AZ[l];
//                        AZ[l] = 0;
//                    }else {
//                        int m=az.to6590() - 65;
//                        if(AZ[m]!=0){
//                            x[i] = AZ[m];
//                            AZ[m] = 0;
//                        }else {
//                            int n=az.to6590() - 65;
//                            if(AZ[n]!=0){
//                                x[i] = AZ[n];
//                                AZ[n] = 0;
//                            }else {
//                                int o=az.to6590() - 65;
//                                if(AZ[o]!=0){
//                                    x[i] = AZ[o];
//                                    AZ[o] = 0;
//                                }else {
//                                    int p=az.to6590() - 65;
//                                    if(AZ[p]!=0){
//                                        x[i] = AZ[p];
//                                        AZ[p] = 0;
//                                    }else {
//                                        int q=az.to6590() - 65;
//                                        if(AZ[q]!=0){
//                                            x[i] = AZ[q];
//                                            AZ[q] = 0;
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }

        for(int i=0;i<26;i++){
            az.go(i);
        }

        for(int i=0;i<26;i++){
            System.out.print(x[i]+" ");
        }
    }

    public void go(int i){
        int j=this.to6590() - 65;//随机生成一个0-25的整数，用来对应AZ数组里的任意一位
        if(AZ[j]!=0){
            x[i] = AZ[j];
            AZ[j] = 0;
        }else {
            this.go(i);
        }
    }

    public int to6590(){//随机生成一个65-90的整数
        return (int)(Math.random()*26+65);
    }
    public char AtoZ(){//随机生成一个A-Z的字母
        return (char)((int)(Math.random()*26+65));
    }
}
