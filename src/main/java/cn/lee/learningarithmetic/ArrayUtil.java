package cn.lee.learningarithmetic;


import java.util.Random;

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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toString() + "   ");
        }
        System.out.println();
    }

    public static <T> void swap(T[] arr, Integer a, Integer b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static <T> void check(T[] arr, T[] check) {
        boolean flag = true;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].equals(check[i])) {
                    flag = false;
                }
            }
        } catch (Exception e) {
            flag = false;
        }
        System.out.println(flag);
    }

}
