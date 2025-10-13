import java.util.Scanner;

public class ModifikasiStudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = sc.nextInt();

        System.out.print("Masukkan tunjangan per anak: ");
        int tunjanganAnakPerAnak = sc.nextInt();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = sc.nextInt();

        int totalTunjangan = jumlahAnak * tunjanganAnakPerAnak;
        double potonganPensiun = 0.05 * gajiPokok;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("\n--- Rincian Gaji ---");
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan Anak: Rp " + totalTunjangan);
        System.out.println("Potongan Pensiun: Rp " + potonganPensiun);
        System.out.println("Gaji Bersih yang diterima: Rp " + gajiBersih);

        sc.close();
    }
}