/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJIT;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ASHIM
 */
public class Balanced_Brackets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String s = input.next();
            int flag = 0;
            Stack<Character> stack = new Stack<Character>();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(' || s.charAt(j) == '{' || s.charAt(j) == '[') {
                    stack.add(s.charAt(j));
                } else {
                    if(!stack.empty())
                    {
                        if(stack.peek()=='(' && s.charAt(j)==')') stack.pop();
                        else if(stack.peek()=='{' && s.charAt(j)=='}') stack.pop();
                        else if(stack.peek()=='[' && s.charAt(j)==']') stack.pop();
                        else 
                        {
                            flag=1;
                            break;
                        }
                    }
                    else
                    {
                        flag=1;
                        break;
                    }
                }
            }

            if (stack.empty() && flag == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
