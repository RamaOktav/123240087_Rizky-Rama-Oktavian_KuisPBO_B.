/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuiz_123240087;

/**
 *
 * @author Lab Informatika
 */
public class KursusOnline extends PaketKursus{
    public KursusOnline(double hargaKursus)
            throws DataKursusTidakValidException{
        super("Kursus Online ", hargaKursus);
    }

    @Override
    public double hitungBiayaTotal() {
            return hargaKursus;
    }

    
}
