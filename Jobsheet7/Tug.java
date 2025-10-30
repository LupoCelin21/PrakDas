import java.util.Scanner;
public class Tug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int jenis, durasi, total = 0;
        do {
            System.out.println("\nMasukkan jenis kendaraan:");
            System.out.print("(1 Mobil, 2 Motor, 0 Keluar): ");
            
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                
                durasi = sc.nextInt();
                
                int biayaParkir = 0;
                
                if (durasi > 5) {
                    biayaParkir = 12500;
                } else  {
                    if (jenis == 1) {
                        biayaParkir = durasi * 3000;
                    } 
                    else if (jenis == 2) {
                        biayaParkir = durasi * 2000;
                    }
                }
                
                total = total+biayaParkir;  
                System.out.println("Biaya parkir kendaraan ini: Rp " + biayaParkir);
            } 
           
         

        } while (jenis != 0);
        System.out.println("total parkir kamu : "+total);

    }
}
