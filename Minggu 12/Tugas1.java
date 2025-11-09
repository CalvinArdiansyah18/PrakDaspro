import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai mahasiswa: ");
        int n = input.nextInt();

        int[] nilaiMhs = new int[n];
        int total = 0;
        int tertinggi, terendah;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }

        tertinggi = nilaiMhs[0];
        terendah = nilaiMhs[0];

        for (int i = 1; i < n; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        double rataRata = (double) total / n;

        System.out.println("Daftar nilai mahasiswa");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai ke " + (i + 1) + ": " + nilaiMhs[i]);
        }

        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        input.close();
    }
}
