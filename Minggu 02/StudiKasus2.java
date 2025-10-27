public class StudiKasus2 {
    public static void main(String[] args) {
        double lebar = 50;
        double panjang = 100;
        double diameter = 2;
        double sisi = 2;

        double luasTanah = lebar * panjang;

        double jariJari = diameter / 2;
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double totalLingkaran = 2 * luasLingkaran;

        double luasPersegi = sisi * sisi;

        double totalKolam = totalLingkaran + luasPersegi;
        double luasRumput = luasTanah - totalKolam;

        System.out.println("Luas tanah      : " + luasTanah);
        System.out.println("Luas kolam      : " + totalKolam);
        System.out.println("Luas rumput     : " + luasRumput);
    }
}
