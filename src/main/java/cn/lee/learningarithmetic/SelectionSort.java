package cn.lee.learningarithmetic;

public class SelectionSort {

    public static void main(String[] args) {
        Integer[] arr = ArrayUtil.integerBuilder(15);
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[minPos] > arr[j] ? j : minPos;
            }
            ArrayUtil.swap(arr, i, minPos);
        }
        ArrayUtil.printArray(arr);
    }

}
