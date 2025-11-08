import java.util.Scanner;

public class NilaiKelompok09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, j, nilai;
        float totalNilai, rataNilai;

        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + ": ");
                nilai = input.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            i++;
            System.out.println("Kelompok " + (i - 1) + ": nilai rata-rata = " + rataNilai);

        }
        input.close();
    }
}
