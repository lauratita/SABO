/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgAbstract;

/**
 *
 * @author Neendy's
 */
public class Rectangle extends Shape {
    double length;
    double width;
    
    public Rectangle(String color, double length, double width){
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
    
    @Override double area(){
        return length*width;
    }
    
    @Override public String toString(){
        return "Rectangle color is " + super.getColor() + " and area is " + area();
    }
}
