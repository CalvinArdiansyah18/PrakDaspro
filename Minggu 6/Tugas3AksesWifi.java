import java.util.Scanner;

public class Tugas3AksesWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSKS = 0;

        System.out.print("Masukkan jenis pengguna (Mahasiswa/Dosen): ");
        String jenisPengguna = sc.nextLine().trim();

        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses wifi diberikan (Dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            jumlahSKS = sc.nextInt();
            if (jumlahSKS >= 12) {
                System.out.println("Akses wifi diberikan (Mahasiswa aktif)");
            } else {
                System.out.println("Akses wifi ditolak SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }  

        sc.close();
    }
}