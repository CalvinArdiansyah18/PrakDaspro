import java.util.Scanner;

public class KelulusanMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("=== SISTEM PENENTUAN KELULUSAN MAHASISWA ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String NIM = input.nextLine();

        // Nilai mata kuliah Algoritma dan Pemrograman
        System.out.println("\n--- Mata Kuliah : Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS: ");
        double utsAlgo = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasAlgo = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasAlgo = input.nextDouble();

        // Nilai mata kuliah Struktur Data
        System.out.println("\n--- Mata Kuliah : Struktur Data ---");
        System.out.print("Nilai UTS: ");
        double utsSD = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasSD = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasSD = input.nextDouble();

        // Nilai mata kuliah Struktur Data
        System.out.println("\n--- Mata Kuliah : Basis Data ---");
        System.out.print("Nilai UTS: ");
        double utsBD = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasBD = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasBD = input.nextDouble();

        // Hitung nilai akhir tiap mata kuliah
        double akhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);
        double akhirSD = (utsSD * 0.3) + (uasSD * 0.4) + (tugasSD * 0.3);
        double akhirBD = (utsBD * 0.3) + (uasBD * 0.4) + (tugasBD * 0.3);

        // Tentukan status kelulusan per mata kuliah
        String statusAlgo = (akhirAlgo >= 60) ? "LULUS" : "TIDAK LULUS";
        String statusSD = (akhirSD >= 60) ? "LULUS" : "TIDAK LULUS";
        String statusBD = (akhirBD >= 60) ? "LULUS" : "TIDAK LULUS";

        // Konversi nilai ke huruf (grade)
        String gradeAlgo, gradeSD, gradeBD;

        // Grade Algoritma dan Pemrograman
        if (akhirAlgo >= 80 && akhirAlgo <= 100)
            gradeAlgo = "A";
        else if (akhirAlgo >= 73 && akhirAlgo < 80)
            gradeAlgo = "B+";
        else if (akhirAlgo >= 65 && akhirAlgo < 73)
            gradeAlgo = "B";
        else if (akhirAlgo >= 60 && akhirAlgo < 65)
            gradeAlgo = "C+";
        else if (akhirAlgo >= 50 && akhirAlgo < 60)
            gradeAlgo = "C";
        else if (akhirAlgo >= 39 && akhirAlgo < 50)
            gradeAlgo = "D";
        else
            gradeAlgo = "E";

        // Grade Struktur Data
        if (akhirSD >= 80 && akhirSD <= 100)
            gradeSD = "A";
        else if (akhirSD >= 73 && akhirSD < 80)
            gradeSD = "B+";
        else if (akhirSD >= 65 && akhirSD < 73)
            gradeSD = "B";
        else if (akhirSD >= 60 && akhirSD < 65)
            gradeSD = "C+";
        else if (akhirSD >= 50 && akhirSD < 60)
            gradeSD = "C";
        else if (akhirSD >= 39 && akhirSD < 50)
            gradeSD = "D";
        else
            gradeSD = "E";

        if (akhirBD >= 80 && akhirBD <= 100)
            gradeBD = "A";
        else if (akhirBD >= 73 && akhirBD < 80)
            gradeBD = "B+";
        else if (akhirBD >= 65 && akhirBD < 73)
            gradeBD = "B";
        else if (akhirBD >= 60 && akhirBD < 65)
            gradeBD = "C+";
        else if (akhirBD >= 50 && akhirBD < 60)
            gradeBD = "C";
        else if (akhirBD >= 39 && akhirBD < 50)
            gradeBD = "D";
        else
            gradeBD = "E";

        // Rata-rata nilai akhir
        double rataRata = (akhirAlgo + akhirSD + akhirBD) / 2;

        // Status kelulusan semester (nested if)
        String statusSemester;
        if (statusAlgo.equals("LULUS") && statusSD.equals("LULUS") && statusBD.equals("LULUS")){
            if (rataRata >= 70) {
                statusSemester = "LULUS SEMESTER";
            } else if (rataRata >= 60 && rataRata < 70) {
                statusSemester = "LULUS BERSYARAT SEMESTER";
            } else{
                statusSemester = "TIDAK LULUS SEMESTER";
            }
        }else {
            statusSemester = "TIDAK LULUS SEMESTER";
        }

        // Output hasil
        System.out.println("\n================ HASIL PENILAIAN AKADEMIK ================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + NIM);
        System.out.println();
        System.out.println("Mata Kuliah           UTS   UAS   Tugas   Nilai Akhir   Nilai Huruf   Status");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-22s %3.0f   %3.0f    %3.0f       %6.2f         %-3s        %-10s\n",
                "Algoritma Pemrograman", utsAlgo, uasAlgo, tugasAlgo, akhirAlgo, gradeAlgo, statusAlgo);
        System.out.printf("%-22s %3.0f   %3.0f    %3.0f       %6.2f         %-3s        %-10s\n",
                "Struktur Data", utsSD, uasSD, tugasSD, akhirSD, gradeSD, statusSD);
        System.out.printf("%-22s %3.0f   %3.0f    %3.0f       %6.2f         %-3s        %-10s\n",
                "Struktur Data", utsBD, uasBD, tugasBD, akhirBD, gradeBD, statusBD);
        System.out.println();
        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", rataRata);
        System.out.printf("Status Semester       : %s (Rata-rata < 60)\n", statusSemester);

        input.close();
    }
}