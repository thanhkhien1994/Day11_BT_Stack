package com.khien.BT_Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackString {
    public void stackString(Stack<String> stack, ArrayList<String> temp) {
        stack.push("Khiên");
        stack.push("Phương");
        stack.push("Hà");
        stack.push("Tiên");
        stack.push("Hiên");
        stack.push("Kiên");
        stack.push("Huy");
        stack.push("Giang");
        stack.push("Ngọc");
        stack.push("Lan");
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(stack.get(i)+"-");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            temp.add(stack.pop());
        }
        System.out.println("Mảng sau khi đảo");
        for (int i = 0; i <10 ; i++) {
            stack.push(temp.get(i));
            System.out.print(stack.get(i)+"-");
        }
    }
}
