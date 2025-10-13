import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempuh;
        int liter;
        int biaya;

        System.out.print("Masukkan jarak: ");
        tempuh = sc.nextInt();
        liter = tempuh / 2;
        biaya = liter * 10000;

        System.out.println(String.format("Biaya yang dibutuhkan untuk jarak %skm sebesar Rp.%s", tempuh, biaya));
        sc.close();
    }
}
