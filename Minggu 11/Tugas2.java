import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = input.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            input.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}