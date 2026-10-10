import java.util.Scanner;
public class Main2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI WORLD OF GEOMETRY");
        System.out.println("===================================");
        System.out.println("Daftar Bangun Ruang: ");
        System.out.println("1. Tabung");
        System.out.println("2. Bola");
        System.out.println("3. Kubus");
        System.out.print("Pilih jenis bangun ruang yang ingin Anda hitung Volumenya : ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("You selected Tabung.");
                break;
            case 2:
                System.out.println("You selected Bola.");
                break;
            case 3:
                System.out.println("You selected Kubus.");
                break;
            default:
                System.out.println("Invalid shape selection.");
        }
    }
}