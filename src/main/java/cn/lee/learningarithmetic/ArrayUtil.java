package cn.lee.learningarithmetic;

import java.util.Random;

/**
 * @author Lie
 */
public final class ArrayUtil {

    public static Integer[] integerBuilder(Integer initSize) {
        Integer[] res = new Integer[initSize];
        Random random = new Random();
        for (int i = 0; i < initSize; i++) {
            res[i] = random.nextInt(initSize + 100);
        }
        return res;
    }

    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t.toString() + "   ");
        }
        System.out.println();
    }

    public static <T> void swap(T[] arr, Integer a, Integer b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static <T> boolean check(T[] arr, T[] check) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].equals(check[i])) {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static <T> T[] copyArray(T[] arr) {
        T[] res = (T[]) new Object[arr.length];
        System.arraycopy(arr, 0, res, 0, arr.length);
        return res;
    }

}
