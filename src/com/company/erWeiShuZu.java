package com.company;
/**
 * 分别用for和foreach打印同一个三维数组
 * */
public class erWeiShuZu {

    public static void main(String[] args) {
        int [][][]arrayA={{{1,2,3},{4,5,6},{7,8,9}},{{11,22,33},{44,55,66},{77,88,99}},{{111,222,333},{444,555,666},{777,888,999}}};
        forA(arrayA);
        System.out.println();
        foreachA(arrayA);
    }

    public static void forA(int[][][] arrayA){

        for(int i=0;i<arrayA.length;i++){
            for(int j=0;j<arrayA[i].length;j++){
                for(int k=0;k<arrayA[j].length;k++){
                    System.out.print(arrayA[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void foreachA(int[][][] arrayA){
        for(int [][]i:arrayA){
            for(int []j:i){
                for(int k:j){
                    System.out.print(k);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
