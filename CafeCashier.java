import java.util.Scanner;

public class CafeCashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String input;

        while (true) {
            System.out.println("Masukkan item yang dibeli (kopi/teh/roti) atau 'batal' untuk mengakhiri transaksi:");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            switch (input) {
                case "kopi":
                    total += 12000;
                    break;
                case "teh":
                    total += 7000;
                    break;
                case "roti":
                    total += 20000;
                    break;
                default:
                    System.out.println("Item tidak dikenal. Silakan masukkan item yang valid.");
                    continue;
            }

            System.out.println("Total sementara: Rp " + total);
        }

        if (total > 0) {
            System.out.println("Total akhir: Rp " + total);
        }

        scanner.close();
    }
}

