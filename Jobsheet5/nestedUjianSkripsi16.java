import java.util.Scanner;
public class nestedUjianSkripsi16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebaskompen = sc.nextLine().trim();

        System.out.print("Masukan jumlah log pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukan jumlah log pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebaskompen.equalsIgnoreCase("Ya")){
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
                pesan = "semua syarat terpenuhi. mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
                pesan = "gagal Log bimbinganP1 kurang dari 8 kali dan p2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8 ){
                pesan = "gagal log bimbinganP1 belum 8 kali";
            } else {
                pesan = "gagal log bimbinganP2 belum 4 kali";
            }
        } else {
            pesan = "maaf mahasiswa masih memiliki kompen";
        }
    System.out.println(pesan);
        
}
    }