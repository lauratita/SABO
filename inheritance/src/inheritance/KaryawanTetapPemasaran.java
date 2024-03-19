/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Neendy's
 */
public class KaryawanTetapPemasaran extends KaryawanPemasaran{
    private double gajiPokok;
    
    public KaryawanTetapPemasaran(String nama, String nik, double total, double komisi, double gajiP){
        super(nama, nik, total, komisi);
        setGajiPokok(gajiP);
    }
    public void setGajiPokok(double gaji){
        gajiPokok = gaji;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }
    public double getTotalGaji(){
        return gajiPokok+super.getHonorarium();
    }
    public String toString(){
        return String.format("%s\nGaji Pokok : Rp%.2f\nGaji Total : Rp%.2f\n", super.toString(), getGajiPokok(), getTotalGaji());
    }
}
