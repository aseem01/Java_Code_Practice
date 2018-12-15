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
public class GCDFinding {
    public static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int a,b;
        a=input.nextInt();
        b=input.nextInt();
        System.out.println(a+" and "+b+" gcd is : "+gcd(a,b));
    }
    
}
