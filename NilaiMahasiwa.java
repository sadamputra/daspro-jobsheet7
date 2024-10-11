import java.util.Scanner;

public class NilaiMahasiwa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMahasiswa;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();
        
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            int nilai;
            do {
                System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
                nilai = input.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid. Silakan masukkan nilai antara 0 dan 100.");
                }
            } while (nilai < 0 || nilai > 100);
            
            char kategoriNilai = hitungKategoriNilai(nilai);
            System.out.println("Nilai huruf mahasiswa ke-" + i + ": " + kategoriNilai);
        }
    }
    
    public static char hitungKategoriNilai(int nilai) {
        if (nilai > 80 && nilai <= 100) {
            return 'A';
        } else if (nilai > 73 && nilai <= 80) {
            return 'B';
        } else if (nilai > 65 && nilai <= 73) {
            return 'B';
        } else if (nilai > 60 && nilai <= 65) {
            return 'C';
        } else if (nilai > 50 && nilai <= 60) {
            return 'C';
        } else if (nilai > 39 && nilai <= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }
}

