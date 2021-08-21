package cn.lee.mytest;


import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class ThTest {

    public static long COUNT = 10_0000_0000L;
    public static int QUANTITY = 1024;

    private static class T {
//        private long p1,p2,p3,p4,p5,p6,p7;
        public long x  = 0L;
//        private long p9,p10,p11,p12,p13,p14,p15;
    }

    public static T[] arr = new T[QUANTITY];

    static {
        for (int i = 0; i < QUANTITY; i++) {
            arr[i] = new T();
        }
    }

    public static void main(String[] args) {
        Thread[] threadArr = new Thread[QUANTITY];
        for (int i = 0; i < QUANTITY; i++) {
            int finalI = i;
            threadArr[i] = new Thread(() -> {
                for (int J = 0; J < COUNT; J++) {
                    arr[finalI].x = J;
                }
                System.out.println(finalI);
            },"线程" + i);
        }
        for (Thread thread : threadArr) {
            thread.start();
        }

    }


}
