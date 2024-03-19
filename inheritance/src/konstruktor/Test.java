/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konstruktor;

/**
 *
 * @author Neendy's
 */
class One {
//    String sayHello(String name){
//        return "Hello " + name;
//    }
//    
//    char[] sayHi(String name){
//        return ("Hello " + name).toCharArray();
//    }
    
//    void One(){
//        System.out.println("Object created");
//    }
    
//    konstruktor
    public One(int i){
        System.out.println("int");
    }
    
    public void One(short s){
        System.out.println("short");
    }
}

public class Test{
    public static void main(String[] args){
        short s = 10;
        One one = new One(s);
//        One one = new One();
//        Object object = one.sayHello("OCAJP");
//        
//        if(object instanceof String)
//            System.out.println("String");
//        else
//            System.out.println("Array");
    }
}

