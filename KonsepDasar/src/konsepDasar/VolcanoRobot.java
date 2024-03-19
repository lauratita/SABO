/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konsepDasar;

/**
 *
 * @author Neendy's
 */

//nama class
class VolcanoRobot {
//    instance variable
    String status;
    int speed;
    float temparature;
    
//    methods
    void checkTemparature(){
        if (temparature > 660){
            status = "returning home";
            speed = 5;
        }
    }
    
    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temparature: " + temparature);
    }
    
    public static void main(String[] args){
        VolcanoRobot dante = new VolcanoRobot();
        dante.status = "exploring";
        dante.speed = 2;
        dante.temparature = 510;
        
        dante.showAttributes();
        System.out.println("Increasing speed to 3.");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changing temparature to 670.");
        dante.temparature = 670;
        dante.showAttributes();
        System.out.println("Checking the temparature.");
        dante.checkTemparature();
        dante.showAttributes();
    }
}


