public class HitungLuas {
    public static void main(String[] args) {
        // segitiga
        float alas = 20;
        float tinggi = 25;

        // TODO: hitung luas segitiga
        double luasSegitiga = 0.5*(alas*tinggi);
        System.out.println("Luas segitiga: " + luasSegitiga);

        // persegi panjang
        float panjang = 40;
        float lebar = 6;

        //TODO: hitung luas persegi panjang
        double luasPersegiPanjang = panjang*lebar;
        System.out.println("luas persegi panjang: " + luasPersegiPanjang);

        // lingkaran
        double jari2 = 7;

        //TODO: hitung luas lingkaran
        double luasLingkaran = 3.14*(jari2*jari2);
        System.out.println("luas Lingkaran: " + luasLingkaran);
    }
}
