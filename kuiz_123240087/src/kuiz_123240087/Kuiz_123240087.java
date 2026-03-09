/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuiz_123240087;
import java.util.*;
/**
 *
 * @author Lab Informatika
 */
public class Kuiz_123240087 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Peserta> daftarPeserta = new ArrayList<>();
        List<PaketKursus> daftarPaket = new ArrayList<>();
        
        while (true) {
            System.out.println("\n1. Daftar Peserta\n2. Keluar\nPilihan : ");
            int menu = input.nextInt();
            input.nextLine();
            
            if (menu == 2)break;
            try {
                System.out.println("Nama            :");
                String nama = input.nextLine();
                
                System.out.println("Nomor Telepon   :");
                String telepon = input.nextLine();
                if (!telepon.matches("[0-9]+")){
                    System.out.println("Error : Nomor telepon hanya boleh berisi angka!");
                    continue;
                }
                System.out.println("Harga Kursus    :");
                double harga = input.nextDouble();
                
                System.out.println("Jenis Paket (1. Online / 2. Offline / 3. Bundle):");
                int jenis = input.nextInt();
                input.nextLine();
                
                Peserta p = new Peserta(nama, telepon);
                PaketKursus paket;
                
                if (jenis == 1){
                    paket = new KursusOnline(harga);
                }else if (jenis == 2){
                    paket = new KursusOffline(harga);
                }else if (jenis == 3){
                    paket = new KursusBundle(harga);
                } else {
                    System.out.println("Pilihan Paket tidak valid!");
                    continue;
                }
                daftarPeserta.add(p);
                daftarPaket.add(paket);
                System.out.println("pesanan berhasil ditambahkan!");
            } catch (Exception e) {
                System.out.println("Error : "+ e.getMessage());
            }
        }
        System.out.println("\n=======Rekap Peserta=======");
        for(int i=0; i < daftarPeserta.size();i++){
            Peserta p = daftarPeserta.get(i);
            PaketKursus paket = daftarPaket.get(i);      
            System.out.println("Nama    :"+p.getNama());
            System.out.println("Paket   :"+paket.getNamaPaket());
            System.out.println("Total   : Rp."+ paket.hitungBiayaTotal());
            if (paket instanceof Perpanjang) {
                ((Perpanjang)paket).cetakInfoPerpanjangan(i);
            }else {
                System.out.println("Perpanjangan : Tidak bisa perpanjangan");
            }
            System.out.println("\n");
        }
    }
    
}
