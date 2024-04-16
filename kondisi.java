public class kondisi {
    public static void main(String[] args) {
        int p = 0;
        boolean kejadian = true;
        while (kejadian) {
            System.out.println("angka :"+p);
            
            if (p == 10) {
                kejadian = false;
            }
            p++;
        }
    }
}
