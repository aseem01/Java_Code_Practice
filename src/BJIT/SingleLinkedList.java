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
public class SingleLinkedList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list=new LinkedList();
        while (true) {
            System.out.println("Implementation single linklist.Wow! you are great man");
            System.out.println("If you want insert first press 1");
            System.out.println("If you want insert end press 2");
            System.out.println("If you want insert any position press 3");
            System.out.println("If you want to delete press 4");
            int type=input.nextInt();
            if(type==1)
            {
                System.out.println("Enter value that are you want insert in linkedlist : ");
                list.insertAtFirst(input.nextInt());
            }
            else if(type==2)
            {
                System.out.println("Enter value that are you want insert in linkedlist : ");
                list.insertAtLast(input.nextInt());
            }
            else if(type==3)
            {
                System.out.println("Enter value and position that are you want insert in linkedlist : ");
                list.insertAtAnyPosition(input.nextInt(),input.nextInt());
            }
            else if(type==4)
            {
                System.out.println("Enter poition that are you want delete from linkedlist : ");
                list.DeleteAtAnyPosition(input.nextInt());
            }
            
            System.out.println("After operation linkedlist condition : ");
            list.Display();
        }
    }

}
