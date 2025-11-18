import java.util.Scanner;
public class ArrayRataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
    int [] nilaiMHS = new int[5];
    double total = 0;
    double rata2;
    int lulus = 0;
    
    for (int i = 0; i < nilaiMHS.length; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
    nilaiMHS[i] = sc.nextInt();
    }

    for (int i = 0; i < nilaiMHS.length; i++) {
    total += nilaiMHS[i];

    if (nilaiMHS[i] > 70 ){
        lulus++;
    }
    }

    rata2 = total / nilaiMHS.length;
    System.out.println("Rata-rata nilai = " + rata2);

    System.out.println("Jumlah mahasiswa yang lulus (nilai > 70) = " + lulus);
        
    }
}
