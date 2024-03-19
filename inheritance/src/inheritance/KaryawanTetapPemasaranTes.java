/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Neendy's
 */
public class KaryawanTetapPemasaranTes {
    public static void main(String[] args){
        KaryawanTetapPemasaran ktp = new KaryawanTetapPemasaran("Hariman Purjoko", "111-111-111", 7500000, 15, 2000000);
        System.out.println("Nama Karyawan   : "+ktp.getNama());    
        System.out.println("NIK Karyawan    : "+ktp.getNik());    
        System.out.println("Gaji Pokok      : "+ktp.getGajiPokok());    
        System.out.println("Honorarium      : "+ktp.getHonorarium());    
        System.out.println("Total Gaji      : "+ktp.getTotalGaji());    
        System.out.println("\nTampilan ktp/objek:");    
        System.out.println(ktp);    
    }
}
