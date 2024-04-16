public class tabelperkalian {
        public static void main(String[] args) {
            int n = 10; // Jumlah baris dan kolom dalam tabel perkalian
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        } 
}
