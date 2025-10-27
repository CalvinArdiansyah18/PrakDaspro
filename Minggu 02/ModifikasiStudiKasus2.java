import java.util.Scanner;

public class ModifikasiStudiKasus2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan lebar tanah (m): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan panjang tanah (m): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan diameter kolam lingkaran (m): ");
        double diameter = input.nextDouble();

        System.out.print("Masukkan sisi kolam persegi (m): ");
        double sisi = input.nextDouble();

        double luasTanah = lebar * panjang;

        double jariJari = diameter / 2;
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double totalLingkaran = 2 * luasLingkaran;

        double luasPersegi = sisi * sisi;

        double totalKolam = totalLingkaran + luasPersegi;
        double luasRumput = luasTanah - totalKolam;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Luas tanah      : " + luasTanah);
        System.out.println("Luas kolam      : " + totalKolam);
        System.out.println("Luas rumput     : " + luasRumput);
        input.close();
    }
}
