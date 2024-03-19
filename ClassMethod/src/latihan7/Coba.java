/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7;

/**
 *
 * @author Neendy's
 */
public class Coba {
    public static void main(String[] args){
        One o = new Two();
        o.sayHello();
    }
}

class One{
    public final void sayHello(){
        System.out.println("Parent Hello");
    }
}


class Two extends One{
//    public void sayHello(){
//        
//    }
}
