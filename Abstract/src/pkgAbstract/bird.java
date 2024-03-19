/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgAbstract;

/**
 *
 * @author Neendy's
 */

// subclass
public class bird extends Animal {
    public bird (String color, int leg){
//        memanggil method set
        setColor(color);
        setLeg(leg);
        
        System.out.println("Color: " + getColor());
        System.out.println("Leg: " + getLeg());
    }
//    implementasi abstract method
    public void walk(){
        System.out.println("Bird have 2 legs");
    }
    
    public void sound(){
        System.out.println("ciiit ciiiit");
    }
}
