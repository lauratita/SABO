/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Neendy's
 */
//public class Test{
    
//    OUTPUT 1
//    private int i = 0;
//    
//    class TestInner {
//        public int i = 1;
//        void sayHi(){
//            System.out.println(i);
//        }
//    }
//    
//    public static void main(String[] args){
////    TestInner = class
////    inner = object
////    new = instansiasi
//        TestInner inner = new Test().new TestInner();
//        inner.sayHi();
//    }
    
//    OUTPUT ERROR
//    public int count(int i){
//        return 0;
//    }
//    
//    public int count(int j){ // terjadi error karena nama method double dan tipe data yang sama
//        return 0;
//    }
    
    
//    OUTPUT Hello
class TestInner{
    public void print(){
        System.out.println("Hi");
    }
}
//
public class Test {
    public static void main(String[] args){
        TestInner t = new TestInner(){
            public void print(){
                System.out.println("Hello");
            }
        };
        t.print();
    }
    
    
//    OUTPUT Integer
//    public void doNothing(Object object){
//        System.out.println("Object");
//    }
//    
//    public void doNothing(Integer i){
//        System.out.println("Integer");
//    }
//    
//    public static void main(String[] args){
//        Test test = new Test();
//        test.doNothing(null);
//    }
    
//    OUTPUT 0
//    int i;
//    void print(){
//        System.out.println(i);
//    }
//    
//    public static void main (String[] args){
//        new Test().print();
//    }
    
//    tidak bisa run karena tidak ada method main
//    class InnerClass{
//        static int z = 1;
//    }
    
//    OUTPUT ERROR
//    terjadi ambigu pada method doNothing, test.doNothing(null)
//    public void doNothing(Object object){
//        System.out.println("Object");
//    }
//    public void doNothing(Integer i){
//        System.out.println("Integer");
//    }
//    public void doNothing(Double d){
//        System.out.println("Double");
//    }
//    public static void main(String[] args){
//        Test test = new Test();
//        test.doNothing(null);
//    }
    
//    int x = 0;
//    static int y = 1;
//    
//    static class InnerClass{
//        int z = 2;
//        public void getValue(){
////            acces variable here
//        }
//    }
    
//    OUTPUT ERROR. penamaan method child sama dengan parent
//    public static void main(String[] args){
//        One o = new Two();
//        o.sayHello();
//    }
//}
//
//class One{
//    public final void sayHello(){
//        System.out.println("Parent Hello");
//    }
//}
//
//class Two extends One{
//    public void sayHello(){
//        System.out.println("Child Hello");
//    }
//}
    
//    TIDAK BISA DICOMPILE
//    public void TestMethod(){
//        static class TestInner{
//            int x =0 ;
//        }
//    }
    
}
