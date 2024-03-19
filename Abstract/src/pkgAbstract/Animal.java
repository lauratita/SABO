/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgAbstract;

/**
 *
 * @author Neendy's
 */
// superclass
public abstract class Animal {
//    instance variable
    private String color;
    private int leg;
    
//    method mengembalikan nilai harus dengan return_type
    public String getColor(){
        return color;
    }
    
//    tidak mengembalikan nilai
    public void setColor(String color){
        this.color = color;
    }
    
//    without parameter
    public int getLeg(){
        return leg;
    }
    
//    with parameter
    public void setLeg(int leg){
        this.leg = leg;
    }
    
//    method abstract
    public abstract void walk();
    public abstract void sound();
}

