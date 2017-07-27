package insertionSort.bubbleSort;

/**
 * BubbleSort
 * 冒泡排序
 * @author Jiang Meiwei
 * @version 1.0
 *
 */
public class BubbleSort {
    
    public static void main(String[] args) {
        int[] numbers = {1,4,2,65,8,4,3,2,7,8,45,};
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
