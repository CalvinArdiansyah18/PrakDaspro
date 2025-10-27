import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga = 50000, totalTiket = 0, jumlahTiket;
        double totalPenjualan = 0, totalHarga;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            totalHarga = jumlahTiket * harga;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85;
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90;
            }

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga untuk pelanggan ini: Rp " + totalHarga);
        } while (true);

        System.out.println("\nTotal tiket terjual: " + totalTiket);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);
        input.close();
    }
}
