package insertionSort.straightInsertionSort;

public class StraightInsertionSort {
    private static int count = 0;
    public static void main(String[] args) {
        int[] toSort = new int[] { 3, 7, 8, 6, 4, 9, 11, 25, 17 };
        insertSort(toSort);
        for (int e : toSort) {
            System.out.println(e);
        }
        System.out.println("count num is " + count);
    }

    /**
     * 每次第n个都与前n-1个作比较，j为每次插入位置
     * @author lichq
     * @Date 2017-7-26
     * @param toSort
     */
    private static void insertSort(int[] toSort) {
        for (int i = 0; i < toSort.length; i++) {
            int tmp = toSort[i];
            int j = i - 1;
            for (; j > 0 && toSort[j] > tmp; j--) {
                count++;
                //向后移动数组元素
                toSort[j + 1] = toSort[j];
            }
            toSort[j + 1] = tmp;
        }
    }
}
