/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phone;

import java.util.Scanner;

/**
 *
 * @author Neendy's
 */
public class Main {
    public static void main (String[] args){
//        membuat objek hp
        Phone redmiNote8 = new Xiomi();
        
//        membuat objek user
        PhoneUser HP = new PhoneUser(redmiNote8);
        
//        menyalakan HP
        HP.turnOnThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while(true){
            System.out.println("Aplikasi Interface");
            System.out.println("[1] nyalakan hp");
            System.out.println("[2] matikan hp");
            System.out.println("[3] perbesar volume");
            System.out.println("[4] kecilkan volume");
            System.out.println("[0] keluar");
            System.out.println("-------------------");
            System.out.println("pilih aksi>");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                HP.turnOnThePhone();
            } else if(aksi.equalsIgnoreCase("2")){
                HP.turnOffThePhone();
            } else if(aksi.equalsIgnoreCase("3")){
                HP.makePhoneLouder();
            } else if(aksi.equalsIgnoreCase("4")){
                HP.makePhoneSilent();
            } else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else{
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
