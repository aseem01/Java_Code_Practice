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
public class LCMFinding {
    public static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int a,b;
        a=input.nextInt();
        b=input.nextInt();
        int lcm=(a*b)/gcd(a,b);
        System.out.println(a+" and "+b+" lcm is : "+lcm);
    }
    
}
