/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJIT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASHIM
 */
public class Occurrence {
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=input.next();
            Map<Character,Integer>mp=new HashMap<Character,Integer>();
            for(int j=0;j<s.length();j++)
            {
                if(mp.containsKey(s.charAt(j)))
                {
                    mp.put(s.charAt(j),mp.get(s.charAt(j))+1);
                }else
                {
                    mp.put(s.charAt(j), 1);
                }
            }
            
            for(char ch='a';ch<='z';ch++)
            {
                if(mp.get(ch)!=null)
                {
                    System.out.println(ch+" occurrence : "+mp.get(ch));
                }
            }
        }
    }
    
}
