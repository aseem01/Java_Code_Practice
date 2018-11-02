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
public class Fibonacci01 {
    int fibo(int n)
    {
        if(n==1) return 0;
        else if(n==2) return 1;
        else 
        {
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        Fibonacci01 obj=new Fibonacci01();
        System.out.println("result : "+obj.fibo(input.nextInt()));
    }
    
}
