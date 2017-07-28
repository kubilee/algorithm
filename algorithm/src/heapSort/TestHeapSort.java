package heapSort;

import java.util.Arrays;

/**
 * Created by lichq on 2017-7-27.
 */
public class TestHeapSort {
    private static int count;
    public static void main(String[] args) {
        int[] toSort = new int[] { 3, 7, 8, 6, 4, 9, 11, 25, 17 };
        heapSort(toSort);
        System.out.println(Arrays.toString(toSort) +"sorted");
    }

    public static void heapSort(int[] array) {
        int lastIndex = array.length-1;
        int beginIndex = (lastIndex-1) >> 1;
        for( ; beginIndex>=0;beginIndex--){
            maxHeapify(beginIndex,array);
        }
    }

    private static void maxHeapify(int index, int[] array) {
        int left = (index << 1) + 1;
        int right = left +1;
        int len = array.length;
        if(left > len){
            return ;
        }
        int max = left;
        if(right <= len && array[right] > array[left]){
            max = right;
        }
        if(array[max] > array[index]){
            swap(max,index,array);
            maxHeapify(max,array);
        }
    }

    private static void swap(int max, int index, int[] array) {
        int tmp = array[max];
        array[max] = array[index];
        array[index] = tmp;
    }
}
