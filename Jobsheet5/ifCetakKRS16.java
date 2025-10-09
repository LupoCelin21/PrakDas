import java.util.Scanner;

public class ifCetakKRS16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka; 
        
        System.out.println("-- Cetak KRS siakad --");
        System.out.print("Apakah UKT sudah Lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

       
        String pesanUtama = uktLunas ? "Pembayaran UKT diverifikasi" : "Registrasi ditolak";
        String pesanLanjutan = uktLunas ? "Silahkan Cetak KRS dan Minta tanda tangan DPA" : "Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesanUtama);
        System.out.println(pesanLanjutan);
        
    
    }
}