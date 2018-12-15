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
public class FirstSecondLargestNumber {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int []array=new int[n];
        for(int i=0;i<n;i++) array[i]=input.nextInt();
        int first=0;
        int second=0;
        for(int i=0;i<n;i++){
            if(array[i]>first)
            {
                second=first;
                first=array[i];
            }
            else if(array[i]>second){
                second=array[i];
            }
        }
        System.out.println("first : "+first+" Second : "+second);
    }
    
}
