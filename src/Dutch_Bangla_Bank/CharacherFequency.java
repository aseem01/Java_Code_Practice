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
public class CharacherFequency {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String s=input.next();
        Map<Character,Integer>map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
            {
             map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        
        for(char ch='a';ch<='z';ch++){
            if(map.get(ch)!=null)
            {
                System.out.println(ch+" is total repated here : "+map.get(ch)+" times");
            }
        }
        
    }
    
}
