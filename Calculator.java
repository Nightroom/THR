import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner Userinput = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        int angka1 = Userinput.nextInt();
        System.out.println("Pilih lambang penjumlahan +/-/x/:");
        char Lambang = Userinput.next().charAt(0);
        System.out.println("Masukkan angka kedua: ");
        int angka2 = Userinput.nextInt();

        int hasil = 0;
        switch (Lambang) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case 'x':
            case '*': // Bisa menggunakan '*' sebagai simbol perkalian
                hasil = angka1 * angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operasi tidak valid");
                break;
        }

        System.out.println("Hasil: " + hasil);

        Userinput.close();
    }
}
