package chap2;

import java.util.Arrays;

/**
 * @author liuboren
 * @Title: 选择排序
 * @Description:
 * @date 9/26/2019 6:53 AM
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 14, 3, 43, 32, 10, 999, 888, 6465, 10005, 19};
        int out, in;
        for (out = 1; out < nums.length; out++) {
            // 设置临时值,保存当前循环值
            int temp = nums[out];
            // 内部循环变量,等于外部变量的值
            in = out;
            /* 如果in > 0 同时从标记位(out)开始,
            * 如果标记为左边的值大于标记为的值,进入循环*/
            // 1 3 4 2
            while (in > 0 && nums[in - 1] >= temp) {
                // 标记位左边的位置向右移动
                nums[in] = nums[in - 1];
                --in;
            }
            nums[in] = temp;
        }
        System.out.println("nums = " + Arrays.toString(nums));
    }
}
