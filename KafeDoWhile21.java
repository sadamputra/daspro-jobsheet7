import java.util.Scanner;

public class KafeDoWhile21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kopi, teh, roti;
        String namaPelanggan;
        final int hargaKopi = 12000;
        final int hargaTeh = 7000;
        final int hargaRoti = 20000;
        
        do {
            System.out.println("Masukkan nama pelanggan (atau ketik 'batal' untuk mengakhiri): ");
            namaPelanggan = sc.nextLine();
            
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            
            System.out.println("Masukkan jumlah kopi yang dibeli: ");
            kopi = sc.nextInt();
            
            System.out.println("Masukkan jumlah teh yang dibeli: ");
            teh = sc.nextInt();
            
            System.out.println("Masukkan jumlah roti yang dibeli: ");
            roti = sc.nextInt();
            
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga pembelian: Rp " + totalHarga);
            
            sc.nextLine(); 
            
        } while (true);
        
        sc.close();
    }
}
