/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Neendy's
 */
public class Main {
//    tidak bisa dicompile karena tidak memilik method main
    public void TestMethod(){
        int a = 0;
        class TestInner{
            public void InnerMethod(final int x, int y){
                System.out.println(a);
            }
        }
    }
}
