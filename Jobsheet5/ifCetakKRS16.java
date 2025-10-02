import java.util.Scanner;
public class ifCetakKRS16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Cetak KRS siakad --");
        System.out.print("Apakah UKT sudah Lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT diverifikasi");
            System.out.println("Silahkan Cetak KRS dan Minta tanda tangan DPA");
        }

    }
}
