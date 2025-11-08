import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah cabang Kafe: ");
        int jumlahCabang = input.nextInt();
        
        int totalPelangganSeluruh = 0;
        int totalItemSeluruh = 0;
        
        System.out.println("\n==== Input Penjualan Per Cabang ====");
      
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = input.nextInt();
            
            int totalItemCabang = 0;
            
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int itemPelanggan = input.nextInt();
                totalItemCabang += itemPelanggan;
            }
            
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);
            
            totalPelangganSeluruh += jumlahPelanggan;
            totalItemSeluruh += totalItemCabang;
        }
        
        System.out.println("\nTotal Seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganSeluruh + " orang");
        System.out.println("Item terjual: " + totalItemSeluruh + " item");
        input.close();
    }
}