package cn.lee.learningarithmetic;

/**
 * @author Lie
 */
public class SelectionSort {

    public static void main(String[] args) {
        Checker<Integer> integerChecker = new Checker<>();

        Integer[] arr = ArrayUtil.integerBuilder(101);

        integerChecker.setOldArr(arr);

        minAndMaxPos(arr);

        integerChecker.setSortedArr(arr);

        System.out.println(integerChecker.sortCheck());
    }

    public static void minPos(Integer... arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[minPos] > arr[j] ? j : minPos;
            }
            ArrayUtil.swap(arr, i, minPos);
        }
    }

    public static void minAndMaxPos(Integer... arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int minPos = i;
            int maxPos = arr.length - 1 - i;
            for (int j = i + 1; j < arr.length - i; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
                if (arr[maxPos] < arr[j - 1]) {
                    maxPos = j - 1;
                }
            }

            if ((arr[minPos] < arr[maxPos])) {
                if (!(minPos == i && maxPos == arr.length - 1 - i)) {
                    ArrayUtil.swap(arr, i, minPos);
                    ArrayUtil.swap(arr, arr.length - 1 - i, i == maxPos ? minPos : maxPos);
                }
            }
        }
    }

}
