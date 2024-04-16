import java.util.Scanner;
public class suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);

        input.close();
    }
}

