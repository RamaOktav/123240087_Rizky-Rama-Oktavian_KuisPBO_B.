/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuiz_123240087;

/**
 *
 * @author Lab Informatika
 */
public class KursusBundle extends PaketKursus implements Perpanjang{
     public KursusBundle(double hargaKursus)
            throws DataKursusTidakValidException{
        super("Kursus Bundle ", hargaKursus);
    }

    @Override
    public double hitungBiayaTotal() {
            return hargaKursus + 150000;
    }
   
    @Override
    public void cetakInfoPerpanjangan(int hariTambahan) {
       double hasil = hargaKursus * 5/100 * 30;
        System.out.println("Perpanjangan : RP."+ hasil +" Untuk 30 hari tambahan.");
    }
}
