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
public class FindSubString {
    public static void main(String []args){
        
        Scanner input=new Scanner(System.in);
        while(true){
            String s=input.next();
            for(int i=0;i<s.length();i++)
            {
                System.out.println(s.substring(i,s.length()));
            }
        }
    }
    
}
