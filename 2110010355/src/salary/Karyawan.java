/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus Laptop
 */
public class Karyawan {
    private int idKaryawan;
    private String namaKaryawan;
    private String alamatKaryawan;
    private String bagian;

    public Karyawan(){}
    // Constructor
    public Karyawan(int idKaryawan, String namaKaryawan, String alamatKaryawan, String bagian) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.alamatKaryawan = alamatKaryawan;
        this.bagian = bagian;
    }

    // Getter dan Setter
    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan =alamatKaryawan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    // Method
    public void tampilkanInfoKaryawan() {
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("Nama Karyawan : " + namaKaryawan);
        System.out.println("Alamat Karyawan : " + alamatKaryawan);
        System.out.println("Bagian : " + bagian);
    }
}

