import java.util.Scanner;
public class kabisat {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " adalah tahun kabisat.");
        } else {
            System.out.println(year + " bukan tahun kabisat.");
        }

        input.close();
    }
}

