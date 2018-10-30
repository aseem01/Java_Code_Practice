/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector;

import java.util.Vector;

/**
 *
 * @author ASHIM
 */
public class VectorImplementation {
    public static void main(String []args){
        Vector<Integer>v=new Vector<>();
        //value insert into vector field ;
        v.add(100);
        v.add(200);
        v.add(300);
        v.add(50);
        v.add(10);
        v.add(20);
        
        //show value from vector 
        System.out.println("data print from vector");
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i)+" ");
        }
        
        //arraylist declare;
        int[] array=new int[500];
        //value insert into array from vector;
        for(int i=0;i<v.size();i++)
        {
            array[i]=v.get(i);
        }
        //show value from array;
        System.out.println("data print from array");
        for(int i=0;i<v.size();i++){
            System.out.println(array[i]+" ");
        }
        
        
        //bubble sort algorithm;
        for(int i=0;i<v.size();i++)
        {
            for(int j=0;j<v.size()-1;j++)
            {
                if(array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        
        //print data after buble sort;
        System.out.println("after sorting ");
        for(int i=0;i<v.size();i++){
            System.out.println(array[i]+" ");
        }
        
    }
    
}
