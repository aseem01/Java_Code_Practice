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
public class EqualChecking {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String s1=input.next();
        String s2=input.next();
        if(s1.equals(s2)) System.out.println("String Mataching.Hurrah!");
        else System.out.println("Alas!String isn't matching");
    }
    
}
