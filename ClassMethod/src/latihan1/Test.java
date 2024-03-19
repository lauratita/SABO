/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Neendy's
 */
public class Test {
//    class variable
    private int i = 0;
    
//    class default
    class TestInner{
//        instance variable
        public int i = 1;
        
//        method without return value
        void sayHi(){
            System.out.println(i);
        }
    }
    
    //        method static
        public static void main (String[] args){
//            intansiasi (class, object, proses instansiasi, superclass)
            TestInner inner = new Test().new TestInner();
//            object.method
            inner.sayHi();
        }
}
