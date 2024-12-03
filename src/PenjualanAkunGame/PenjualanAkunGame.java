/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Charles Parluhutan_50421306_4IA22
package PenjualanAkunGame;
import java.util.Scanner;
public class PenjualanAkunGame {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            PenjualanAkun.pilihanAkun();
            
            System.out.print("Transaksi lagi? Ya=1, Tidak=2 : ");
            int pilihan = input.nextInt();
            
            while (pilihan == 1) {
                PenjualanAkun.pilihanAkun();
                System.out.print("Transaksi lagi? Ya=1, Tidak=2 : ");
                pilihan = input.nextInt();
            }
            
            System.out.println("Terima kasih telah menggunakan layanan kami!");
        }
    }
}