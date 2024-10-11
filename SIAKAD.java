import java.util.Scanner;

public class SIAKAD {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int highestScore = -1;
        int lowestScore =101;

        int score;

        for(int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i +":");
            score = input.nextInt();
            if (score > highestScore) {
                highestScore = score;
            }

            if (score < lowestScore){
                lowestScore = score;
            }
        }

        System.out.println("Nilai tertinggi adalah:"+highestScore);
        System.out.println("Nilai terendah adalah:"+ lowestScore);
    }
}