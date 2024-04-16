import java.util.Scanner;
public class Absen {
    public static void main(String[]args){
Scanner userinput = new Scanner(System.in);
System.out.println("Absen kelas 9C akan dimulai, diharapkan untuk semua siswa masuk ke kelas!!");
System.out.println("Masukkan nama siswa/siswi :");
String nama = userinput.next();

switch(nama){
    case "udin":
    case "ahmad":
    case "indah":
    case "mamat":
    case "ridho":
    case "ridwan":
    case "rudi":
    case "yasmin":
    case "redla":
    System.out.println("Saya " + nama + " hadir pak");
    
    default:
    System.out.println("Nama tersebut tidak terdaftar dalam daftar absen 9C");
}
userinput.close();
    }
}
