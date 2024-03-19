/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konstruktor;

/**
 *
 * @author Neendy's
 */
public class Sepatu {
    private String warna;
    private int nomorSepatu;
    
    /*Konstruktor , sifat:
    a. namanya harus sama dengan class
    b. tidak memiliki nilai balik (termasuk tidak boleh ada kata  kunci void)
    */
    
    public Sepatu(String warna){
        this.warna = warna;
    }
    public Sepatu(String warna, int nomorSepatu){
        this.warna = warna;
        this.nomorSepatu = nomorSepatu;
    }
    
//    method
    public void info(){
        System.out.println("Warna : " + this.warna);
        System.out.println("Nomor sepatu : " + this.nomorSepatu);
    }
}
