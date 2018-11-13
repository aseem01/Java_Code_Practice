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
public class PalindromeCheck {

    static boolean Palindrome(String s) {
        String ss = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char sss = s.charAt(i);
            ss = ss + sss;
        }
        if (s.equals(ss)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println("Palindrome check is : " + PalindromeCheck.Palindrome(s));
    }
    
}
