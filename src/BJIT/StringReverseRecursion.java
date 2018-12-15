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
public class StringReverseRecursion {
    public static String reverseString(String s){
        System.out.println(s);
        if(s.isEmpty()) return s;
        else return reverseString(s.substring(1))+s.charAt(0);
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String s=input.next();
        System.out.println("Reverse String is : "+StringReverseRecursion.reverseString(s));
    }
    
}
