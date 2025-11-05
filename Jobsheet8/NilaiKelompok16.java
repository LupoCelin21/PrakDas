import java.util.Scanner;
public class NilaiKelompok16 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int totalNilai ;
    int nilai;
    int ratanilai;

    int keltertinggi = 0;
    int ratatertinggi = 0;

    int i = 1;
        while (i <= 6){
            System.out.println("kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j<=5; j++){
                System.out.print(" Nilai dari kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            ratanilai = totalNilai / 5;
            if (ratanilai > ratatertinggi){
                ratatertinggi = ratanilai;
                keltertinggi = i;
            }
            System.out.print("kelompok " + i);
            System.out.println(": nilai rata-rata = " + ratanilai);
            i++;
        }
         System.out.println("Hasil Kelompok tertinggi");
        System.out.println("kelompok tertinggi " + keltertinggi );
        System.out.println("Nilai rata-rata kelompok : " + ratatertinggi);

}
}
