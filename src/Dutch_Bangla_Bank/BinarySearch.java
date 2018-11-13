/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dutch_Bangla_Bank;

import java.util.Scanner;

/**
 *
 * @author ASHIM
 */
public class BinarySearch {
    static int searching(int target,int[] array,int n)
    {
        int high=n-1;
        int low=0;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(array[mid]==target) return mid;
            else if(array[mid]<target) low=mid+1;
            else if(array[mid]>target) high=mid-1;
        }
        return -1;
    }
    
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.print("How many number you want to keep in array : ");
        int n=input.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        
        System.out.print("How many query you want to perform : ");
        int query=input.nextInt();
        for(int i=0;i<query;i++){
            System.out.print("Enter your target value : ");
            int target=input.nextInt();
            int res=BinarySearch.searching(target, array,n);
            if(res>=0){
            System.out.println("Your target is found : "+(res+1));
            }
            else
            {
                System.out.println("Your isn't found.Sorry yaar");
            }
        }
        
    }
    
}
