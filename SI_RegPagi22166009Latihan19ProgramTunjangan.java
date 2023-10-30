/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166009.latihan19.programtunjangan;
import java.text.DecimalFormat;
/**
 *
 * @author HP
 * Nama     : Affa Muntazah
 * Kelas    : PBO 019
 * NIM      : 22166009
 * Deskripsi Program : Waktu Saat Ini
 */
public class SI_RegPagi22166009Latihan19ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Saldo Awal
        double saldoAwal = 2500000;
        // Bunga per Bulan (dalam persen)
        double bungaPerBulan = 15;
        // Lama (bulan)
        int lamaBulan = 6;
        
         // Format saldo awal sebagai mata uang
        DecimalFormat df = new DecimalFormat("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);

        // Hitung saldo per bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double bunga = saldoAwal * (bungaPerBulan / 100);
            saldoAwal += bunga;
        // Format saldo per bulan sebagai mata uang
        String saldoBulanFormatted = df.format(saldoAwal);
        System.out.println("Saldo di Bulan ke- " + i + ": Rp. " + saldoBulanFormatted);
        }
    }
}