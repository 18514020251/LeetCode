package com.programmer;

/**
 * 两数之和
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 16:38
 */
public class Main {
    public static void main(String[] args) {
        twoSum(new int[]{3,3}, 6);
    }
    /*
    *
    * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

      你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。

      你可以按任意顺序返回答案。
    *
    * */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("没有找到符合条件的两个数");
    }

}