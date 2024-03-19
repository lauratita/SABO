/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author Neendy's
 */
public class MyDate {
    private int day;
    private int month;
    private int year;
    
//    method without return value
    public void setDay(int dd){
        if (month == 2){
            if (dd > 28){
                System.out.println("Invalid day ...");
            }else {
                day = dd;
            }
        } else {
            if (dd > 31) {
                System.out.println("Invalid day ...");
            } else {
                day = dd;
            }
        }
    }
    
//    method mengembalikan nilai
    public int getDay(){
        return day;
    }
    public static void main (String[] args){
        MyDate d = new MyDate();
        d.day = 32;
        d.month = 2; d.day = 30;
        d.day = d.day + 1;
    }
}
