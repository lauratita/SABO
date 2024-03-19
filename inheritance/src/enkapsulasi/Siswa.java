/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author Neendy's
 */
public class Siswa {
    public int nrp;
    public String nama;
    
    public void setNRP(int n){
        if (n >= 1 && n <= 10)
            nrp = n;
        else 
            System.out.println("Di luar range");
    }
    
    public int getNRP(){
        return nrp;
    }
    
    
    public void info(){
        System.out.println(nrp + " " + nama + " " + "adalah siswa PENS");
    }
}
