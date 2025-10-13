import java.util.Scanner;
public class Tugas3Perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu mahasiswa? (true/false): ");
        boolean kartuMhs = sc.nextBoolean();
        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();

        if(kartuMhs || registrasiOnline){
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Tidak boleh masuk");
        }
        sc.close();
    }
}
