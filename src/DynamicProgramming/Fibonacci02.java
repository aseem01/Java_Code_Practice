/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

import java.util.Scanner;

/**
 *
 * @author ASHIM
 */
public class Fibonacci02 {
    static int array[]=new int[500];
    void fibonacci(int n)
    {
        if(n==0)
        {
           array[n]=0;
        }
        else if(n==1)
        {
           array[n]=1;
        }
        else 
        {
            //array[n]=fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        Fibonacci02 obj=new Fibonacci02();
        
    }
    
}
