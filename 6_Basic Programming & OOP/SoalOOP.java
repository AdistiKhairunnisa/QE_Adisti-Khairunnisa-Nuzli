public class SoalOOP {
    //nomor 1
    public static void main(String[] args) {
        var product1 = new Product("Loneliness", "Self-Improvement Book", 99000, 50);
        product1.getInfo(); // akan menampilkan informasi mengenai product1

        product1.setPrice( (int) 99000 );
        product1.setStock(75);
        product1.getInfo(); // akan menampilkan informasi terbaru mengenai product1 setelah diubah
    }
    public static class Product {
        private String name;
        private String description;
        private int price;
        private int stock;

        public Product(String name, String description, int price, int stock) {
            this.name = name;
            this.description = description;
            this.price = (int) price;
            this.stock = stock;
        }

        // getters
        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public int getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        // setters
        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }
        // method getInfo
        public void getInfo() {
            System.out.println("========");
            System.out.println("PRODUCT INFO^^");
            System.out.println("name: " + name);
            System.out.println("description: " + description);
            System.out.println("price: Rp" + price);
            System.out.println("stock: " + stock);
            System.out.println("========");
        }
    }
    //nomor 2


    public static class Calculator {
        // Penjumlahan
        public Integer add(Integer x, Integer y) {
            Integer hasil = x+y;
            return hasil;
        }

        // Pengurangan
        public  Integer substract(Integer x, Integer y) {
            Integer hasil = x-y;
            return hasil;
        }

        // Perkalian
        public  Integer multiply(Integer x, Integer y) {
            Integer hasil = x*y;
            return hasil;
        }

        //Pembagian
        public  Integer divide(Integer x, Integer y) {
            Integer hasil = x/y;
            return hasil;
        }
    }


    public static class main {
    }
}
