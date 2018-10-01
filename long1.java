import java.util.Scanner;
public class long1 {
	public static void main(String[] args) {
	//Deklarasi Variabel
	long avanza, toyota, kijang,jumlah;
	//Inisialisasi Valuenya
	avanza = 185000000;
	toyota = 170000000;
	kijang = 165000000;
	//Operasi Pada Bilangan
	jumlah = avanza + toyota + kijang;
	//Menampilkan Hasil Operasi
	System.out.println("Harga Mobil Avanza : " + avanza);
	System.out.println("Harga Mobil Toyota : " + toyota);
	System.out.println("Harga Mobil Kijang : " + kijang);
	System.out.println("Total Harga Seluruh Mobil : " + jumlah);
	//Input Nilai Bilangan Melalui Keyboard
	System.out.println("Silahkan Masukkan Harga Mobil Anda !");
	System.out.print("Harga Mobil : ");
	long harga = new Scanner(System.in).nextLong();
	System.out.println("Harga Mobil Yang Anda Masukkan Adalah : " + harga);
	}
}
