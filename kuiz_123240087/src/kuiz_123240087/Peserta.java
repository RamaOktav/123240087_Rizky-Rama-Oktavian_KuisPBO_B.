/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuiz_123240087;

/**
 *
 * @author Lab Informatika
 */
public class Peserta {
    private static int counter = 1;
    private String idPeserta;
    private String nama;
    private String nomorTelepon;
    
    public Peserta (String nama, String nomorTelepon){
        this.idPeserta = String.format("P%03d", counter++);
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }
    public String getIdPeserta(){
        return idPeserta;
    }
    
    public String getNama(){
        return nama;
    }
    public String getNomorTelepon(){
        return nomorTelepon;
    }
}
