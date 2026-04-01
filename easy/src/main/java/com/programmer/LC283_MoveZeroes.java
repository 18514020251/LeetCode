package com.programmer;

/**
 * 移动零(LC283)
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-04-01 13:50
 */
public class LC283_MoveZeroes {
    /*
    *
    * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    * */
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[slow] = nums[i];
                slow++;
            }
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
