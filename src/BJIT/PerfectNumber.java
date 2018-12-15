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
public class PerfectNumber {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        while(true)
        {
            int n=input.nextInt();
            int sum=0;
            for(int i=1;i<n;i++){
                if(n%i==0) sum+=i;
            }
            if(sum==n) System.out.println(n+" is a perfect number.");
            else System.out.println(n+" isn't a perfect number.");
        }
    }
    
}
