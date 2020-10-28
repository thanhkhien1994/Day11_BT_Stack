package com.khien.BT_Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackInt {
    public void stackInt(Stack<Integer> stack, ArrayList<Integer> temp) {
        System.out.println("Mảng số ban đầu");
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            System.out.print(stack.get(i)+"-");
        }
        System.out.println("");
        System.out.println("Mảng sau khi đã đảo: ");
        for (int i = 0; i <10 ; i++) {
            temp.add(stack.pop());
            stack.push(temp.get(i));
            System.out.print(stack.pop()+"-");
        }
        System.out.println("");

        stack.clear();


    }

}
