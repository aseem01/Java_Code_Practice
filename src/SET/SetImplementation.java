/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ASHIM
 */
public class SetImplementation {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Set<Integer>s=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int value=input.nextInt();
            s.add(value);
        }
        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
