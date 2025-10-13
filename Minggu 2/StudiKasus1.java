public class StudiKasus1 {
    public static void main(String[] args) {
        int gajiPokok = 3000000;
        int tunjanganAnak = 150000;
        int jumlahAnak = 3;

        // Hitung total
        int totalTunjangan = jumlahAnak * tunjanganAnak;
        double potonganPensiun = 0.05 * gajiPokok;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Gaji Bersih Bu Jesi: Rp " + gajiBersih);
    }
}
