import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("== Program Menghitung Ongkos Kirim Paket ==");
        System.out.print("Berat paket (Kg) : ");
        double berat = input.nextDouble();
        System.out.print("Jarak rumah (Km) : ");
        double jarak = input.nextDouble();

        double biaya = 0;
        double ongkos = 0;
        
        if (jarak < 0) {
            System.out.println("Jarak harus lebih besar dari 0");
        } else {
            if (jarak >= 0 && jarak <= 10) {
                ongkos = 5000;
                System.out.println("Ongkos kirim: " + ongkos);
            } else {
                ongkos = 10000;
                System.out.println("Ongkos kirim: " + ongkos);
            }
        }

        if (berat < 0) {
            System.out.println("Berat harus lebih besar dari 0");
        } else {
            if (berat >= 0 && berat <= 7) {
                biaya = 5000;
                System.out.println("Biaya pengiriman: " + biaya);
            } else if(berat > 7 && berat <= 14) {
                biaya = 10000;
                System.out.println("Biaya pengiriman: " + biaya);
            } else{
                biaya = 15000;
                System.out.println("Biaya pengiriman: " + biaya);
            }
        }
        System.out.println("Total ongkos kirim untuk paketmu adalah: " + (biaya + ongkos));
    }
}
