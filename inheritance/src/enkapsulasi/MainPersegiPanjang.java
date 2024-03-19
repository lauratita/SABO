/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author Neendy's
 */
public class MainPersegiPanjang {
    public static void main (String[] args){
        PersegiPanjang hitung = new PersegiPanjang();
        hitung.setPanjang(10);
        hitung.setLebar(20);
        System.out.println("Panjang : " + hitung.getPanjang());
        System.out.println("Lebar : " + hitung.getLebar());
        System.out.println("Luas : " + hitung.getLuas());
    }
}
