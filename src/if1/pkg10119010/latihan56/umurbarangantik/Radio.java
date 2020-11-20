/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan56.umurbarangantik;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini menampilkan umur barang antik konsep OOP
 */
public class Radio extends BarangAntik {
    private String name;
    
    public Radio(int umur) {
        super(umur);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
        System.out.println("Nama barang Antik : " + name);
    }
}
