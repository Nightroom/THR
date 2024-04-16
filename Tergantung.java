public class Tergantung {
    public static void main(String[] args) {
        int s = 0;
        boolean jika = true;
        do{
            s++;
            System.out.println( "nilai : " +s);
            if (s == 10) {
                jika = false;
            }

        }while(jika);
        System.out.println("Udah gitu aja");
    }
}
