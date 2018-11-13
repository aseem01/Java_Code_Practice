/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dutch_Bangla_Bank;

/**
 *
 * @author ASHIM
 */
public class BubbleSort {
    static void sort(int[] array)
    {
        int len=array.length;
        for(int i=0;i<len;i++)
        {
            for(int j=1;j<len-i;j++)
            {
                if(array[j-1]>array[j])
                {
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    public static void main(String []args){
        int array[]={6,4,3,1,2,5,7,8,9,10,13,12,11,15,14};
        int len=array.length;
        System.out.println("Before sorting array : ");
        for(int i=0;i<len;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
        BubbleSort.sort(array);
        System.out.println("After sorting array : ");
        for(int i=0;i<len;i++)
        {
            System.out.print(array[i]+" ");
        }
        
    }
    
}
