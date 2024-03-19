/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgAbstract;

/**
 *
 * @author Neendy's
 */
abstract class Animal2 {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
    
//    Animal2 myObj = new Animal2();
    
    class Pig extends Animal2{
        public void animalSound(){
            System.out.println("The pig says: wee wee");
        }
    }
    
    
}


