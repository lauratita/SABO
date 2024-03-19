/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COba;

/**
 *
 * @author Neendy's
 */
public class Test {
    public void doNothing(Object object){
        System.out.println("Object");
    }
    public void doNothing(String string){
        System.out.println("String");
    }
    public void doNothing(int Integer){
        System.out.println("int");
    }
    public static void main(String[] args){
        Test test = new Test();
        test.doNothing(args);
    }
}
