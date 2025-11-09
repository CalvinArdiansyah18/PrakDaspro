import java.util.Scanner;

public class SearchNilai09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrNilai = new int[10];
        int n;

        System.out.print("Masukkan jumlah nilai yang akan diinput (maksimal 10): ");
        n = input.nextInt();

        if (n > 10) {
            System.out.println("Maksimal 10!");
            input.close();
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilaiCari = input.nextInt();

        int hasil = -1;
        for (int i = 0; i < n; i++) {
            if (arrNilai[i] == nilaiCari) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + nilaiCari + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

        input.close();
    }
}
