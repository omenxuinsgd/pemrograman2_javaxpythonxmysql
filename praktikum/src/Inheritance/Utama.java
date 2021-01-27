package Inheritance;
import java.io.*;

public class Utama {
    public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //Instance Of Class
    Game gameA = new Game("", "", "");
    Game gameB = new Game("", "", "", "", "");
    
    // menu
    while(true){
    System.out.println("********************");
    System.out.println("Menu Game");
    System.out.println("********************");
    System.out.println("1. Input Game A");
    System.out.println("2. Input Game B");
    System.out.println("3. Lihat Data game");
    System.out.println("4. Keluar");
    System.out.println("********************");

    // input
    System.out.print("Masukkan Pilihan = ");
    int pilih = Integer.parseInt(br.readLine());
    
    System.out.println();
    
    // proses + output
    switch(pilih){
        case 1:
            System.out.println("==============");
            System.out.println("Masukan Kode : ");
            String kodeA = br.readLine();
            System.out.println("Masukan Nama : ");
            String namaA = br.readLine();
            System.out.println("Masukan Lisensi");
            String lisensiA = br.readLine();

            gameA.setKode(kodeA);
            gameA.setNama(namaA);
            gameA.setLisensi(lisensiA);
            break;
            
        case 2:
            System.out.println("==============");
            System.out.println("Masukan Kode : ");
            String kode = br.readLine();
            System.out.println("Masukan Nama : ");
            String nama = br.readLine();
            System.out.println("Masukan Lisensi : ");
            String lisensi = br.readLine();
            System.out.println("Masukan Tipe : ");
            String tipe = br.readLine();
            System.out.println("Masukan Jenis : ");
            String jenis = br.readLine();

            gameB.setKode(kode);
            gameB.setNama(nama);
            gameB.setLisensi(lisensi);
            gameB.setTipe(tipe);
            gameB.setJenis(jenis);
            break;
            
        case 3:
            System.out.println("==============");
            System.out.println("MENU GAME");
            System.out.println("GAME A");
            System.out.println("Kode : " + gameA.getKode());
            System.out.println("Nama : " + gameA.getNama());
            System.out.println("Lisensi:" + gameA.getLisensi());
            System.out.println();
            System.out.println("MENU GAME");
            System.out.println("GAME B");
            System.out.println("Kode : " + gameB.getKode());
            System.out.println("Nama : " + gameB.getNama());
            System.out.println("Lisensi:" + gameB.getLisensi());
            System.out.println("Tipe:" + gameB.getTipe());
            System.out.println("Jenis:" + gameB.getJenis());
            System.out.println("===============");
            break;
        
        case 4:
            System.exit(0);
            break;
            
        default:
            System.exit(0);
            }
        }
    }
}
