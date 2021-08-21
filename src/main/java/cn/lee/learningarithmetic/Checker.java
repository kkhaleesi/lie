package cn.lee.learningarithmetic;


import java.util.Arrays;

/**
 * @author Lie
 */
public class Checker<T> {

    private T[] oldArr;

    private T[] sortedArr;

    public void setOldArr(T[] oldArr) {
        this.oldArr = ArrayUtil.copyArray(oldArr);
    }

    public void setSortedArr(T[] sortedArr) {
        this.sortedArr = sortedArr;
    }

    public boolean sortCheck() {
        Arrays.sort(this.oldArr);
        return ArrayUtil.check(this.oldArr, this.sortedArr);
    }

}
