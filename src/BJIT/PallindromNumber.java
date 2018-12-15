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
public class PallindromNumber {
    public static int fun(int n)
    {
        int reverse=0;
        while(n!=0)
        {
            reverse=reverse*10;
            reverse=reverse+n%10;
           n=n/10;
        }
        return reverse;
    }
    
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int reverse=PallindromNumber.fun(n);
        if(reverse==n) System.out.println(n+" is a palindrom.");
        else System.out.println(n+" isn't a palindrome.");
    }
    
}
