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
public class ReverseString {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String ss="";
        for(int i=s.length()-1;i>=0;i--){
            ss=ss+s.charAt(i);
        }
        System.out.println("reverse string : "+ss);
    }
    
}
