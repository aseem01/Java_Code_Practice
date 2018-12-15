/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SET;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author ASHIM
 */
public class SortedSetImplementation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int n = input.nextInt();
        String smallest = s.substring(0, n);
        String largest = s.substring(0, n);
        for (int i = 0; i <= s.length() - n; i++) {
            String cur = s.substring(i, n + i);
            if (cur.compareTo(smallest) < 0) {
                System.out.println("small : " + cur.compareTo(smallest) + "  cur : " + cur + " before : " + smallest);
                smallest = cur;
            }
            if (cur.compareTo(largest) > 0) {
                System.out.println("largest : " + cur.compareTo(largest) + " cur : " + cur + " before : " + largest);
            }
        }
    }

}
