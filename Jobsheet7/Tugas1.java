import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double totalharga = 0, hargaakhir;
    int tiket, totaltiket = 0;
    String namaPelanggan;

    do {
        System.out.println("Masukan nama pelenggan (Ketik 'batal' jika tidak jadi): ");
        namaPelanggan = sc.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")){
            System.out.println("transaksi batal");
            break;
        }

    System.out.print("BErapa tiket yang hendak dibeli? (Angka) :");
    tiket = sc.nextInt();
    double harga = 50000;

    if (tiket > 4 && tiket <= 10){
        harga = harga*tiket;
        hargaakhir = harga - (harga * 0.1);
        totaltiket = tiket + totaltiket;
        totalharga = hargaakhir + totalharga;
        System.out.println("Tiket yang hendak dibeli : "+ tiket);
        System.out.println("Tiket yang harus dibayar: "+ hargaakhir);
    } else if (tiket > 10){
        harga = harga*tiket;
        hargaakhir = harga - (harga * 0.15);
        totaltiket = tiket + totaltiket;
        totalharga = hargaakhir + totalharga;
        System.out.println("Tiket yang hendak dibeli : "+ tiket);
        System.out.println("Tiket yang harus dibayar: "+ hargaakhir);
    } else if (tiket < 0){
        System.out.println("Masa beli tiket 0? maaf tidak valid, ULANG");
        continue;
    } else {
        harga = harga*tiket;
        hargaakhir = harga;
        totaltiket = tiket + totaltiket;
        totalharga = hargaakhir + totalharga;
        System.out.println("Tiket yang hendak dibeli : "+ tiket);
        System.out.println("Tiket yang harus dibayar: "+ hargaakhir);
    }
    sc.nextLine();








    } while (true);
    System.out.println("Total penjualan tiket: "+totaltiket );
    System.out.println("Total pendapatan "+totalharga );
    }
}
