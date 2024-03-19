/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgAbstract;

/**
 *
 * @author Neendy's
 */
public class Circle extends Shape {
    double radaius;
    
    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle constructor called");
        this.radaius = radius;
    }
    
    @Override double area(){
        return Math.PI * Math.pow(radaius, 2);
    }
    
    @Override public String toString(){
        return "Circle color is " + super.getColor() + " and area is : " + area();
    }
}
