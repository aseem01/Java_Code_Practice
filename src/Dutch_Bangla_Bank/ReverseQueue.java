/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dutch_Bangla_Bank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ASHIM
 */
public class ReverseQueue {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Queue<Integer>queue=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
        {
            queue.add(input.nextInt());
        }
                
       Stack<Integer>stack=new Stack<Integer>();
        System.out.println("value in queue : ");
        while(!queue.isEmpty())
        {
            System.out.print(queue.peek()+" ");
            stack.add(queue.peek());
            queue.poll();
        }
        System.out.print("\n");
        System.out.println("value in stack :");
        while(!stack.isEmpty())
        {
            System.out.print(stack.peek()+" ");
            queue.add(stack.peek());
            stack.pop();
        }
        System.out.print("\n");
        System.out.println("Reverse in Queue : ");
        while(!queue.isEmpty())
        {
            System.out.print(queue.peek()+" ");
            queue.poll();
        }
    }
}
