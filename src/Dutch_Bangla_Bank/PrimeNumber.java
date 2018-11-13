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
public class PrimeNumber {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int cnt=0;
        for(int i=2;i<=n;i++)
        {
            cnt=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0) cnt++;
            }
            if(cnt==0) System.out.println(i);
        }
    }
}
