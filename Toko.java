import java.util.Scanner;
public class Toko {
    public static void main(String[]args){
        Scanner Userinput = new Scanner(System.in);
        int x,y,z;
        System.out.println("Pilih barang belanjaan yang ingin di beli : Roti/Garam/Indomie");
        String Belanjaan = Userinput.next();
        System.out.println("Jumlah :");
        int Jumlah = Userinput.nextInt();
        x = 5000;
        y = 2000;
        z = 3000;
        int hasil = 0;
        switch (Belanjaan) {
            case "Roti":
                hasil = Jumlah * z;
                System.out.println("Jumlah Roti yang di beli :" + Jumlah);
                System.out.println("Total harga :" + hasil);
                break;
            case "Garam":
                hasil = Jumlah * y;
                System.out.println("Jumlah Garam yang di beli :" + Jumlah);
                System.out.println("Total harga :" + hasil);
                break;
            case "Indomie": 
                hasil = Jumlah * x;
                System.out.println("Jumlah Indomie yang di beli :" + Jumlah);
                System.out.println("Total harga :" + hasil);
                break;
            default:
                System.out.println("Mohon maaf, produk belum tersedia");
                break;
        }
        Userinput.close();
    }
}
