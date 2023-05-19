/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus Laptop
 */
public class Absensi {
    private int idAbsen;
    private String idKaryawan;
    private String jamMasuk;
    private String jamKeluar;

    public Absensi(){}
    // Constructor
    public Absensi(int idAbsen, String idKaryawan, String jamMasuk, String jamKeluar) {
        this.idAbsen = idAbsen;
        this.idKaryawan = idKaryawan;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }

    // Getter dan Setter
    public int getIdAbsen() {
        return idAbsen;
    }

    public void setIdAbsen(int idAbsen) {
        this.idAbsen = idAbsen;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasukj(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public String getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(String jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    // Method
    public void tampilkanInfoAbsensi() {
        System.out.println("ID Absen : " + idAbsen);
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("Jam Masuk : " + jamMasuk);
        System.out.println("Jam Keluar : " + jamKeluar);
    }
}