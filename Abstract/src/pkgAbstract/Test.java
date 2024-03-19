/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgAbstract;

/**
 *
 * @author Neendy's
 */
public class Test {
    public static void main(String[] args){
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
