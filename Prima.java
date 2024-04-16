import java.util.Scanner;
public class Prima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        boolean isPrime = true;

        if (angka <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }

        input.close();
    }
}

