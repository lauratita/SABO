/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Neendy's
 */
class TestChild extends Test{
    public TestChild(){
        System.out.println("TestChild1");
    }
}

public class Test {
    void TestChild(){
        System.out.println("TestChild2");
    }
    
    public static void main(String[] args){
        new Test().TestChild(); 
    }
}
