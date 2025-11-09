import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int pesanan = input.nextInt();
        input.nextLine();

        String[] namaPesanan = new String[pesanan];
        int[] hargaPesanan = new int[pesanan];

        for (int i = 0; i < pesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = input.nextLine();
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = input.nextInt();
            input.nextLine();
        }

        int totalBiaya = 0;
        for (int i = 0; i < pesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < pesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.println("Total biaya adalah: Rp" + totalBiaya);
        input.close();
    }
}