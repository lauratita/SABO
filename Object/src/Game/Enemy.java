/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

/**
 *
 * @author Neendy's
 */
class Enemy {
    String name;
    int hp;
    int attackPoint;
    
    void attack(){
        System.out.println("Serang!");
    }
    
    Enemy monster = new Enemy();
    Zombie zumbi = new Zombie();
    Pocong hantuPocong = new Pocong();
    Burung garuda = new Burung();
}
