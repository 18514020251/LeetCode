package com.programmer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *  最小栈(LC155)
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-04-04 11:17
 */
public class LC155_MinStack {
    /*
    * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
        实现 MinStack 类:
        MinStack() 初始化堆栈对象。
        void push(int val) 将元素val推入堆栈。
        void pop() 删除堆栈顶部的元素。
        int top() 获取堆栈顶部的元素。
        int getMin() 获取堆栈中的最小元素。
    * */

    /*栈常用API
    *
    * 压入	    push(x)	    把元素放到栈顶
      弹出	    pop()	    移除并返回栈顶元素
      查看栈顶	peek()	    返回栈顶元素，但不移除
      是否为空	isEmpty()	栈为空返回 true
    *
    * */

    Deque<Integer> mainStack; // 主栈：存所有元素
    Deque<Integer> minStack; // 辅助栈：存每个位置对应的最小值

    public LC155_MinStack() {
        mainStack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }


    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty()){
            minStack.push(val);
        }else {
            if (val <= minStack.peek()) {
                minStack.push(val);
            }
        }
    }

    public void pop() {
        int num;
        if (!minStack.isEmpty() && !mainStack.isEmpty()){
            num = mainStack.pop();
            if (num == minStack.peek()){
                minStack.pop();
            }
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


}
