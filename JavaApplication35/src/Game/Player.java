/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

/**
 *
 * @author Neendy's
 */
public class Player {
    
//    Atribut
    String name;
    int speed;
    int healthPoint;
    
//    behaviour (bentuknya method) run
    void run(){
        System.out.println(name + " is running");
        System.out.println("Speed : " + speed);
    }
    
//    behaviour (bentuknya method) isDead untuk mengecek nilai healthPoint
    boolean isDead(){
        if(healthPoint <= 0)
            return true;
        return false;
    }
}
