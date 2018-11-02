/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUEUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ASHIM
 */
public class ReverseQueue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            int value = input.nextInt();
            queue.add(value);
        }
        
        System.out.println("After insert a value in queue");
        Stack<Integer>stack=new Stack<Integer>();
        while(!queue.isEmpty()){
            stack.add(queue.peek());
            System.out.println(queue.peek());
            queue.poll();
        }
        
        System.out.println("After insert a value in stack");
        while(!stack.isEmpty()){
            queue.add(stack.peek());
            System.out.println(stack.peek());
            stack.pop();
        }
        
        System.out.println("After reverse a value in the queue");
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }
        
        
        
        
    }

}
