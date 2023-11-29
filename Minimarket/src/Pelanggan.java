import java.util.Scanner;

public class Pelanggan extends DataPelanggan {
    

    public void inputPelanggan(){
        Scanner strg = new Scanner(System.in);
        Scanner intg = new Scanner(System.in);

        System.out.println("Masukkan Nomor Faktur : ");
        noFaktur = strg.next();
        System.out.println("Masukkan Nama Anda : ");
        nama = strg.next();
        System.out.println("Masukkan Nama Barang : ");
        namaBarang = strg.next();
        System.out.println("Masukkan Harga Barang : ");
        hargaBarang = intg.nextInt();
        System.out.println("Masukkan Jumlah Barang : ");
        jumlahBarang = intg.nextInt();
    }
        
    public void outp(){
        Integer totalBayar = hargaBarang*jumlahBarang;
        this.totalBayar = totalBayar;

        System.out.println("No Faktur : " + noFaktur);
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga : " + hargaBarang);
        System.out.println("Jumlah : " + jumlahBarang);
        System.out.println("Total : " + this.totalBayar);


    }
    
}
