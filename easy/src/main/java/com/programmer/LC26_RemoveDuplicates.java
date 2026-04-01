package com.programmer;


/**
 *  删除有序数组中的重复项
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 17:06
 */
public class LC26_RemoveDuplicates {
    //给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
    //
    //考虑 nums 的唯一元素的数量为 k。去重后，返回唯一元素的数量 k。
    //
    //nums 的前 k 个元素应包含 排序后 的唯一数字。下标 k - 1 之后的剩余元素可以忽略。
    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{1, 1, 2,2,2});
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println("i1 = " + i1);
        }
        System.out.println("数组长度 = " + i);
    }

    // 思路
    // 1. 循环原始数组
    // 2. 定义一直指针从0开始（用于表示如果发现数据存在问题用来记录位置并替换）
    // 3. 发现数据大小问题执行覆盖，指针值+1

    //慢指针 count 指向下一个不重复元素应该放置的位置
    //快指针 fast 用于遍历数组
    //比较 nums[count] 和 nums[count-1]（或 nums[slow-1]）来判断是否重复
    //如果不重复，就覆盖到 nums[slow] 的位置
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

}
