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
public class Palindrome {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int flag=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag=1;
                break;
            }
        }
        if(flag==1) System.out.println("not palindrome");
        else System.out.println("yes palindrome");
    }
    
}
