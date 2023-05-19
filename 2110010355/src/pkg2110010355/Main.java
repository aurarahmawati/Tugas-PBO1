/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010355;
import salary.*;
/**
 * 
 *
 * @author Asus Laptop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Absensi absensi = new Absensi();
        Admin admin = new Admin();
        Bagian bagian = new Bagian();
        Jabatan jabatan = new Jabatan();
        Karyawan karyawan = new Karyawan();
        User user = new User();
        
        //set
        karyawan.setIdKaryawan(1);
        absensi.setIdAbsen(3);
        
        //get
        System.out.println("ID Karyawan : " + karyawan.getIdKaryawan());
        System.out.println("ID Absen : " + absensi.getIdAbsen());
    }   
}  
       