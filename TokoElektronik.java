package program.bebas;

import java.util.Scanner;

public class TokoElektronik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalHarga = 0;

        System.out.println("Selamat datang di Toko Elektronik XYZ!");
        System.out.println("Berikut adalah daftar produk beserta harganya:");
        System.out.println("1. TV           : Rp 5.000.000");
        System.out.println("2. Laptop       : Rp 10.000.000");
        System.out.println("3. Smartphone   : Rp 3.000.000");

        // Memulai perulangan untuk pembelian produk
        char beliLagi = 'y';
        while (beliLagi == 'y' || beliLagi == 'Y') {
            System.out.print("Pilih produk yang ingin dibeli (1-3): ");
            int pilihan = input.nextInt();

            // Percabangan untuk memproses pilihan pembelian
            if (pilihan == 1) {
                totalHarga += 5000000;
            } else if (pilihan == 2) {
                totalHarga += 10000000;
            } else if (pilihan == 3) {
                totalHarga += 3000000;
            } else {
                System.out.println("Pilihan tidak valid!");
                continue; // Mengulangi perulangan jika pilihan tidak valid
            }

            System.out.print("Ingin membeli lagi? (y/n): ");
            beliLagi = input.next().charAt(0);
        }

        // Memberikan diskon berdasarkan total harga
        double diskon = 0;
        if (totalHarga >= 20000000) {
            diskon = 0.1 * totalHarga; // Diskon 10% jika total harga lebih dari atau sama dengan 20.000.000
        } else if (totalHarga >= 10000000) {
            diskon = 0.05 * totalHarga; // Diskon 5% jika total harga lebih dari atau sama dengan 10.000.000
        }

        // Menghitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - diskon;

        System.out.println("Total harga pembelian sebelum diskon: Rp " + totalHarga);
        System.out.println("Diskon yang diberikan: Rp " + diskon);
        System.out.println("Total harga pembelian setelah diskon: Rp " + totalHargaSetelahDiskon);
        System.out.println("Terima kasih telah berbelanja di Toko Elektronik XYZ!");
    }
}
