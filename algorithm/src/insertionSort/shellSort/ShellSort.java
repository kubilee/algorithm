package insertionSort.shellSort;


/**
 * 希尔排序 每隔gap个组成一组进行一次直接插入排序，gap值不断缩小 ，直到gap值为1 则进行整体插入排序，效率相对于直接插入排序 较高。
 * ShellSort
 * @author lichq
 * @Date 2017-7-26
 * @version 1.0
 *
 */
public class ShellSort {
    private static int count;
    public static void main(String[] args) {
        int[] toSort = new int[] { 3, 7, 8, 6, 4, 9, 11, 25, 17 };
        sort(toSort);
        for (int e : toSort) {
            System.out.println(e);
        }
        System.out.println("count is " + count);
    }

    private static void sort(int[] toSort) {
        int gap = toSort.length/2;
        for(;gap > 0;gap /=2){
            for(int i =gap ;i<toSort.length;i++){
                int tmp = toSort[i];
                int j = i - gap;
                for(;j>=0 && toSort[j] > tmp ;j-=gap){
                    count++;
                    toSort[j+gap] = toSort[j];
                }
                toSort[j+gap] = tmp;
            }
        }
        
    }


}
