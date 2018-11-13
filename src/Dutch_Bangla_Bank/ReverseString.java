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
public class ReverseString {
    static String ReverseString(String s)
    {
        String ss="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char sss=s.charAt(i);
            ss=ss+sss;
        }
        return ss;
    }
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        System.out.println("Reverse String is : "+ReverseString.ReverseString(s));
        
    }
    
}
