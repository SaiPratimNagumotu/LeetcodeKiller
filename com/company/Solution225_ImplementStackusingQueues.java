package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution225_ImplementStackusingQueues {
    public static void main(String[] args) {

    }
    class MyStack {

        Queue<Integer> q1;
        Queue<Integer> q2;
        int top;
        /** Initialize your data structure here. */
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            q1.offer(x);
            this.top = x;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while (q1.size()>1){
                top = q1.peek();
                q2.offer(q1.poll());
            }
            int poped = q1.poll();
            return poped;
        }

        /** Get the top element. */
        public int top() {
           return top;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q1.isEmpty()&&q2.isEmpty();
        }
    }
}
