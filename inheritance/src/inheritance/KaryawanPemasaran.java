/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Neendy's
 */
public class KaryawanPemasaran extends Object{
//    atribut
    private String nama;
    private String nik;
    private double totalJual;
    private double persenKomisi;
    
//    konstruktor
    public KaryawanPemasaran(String nama, String nik, double total, double komisi){
        this.nama = nama;
        this.nik = nik;
        this.totalJual = total;
        this.persenKomisi = komisi;
    }
    
//    method
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNIK(String nik){
        this.nik = nik;
    }
    public void setTotalJual(double total){
        totalJual = (total<0.0)?0.0:total;
    }
    public void setPersenKomisi(double komisi){
        persenKomisi = (komisi>0.0 && komisi<=100.0)?komisi:0.0;
    }
    public String getNama(){
        return nama;
    }
    public String getNik(){
        return nik;
    }
    public double getTotalJual(){
        return totalJual;
    }
    public double getPersenKomisi(){
        return persenKomisi;
    }
    public double getHonorarium(){
        return totalJual*persenKomisi/100;
    }
    public String toString(){
        return String.format("%s%s, %s%s\n%s%.2f, %s%.1f, %s%.2f\n",
                "Karyawan Pemasaran: ", nama, "NIK: ", nik, 
                "Total Penjualan : Rp", totalJual,"Komisi: ", 
                persenKomisi, "Honorarium: Rp", getHonorarium());
    }
}
