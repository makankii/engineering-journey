import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a beasiswa: ");
        System.out.println("1. Beasiswa Prestasi Akademik");
        System.out.println("2. Beasiswa Bantuan Ekonomi");
        System.out.println("3. Beasiswa Unggulan");
        System.out.print("Masukkan pilihan beasiswa anda : ");
        int beasiswa = scanner.nextInt();
        System.out.print("Masukkan IPK anda : ");
        double ipk = scanner.nextDouble();
        System.out.print("Masukkan penghasilan orangtua anda : ");
        double penghasilan = scanner.nextDouble();   
        System.out.println("List tingkat prestasi");
        System.out.println("1. Nasional");
        System.out.println("2. Universitas");
        System.out.println("3. Nihil");
        System.out.print("Masukkan tingkat prestasimu : ");    
        int prestasi = scanner.nextInt();

    if(ipk <= 4 && ipk >= 0){
        switch (beasiswa) {
            case 1:
                if (ipk >= 3.5) {
                    if (prestasi == 1 || prestasi == 2) {
                        System.out.println("You selected Beasiswa Prestasi Akademik.");
                    } else {
                        System.out.println("You are not eligible for Beasiswa Prestasi Akademik.");
                    }
                } else{
                    System.out.println("You are not eligible for Beasiswa Prestasi Akademik.");
                }
                break;
            case 2:
                if (ipk >= 3) {
                    if(penghasilan >= 0){
                    if (penghasilan <= 3000000) {
                        System.out.println("You selected Beasiswa Prestasi Akademik.");
                    } else {
                        System.out.println("You are not eligible for Beasiswa Prestasi Akademik.");
                    }
                    } else{
                        System.out.println("Angka tidak terdefinisi");
                    }
                } else{
                    System.out.println("You are not eligible for Beasiswa Prestasi Akademik.");
                }
                break;
            case 3:
                if (ipk >= 3.75) {
                    if (prestasi == 1 || prestasi == 2) {
                        if (penghasilan >= 0){
                        if(penghasilan <= 5000000) {
                            System.out.println("You selected Beasiswa Prestasi Akademik.");
                        } else {
                            System.out.println("You are not eligible for Beasiswa Prestasi Akademik.");
                        }
                        } else{
                            System.out.println("Angka tidak terdefinisi");
                        }
                    } else {
                        System.out.println("You are not eligible for Beasiswa Prestasi Akademik.");
                    }
                } else{
                    System.out.println("You are not eligible for Beasiswa Prestasi Akademik.");
                }
                break;
            default:
                System.out.println("Invalid beasiswa selection.");
        }
    }
    else{
        System.out.println("IPK harus antara 0 dan 4");
    }
}
}