package chap2;

import java.util.Arrays;

/**
 * @author liuboren
 * @Title: 选择排序
 * @Description:
 * @date 9/24/2019 6:54 AM
 */
public class SelectSort {
    public static void main(String[] args) {
        int [] nums = {3,1,4,2,14,3,43,32,10,999,888,6465,10005,19};
        for (int i = 0; i < nums.length - 1; i++) {
            //声明一个临时下标位置,用来保存比较后较小的数字的下标.
            int tempIndex = i;
            /* 从最小的数字的右边开始比较,所以循环开始为i+1,
                最大循环次数为 j+1到小于数组最大长度*/
            for (int j = i+1; j < nums.length; j++) {
                // 如果当前数字比最左边的数字小,则保留当前位置的下标
                if (nums[j] < nums[tempIndex]){
                    tempIndex = j;
                }
            }
            /* 交换当前数字与之前最左边数字的位置*/
            int tempNum = nums[i];
            nums[i] = nums[tempIndex];
            nums[tempIndex] = tempNum;
        }
        System.out.println("选择排序后的nums = " + Arrays.toString(nums));
    }
}
