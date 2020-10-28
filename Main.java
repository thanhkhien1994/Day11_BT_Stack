package com.khien.BT_Stack;

import java.util.ArrayList;
import java.util.Stack;
//[Bài tập] Đảo ngược phần tử trong mảng số nguyên sử dụng Stack

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> temp = new ArrayList<>();
        StackInt stackInt = new StackInt();
        stackInt.stackInt(stack, temp);

        Stack<String> stack1 = new Stack<>();
        ArrayList<String> temp1 = new ArrayList<>();
        StackString stackString = new StackString();
        stackString.stackString(stack1, temp1);

    }
}
