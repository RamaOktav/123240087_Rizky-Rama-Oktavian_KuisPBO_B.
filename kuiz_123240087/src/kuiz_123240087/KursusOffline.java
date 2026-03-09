/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuiz_123240087;

/**
 *
 * @author Lab Informatika
 */
public class KursusOffline extends PaketKursus implements Perpanjang{
    public KursusOffline(double hargaKursus)
            throws DataKursusTidakValidException{
        super("Kursus Online ", hargaKursus);
    }

    @Override
    public double hitungBiayaTotal() {
            return hargaKursus + 50000;
    }
   
    @Override
    public void cetakInfoPerpanjangan(int hariTambahan) {
        double hasil = hargaKursus * 10/100 * 30;
        System.out.println("Perpanjangan : RP."+ hasil +" Untuk 30 hari tambahan.");
    }
}
