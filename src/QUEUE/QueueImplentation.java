/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUEUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ASHIM
 */
public class QueueImplentation {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Queue<Integer>queue=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            int value=input.nextInt();
            queue.add(value);
        }
        
        System.out.println("After implentation");
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }
        
    }
    
}
