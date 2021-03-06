package com.growingwiththeweb.algorithms.interviewquestions.twostackqueue;

import java.util.Stack;

public class StackQueue<T> {
    private Stack<T> s1 = new Stack<T>();
    private Stack<T> s2 = new Stack<T>();

    public void push(T obj) {
        s1.push(obj);
    }

    public T pop() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return null;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
