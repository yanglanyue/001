package Test;

public class test02 {
    public static void main(String[] args) {
        int[] array = new int[] {10,15,20,25,35,40};
        int a = binSearch(array, 35);
        System.out.println(a);
    }

    private static int binSearch(int[] array, int key) {
        int min = 0;
        int max = array.length + 1;
        return search(array, key, min, max);
    }

    private static int search(int[] array, int key, int min, int max) {
        int len = (max - min) / 2;
        if (len == 0) {
            return 0;
        } else {
            len = min + len;
            if (array[len] == key) {
                return len;
            } else if (array[len] > key) {
                max = len;
                return search(array, key, min, max);
            } else {
                min = len;
                return search(array, key, min, max);
            }
        }
    }
}
