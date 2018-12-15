/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJIT;

import java.util.Scanner;

/**
 *
 * @author ASHIM
 */
public class FactorialRecursion {
    public static int fact(int n){
        if(n==1) return n;
        else return n*fact(n-1);
    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        while(true){
            int n=input.nextInt();
            int res=FactorialRecursion.fact(n);
            System.out.println(n+" factorial is : "+res);
        }
    }
}
