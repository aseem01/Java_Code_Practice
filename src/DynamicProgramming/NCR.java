/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

import java.util.Scanner;

/**
 *
 * @author ASHIM
 */
public class NCR {

   static int[][] array = new int[100][100];

    int ncr(int n, int r) {
        if (n == r) {
            return 1;
        }
        if (r == 0) {
            return 1;
        }
        if (array[n][r] != -1) {
              return array[n][r];
        }
        else 
        {
           return array[n][r]=ncr(n-1,r)+ncr(n-1,r-1); 
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                array[i][j] = -1;
            }
        }
        
        NCR obj=new NCR();
        System.out.println("result : "+obj.ncr(n, r));

    }

}
