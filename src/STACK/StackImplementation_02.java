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
public class StackImplementation_02 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        Stack<Integer>stack=new Stack<Integer>();
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            int value=input.nextInt();
            stack.add(value);
        }
    }
    
}
