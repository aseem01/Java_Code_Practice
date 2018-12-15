/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dutch_Bangla_Bank;

/**
 *
 * @author ASHIM
 */


public class ClassMain extends Animal {
    public static void result()
    {
        System.out.println("It's a classMain static method");
    }
    public void temp()
    {
        System.out.println("It's a ClassMain class non static class");
    }
    public static void main(String []args){
        ClassMain obj=new ClassMain();
        Animal myAnimal=obj;
        Animal.result();
        myAnimal.temp();
        
    }
}
