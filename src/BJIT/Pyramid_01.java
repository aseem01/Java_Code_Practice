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
public class Pyramid_01 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i,j,k,count=1;
        for(i=1;i<=n/2+1;i++)
        {
            for(j=1;j<=n/2-i+1;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=count;k++)
            {
                System.out.print("*");
            }
            count=count+2;
            System.out.print("\n");
        }
        
        count=count-4;
        //System.out.println("jgjhgj");
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=count;k++)
            {
                System.out.print("*");
            }
            count=count-2;
            System.out.print("\n");
        }
    }
    
}
