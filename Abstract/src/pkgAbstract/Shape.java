/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgAbstract;

/**
 *
 * @author Neendy's
 */
abstract class Shape {
    String color;
    
    abstract double area();
    public abstract String toString();
    
    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}
