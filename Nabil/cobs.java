import java.util.Scanner;
public class cobs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double berat = input.nextDouble();
        double jarak = input.nextDouble();

        double paket =0;
        double biaya =0;
        if (berat < 0 ){
            System.out.println("Input tidak valid");
        } else{
            if(berat >= 0 && berat <= 7){
                paket = 5000;
                System.out.println("Biaya pengiriman: " + paket);
            } else if(berat > 7 && berat <= 14){
                paket = 10000;
                System.out.println("Biaya pengiriman: " + paket);
            } else{
                paket = 15000;
                System.out.println("Biaya pengiriman: " + paket);
            }
        }

        if(jarak < 0){
            System.out.println("Input tidak valid");
        } else{
            if (jarak >= 0 && jarak <= 10){
                biaya = 5000;
                System.out.println("Biaya pengiriman: " + biaya);
            } else{
                biaya = 10000;
                System.out.println("Biaya pengiriman: " + biaya);
            }
        }

        System.out.println("Total biaya pengiriman: " + (paket + biaya));
    }
}
