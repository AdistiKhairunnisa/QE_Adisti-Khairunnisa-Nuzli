public class HargaJual {
    public static void main(String[] args) {
        int hargaBeli = 15000;
        int hargaJual = 30000;

        // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian
        if (hargaBeli < hargaJual){
            System.out.println("Untung!!:D Dengan keuntungan "+ (hargaJual-hargaBeli));
        } else {
            System.out.println("Rugii :(( Dengan kerugian "+ (hargaJual-hargaBeli));
        }
    }
}
