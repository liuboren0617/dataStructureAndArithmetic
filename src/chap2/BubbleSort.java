package chap2;

import java.util.Arrays;

/**
 * @author liuboren
 * @Title: 冒泡排序
 * @Description:
 * @date 9/19/2019 8:19 PM
 */
public class BubbleSort {
    public static void main(String[] args) {
        /*可替换的数组的数字 => 3,1,4,2,14,3,43,32,10,999,888,6465,10005,19*/
        int [] nums = {3,2,1};
        int [] nums1 = {3,2,1};

        int count = 0;
        int count1 = 0;
       /*  口诀..  n个数字来排队,两两相比小靠前, 内层循环n-1 ,外层循环n-1-i*/
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length -1 - i; j++) {
               ++count;
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for (int i = nums1.length - 1; i > 1 ; i--) {
            for (int j = i  ; j > 0; j --) {
                ++count1;
                if(nums1[j] < nums1[j-1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j-1];
                    nums1[j-1] = temp;
                }
            }
        }
        System.out.println("count = " + count);
        System.out.println("count1 = " + count1);
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("nums = " + Arrays.toString(nums1));

        int [] nums2 = {3,2,1};
        int count2 = 0;
        for (int i = nums2.length - 1 ; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                ++count2;
                if(nums2[j] > nums2[j+1]){
                    int temp = nums2[j];
                    nums2[j] = nums2[j+1];
                    nums2[j+1] = temp;
                }
            }
        }
        System.out.println("count2 = " + count2);
        System.out.println("nums2 = " + Arrays.toString(nums2));


    }


   /* public static void main(String[] args) {
        int [] nums = {3,2,1};
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length -1 - i; j++) {
                ++count;
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }*/
}
