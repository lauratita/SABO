/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author Neendy's
 */
//default class
class TestInner{
//    method without return value
    public void print(){
        System.out.println("Hi");
    }
}

public class Test {
//    method static
    public static void main(String[] args){
//        inisialisasi 
        TestInner t = new TestInner(){
//            method without return value
            public void print(){
                System.out.println("Hello");
            }
        };
//        onject.method
        t.print();
    }
}
