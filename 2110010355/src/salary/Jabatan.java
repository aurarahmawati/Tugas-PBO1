/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus Laptop
 */
public class Jabatan {
    private int idJabatan;
    private String namaJabatan;
    private String statusJabatan;
    
    public Jabatan(){}
     // Constructor
    public Jabatan(int idJabatan, String namaJabatan, String statusJabatan) {
        this.idJabatan = idJabatan;
        this.namaJabatan = namaJabatan;
        this.statusJabatan = statusJabatan;
    }

    // Getter dan Setter
    public int getIdJabatan() {
        return idJabatan;
    }

    public void setIdJabatan(int idJabatan) {
        this.idJabatan = idJabatan;
    }

    public String getNamaJabatan() {
        return namaJabatan;
    }

    public void setNamaJabatan(String namaJabatan) {
        this.namaJabatan = namaJabatan;
    }

    public String getStatusJabatan() {
        return statusJabatan;
    }

    public void setStatusJabatan(String statusJabatan) {
        this.statusJabatan =statusJabatan;
    }


    // Method
    public void tampilkanInfoJabatan() {
        System.out.println("ID Jabatan : " + idJabatan);
        System.out.println("Nama Jabatan : " + namaJabatan);
        System.out.println("Status Jabatan : " + statusJabatan);
    }
}

