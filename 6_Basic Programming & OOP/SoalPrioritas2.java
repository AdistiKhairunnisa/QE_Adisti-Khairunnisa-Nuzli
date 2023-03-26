// Soal Prioritas
// NO. 1
    class Main {
        public static void drawXYZ(int height) {
            for (int i = 1; i <= height; i++) {
                if (i % 3 == 0) {
                    System.out.print("X");
                } else if (i % 2 == 1) {
                    System.out.print("Y");
                } else {
                    System.out.print("Z");
                }
            }
        }

        public static void main(String[] args) {
            int height = 5;
            int[][] grid = new int[height][height];

            // mengisi array dengan hasil tampilan dari fungsi drawXYZ
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < height; j++) {
                    if ((i + j) % 3 == 0) {
                        grid[i][j] = 'X';
                    } else if ((i + j) % 2 == 1) {
                        grid[i][j] = 'Y';
                    } else {
                        grid[i][j] = 'Z';
                    }
                }
            }

            // mencetak setiap kolom dari kiri ke kanan
            for (int j = 0; j < height; j++) {
                for (int i = 0; i < height; i++) {
                    System.out.print((char) grid[i][j] + " ");
                }
                System.out.println(); // tambahkan baris kosong untuk memisahkan setiap kolom
            }
        }
    }




public class SoalPrioritas2 {
    public static void main(String[] args) {
        printAsterisk( 5 );
    }

    // Soal Prioritas No.2
    public static void printAsterisk(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print( "*" );
            }
            System.out.println();
        }
    }
}