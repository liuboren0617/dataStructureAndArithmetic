package src.chap2;

import java.util.Arrays;

/**
 * @author liuboren
 * @Title: 插入排序
 * @Description:
 * @date 2019/9/26 13:09
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] nums = {3,1,4,2,14,3,43,32,10,999,888,6465,10005,19};
        /*外层循环,从1开始,因为要和左边的数字比较*/
        for (int out = 1; out < nums.length; out++) {
            int in = out;
            int tempNum = nums[out];
            while (in > 0 && nums[in-1] > tempNum){
                /*右移一位*/
                nums[in] = nums[in-1];
                // 比较下一位
                --in;
            }
            /*没有数字比最开始比较的值大的时候,将最开始比较的值插入当前下标*/
            nums[in] = tempNum;
        }

        System.out.println("nums = " + Arrays.toString(nums));
    }
}
