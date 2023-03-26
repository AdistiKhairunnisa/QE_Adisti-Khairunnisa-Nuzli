public class HargaJualSample3 {
    public static void main(String[] args) {
        int hargaBeli = 12000;
        int hargaJual = 12000;

        // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian
        if (hargaBeli < hargaJual){
            System.out.println("Untung!!:D Dengan keuntungan "+ (hargaJual-hargaBeli));
        } else {
            System.out.println("Sama ajaa dong :(( ");
        }
    }
}
