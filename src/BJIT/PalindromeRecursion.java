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
public class PalindromeRecursion {
    public static boolean palindrome(String s)
    {
        if(s.length()==1) return true;
        if(s.charAt(0)==s.charAt(s.length()-1)) return palindrome(s.substring(1,s.length()-1));
        return false;
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        while(true){
            String s=input.next();
            if(PalindromeRecursion.palindrome(s)) System.out.println("Yes!It's Palindrome");
            else System.out.println("Sorry,Man! It's not Palindrome");
            
        }
    }
    
}
