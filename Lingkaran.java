import java.util.Scanner;
public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Luas lingkaran: " + area);
        System.out.println("Keliling lingkaran: " + circumference);

        input.close();
    }
}
