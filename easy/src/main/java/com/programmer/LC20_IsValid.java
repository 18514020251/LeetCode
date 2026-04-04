package com.programmer;

import java.util.ArrayList;
import java.util.List;

/**
 * 有效的括号(LC20)
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-04-02 15:56
 */
public class LC20_IsValid {
    /*
    * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

      有效字符串需满足：

      左括号必须用相同类型的右括号闭合。
      左括号必须以正确的顺序闭合。
      每个右括号都有一个对应的相同类型的左括号
    * */
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        List<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                list.add(ch);
            } else {
                if (list.isEmpty()) {
                    return false;
                }
                char last = list.get(list.size() - 1);
                if ((ch == ')' && last == '(') ||
                        (ch == ']' && last == '[') ||
                        (ch == '}' && last == '{')) {
                    list.remove(list.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }
}
