package src.chap7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2019/10/15 19:06
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] nums = new int [30000];
        Random r = new Random(1);
        for (int i = 0; i < nums.length; i++) {
            nums[i] =  r.nextInt();
        }
        long startTime = System.currentTimeMillis();
        System.out.println("nums.length = " + nums.length);
        int h = 1;
        while (h < nums.length) {
            h = 3 * h + 1;
        }

        int inner = 0;
        int temp = 0;
        while (h > 0) {
            for (int outer = h; outer < nums.length; outer++) {
                inner = outer;
                temp = nums[outer];

                while (inner > h - 1 && nums[inner - h] > temp) {
                    nums[inner] = nums[inner - h];
                    // 等价于 inner = inner - h
                    inner -= h;
                }
                nums[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        long endTime =  System.currentTimeMillis() - startTime ;
        System.out.println("endTime = " + endTime);
        System.out.println("nums = " + Arrays.toString(nums));
    }
}
