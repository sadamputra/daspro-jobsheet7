import java.util.Scanner;

public class SiakadFor21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double nilai;
        double tertinggi = 0;
        double terendah = 100;

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi:" + tertinggi);
        System.out.println("Nilai terendah:" + terendah);
    
    }
    
}
