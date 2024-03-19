/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package One;

/**
 *
 * @author Neendy's
 */

class One{
    public void One(String name){
        System.out.println("Parent Hello");
    }
}


class Two extends One{
}

public class Test {
    public static void main(String[] args){
        Two two = new Two();
    }
}
