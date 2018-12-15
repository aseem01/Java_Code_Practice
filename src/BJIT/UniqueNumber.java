/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJIT;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ASHIM
 */
public class UniqueNumber {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("How Many data you want to store in memory : ");
        int n=input.nextInt();
        Set<Integer>set=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            set.add(input.nextInt());
        }
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
        
    }
}
