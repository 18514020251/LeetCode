package com.programmer;

/**
 * 移除元素(LC27)
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-04-01 13:40
 */
public class LC27_RemoveElement {
    /*
    * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。

      假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：

      更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
      返回 k。*/
    public static void main(String[] args) {
        removeElement(new int[]{3, 2, 2, 3}, 3);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
