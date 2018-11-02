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
public class BinarySearch {
    static int binarysearch(int n,int[] array,int target)
    {
       int low=0;
       int high=n-1;
       int mid;
       while(low<=high)
       {
           mid=(low+high)/2;
           if(array[mid]==target) return mid;
           else if(array[mid]<target) low=mid+1;
           else if(array[mid]>target) high=mid-1;
       }
       
       return -1;
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            int value=input.nextInt();
            array[i]=value;
        }
        System.out.println("Enter target value found ");
        for(int i=0;i<n;i++){
        int target=input.nextInt();
        int done=BinarySearch.binarysearch(n,array,target);
        if(done>=0) System.out.println("found index is : "+(done+1));
        else System.out.println("not found");
        }
    }
    
}
