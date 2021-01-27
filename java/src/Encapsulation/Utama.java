package Encapsulation;
import java.io.*;

public class Utama {
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // instance of class
        Handphone hp = new Handphone();
        
        // input
        System.out.print("Masukkan Merk Handphone : ");
        String merk_hp = br.readLine();
        System.out.print("Masukkan tipe Handphone : ");
        String tipe_hp = br.readLine();
        System.out.print("Masukkan warna Handphone : ");
        String warna_hp = br.readLine();
        System.out.print("Masukkan harga Handphone : ");
        double harga_hp = Double.parseDouble(br.readLine());
        hp.setMerk(merk_hp);
        hp.setTipe(tipe_hp);
        hp.setWarna(warna_hp);
        hp.setHarga(harga_hp);
        
        // output
        System.out.println("***************************************");
        System.out.println("DAFTAR HARGA PONSEL DAN SPESIFIKASINYA");
        System.out.println("***************************************");
        System.out.println("Merk Hp = "+hp.getMerk());
        System.out.println("Tipe Hp = "+hp.getTipe());
        System.out.println("warna Hp = "+hp.getWarna());
        System.out.println("harga Hp sebelum diskon = "+hp.getHarga());
        hp.keterangan();
        
        
    }
}
