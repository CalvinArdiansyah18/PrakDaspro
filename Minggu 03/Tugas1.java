import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bunga = 0.01;

        System.out.print("Harga motor: ");
        int hargaMotor = sc.nextInt();
        System.out.print("Masukkan uang muka: ");
        int uangMuka = sc.nextInt();
        System.out.print("Dicicil selama berapa bulan: ");
        int diCicilSelama = sc.nextInt();

        int sisaCicilan = hargaMotor - uangMuka;
        double cicilanSelama = sisaCicilan * bunga * diCicilSelama;
        double bayar = sisaCicilan + cicilanSelama;
        double cicilanPerbulan = bayar / diCicilSelama;

        System.out.println(String.format("Cicilan pak Ali selama %s bulan adalah Rp.%s", diCicilSelama, cicilanPerbulan));
        sc.close();
    }
}
