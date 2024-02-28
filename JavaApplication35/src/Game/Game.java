/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

/**
 *
 * @author Neendy's
 */
public class Game {
    public static void main(String[] args){
        
//        instansiasi
        Player jagoan = new Player();
        
//        mengisi atribut player
        jagoan.name = "Gatot Kaca";
        jagoan.speed = 80;
        jagoan.healthPoint = 0;
        
//        mengakses behaviour (method run)
        jagoan.run();
        
        if(jagoan.isDead()){
            System.out.println("Game Over!");
        }
    }
}
