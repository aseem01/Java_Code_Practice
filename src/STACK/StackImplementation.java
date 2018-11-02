/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STACK;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ASHIM
 */
public class StackImplementation {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Stack<Integer>stack=new Stack<Integer>();
        for(int i=0;i<n;i++){
            int value=input.nextInt();
            stack.add(value);
        }
        System.out.println("After add in the stack in value");
        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    
}
