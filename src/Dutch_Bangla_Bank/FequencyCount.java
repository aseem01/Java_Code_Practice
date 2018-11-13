/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dutch_Bangla_Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASHIM
 */
public class FequencyCount {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=input.nextInt();
        }
        
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(array[i]))
            {
                map.put(array[i],map.get(array[i])+1);
            }
            else map.put(array[i], 1);
        }
        
        for(int i=1;i<=10;i++)
        {
           // System.out.println("res : "+map.get(i));
            if(map.get(i)!=null)
            {
                System.out.println(i+" is occurrence : "+map.get(i));
            }
        }
        
    }
    
}
