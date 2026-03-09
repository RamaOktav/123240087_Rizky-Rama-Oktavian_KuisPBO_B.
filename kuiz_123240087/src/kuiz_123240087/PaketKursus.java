/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuiz_123240087;

/**
 *
 * @author Lab Informatika
 */
public abstract class PaketKursus {
    protected String namaKursus;
    protected double hargaKursus;
    
    public PaketKursus(String namaKursus, double hargaKursus)
            throws DataKursusTidakValidException{
        if (hargaKursus<=0){
            throw new DataKursusTidakValidException("harga paket tidak valid!");
        }
        this.namaKursus = namaKursus;
        this.hargaKursus = hargaKursus;
    }
    public String getNamaPaket(){
        return namaKursus;
    }
    
    public abstract double hitungBiayaTotal();
    
   
}
