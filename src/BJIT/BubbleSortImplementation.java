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
public class BubbleSortImplementation {
    public static void sort(int [] array){
        int len=array.length;
        for(int i=0;i<len;i++)
        {
            for(int j=1;j<len-i;j++)
            {
                if(array[j-1]>array[j])
                {
                    int tmp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                }
            }
        }
        
    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        BubbleSortImplementation.sort(array);
        System.out.println("Afer sorting array");
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
}
