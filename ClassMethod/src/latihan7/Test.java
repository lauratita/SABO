/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7;

/**
 *
 * @author Neendy's
 */
public class Test {
//    public void doNothing(Double d){
//        System.out.println("Double");
//    }
    public void doNothing(Object object){
        System.out.println("Object");
    }
    public void doNothing(int i){
        System.out.println("Integer");
    }
    public void doNothing(double d){
        System.out.println("Double");
    }
    public static void main(String[] args){
        Test test = new Test();
        test.doNothing(null);
    }
}
