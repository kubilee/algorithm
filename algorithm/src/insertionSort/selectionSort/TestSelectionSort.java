package insertionSort.selectionSort;

import sun.misc.Sort;

/**
 * Created by 长青 on 2017/7/27.
 */
public class TestSelectionSort {
    public static void main(String[] args) {
        int[] toSort = new int[] { 3, 7, 8, 6, 4, 9, 11, 25, 17 };
        sort(toSort);
        for (int e : toSort) {
            System.out.println(e);
        }
    }

    private static void sort(int[] toSort) {
        for(int i = 0 ;i<toSort.length;i++){
            int min = toSort[i];
            int index = i;
            for(int j=i+1;j<toSort.length;j++){
                if(toSort[j]<min){
                    min = toSort[j];
                    index = j;
                }
            }
            toSort[index] = toSort[i];
            toSort[i] =min;
        }
    }


}
