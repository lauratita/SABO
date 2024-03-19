/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Neendy's
 */
public class KaryawanPemasaranTes {
    public static void main(String[] args){
        KaryawanPemasaran karyawan = new KaryawanPemasaran("Desi Ekasari", "2010080005", 1750000.0, 15.0);
        System.out.println("Nama Karyawan: " + karyawan.getNama());
        System.out.println("Nomor Induk: " + karyawan.getNik());
        System.out.printf("Penjualan kotor: Rp%.2f\n", karyawan.getTotalJual());
        System.out.printf("Komisi : %.2f persen\n", karyawan.getPersenKomisi());
        System.out.printf("Honorarium : Rp%.2f\n", karyawan.getHonorarium());
        
        karyawan.setTotalJual(3550000);
        karyawan.setPersenKomisi(25);
        System.out.println();
        System.out.println(karyawan);
    }
}
