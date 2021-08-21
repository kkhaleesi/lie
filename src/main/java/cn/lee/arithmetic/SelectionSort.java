package cn.lee.arithmetic;


import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {
        Integer[] arr = ArrayUtil.integerBuilder(10);
        Integer[] arr1 = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            ArrayUtil.swap(arr, i, temp);
        }
        List<Integer> integers = Arrays.asList(arr1);
        Integer[] objects = (Integer[]) integers.toArray();
        ArrayUtil.check(arr, objects);
    }

}
