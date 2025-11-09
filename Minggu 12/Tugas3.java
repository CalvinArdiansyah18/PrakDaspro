import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama menu yang ingin dipesan: ");
        String cari = input.nextLine();

        boolean ditemukan = false;
        int posisi = -1;

        for(int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(cari + "tersedia dimenu dengan posisi: " + (posisi + 1));
        } else {
            System.out.println(cari + " tidak tersedia pada menu");
        }
        input.close();
    }
}
