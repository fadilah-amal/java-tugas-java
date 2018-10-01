import java.util.Scanner;
public class double1 {
	public static void main(String[] args){
		//DEKLARASI VAARIABEL
		double panjang, lebar, tinggi,luas;
		//INISIALISASI VALUENYA
		panjang = 9.988;
		lebar = 6.765;
		tinggi = 5.453;	
		//Operasi Bilangan
		luas = panjang*lebar*tinggi;
		//Menampilkan Hasil Operasi Bilangan
		System.out.println("Nilai Panjang = " + panjang);
		System.out.println("Nilai Lebar = " + lebar);
		System.out.println("Nilai Tinggi = " + tinggi);
		System.out.println("Luas Balok = " + luas);
		//Input Nilai Bilangan Dari Keyboard
		System.out.println("Silahkan Masukkan Nilai dari Panjang, Lebar, dan Tinggi Balok !");
		System.out.print("Panjang Balok = ");
		double p  = new Scanner(System.in).nextDouble();
		System.out.print("Lebar Balok = ");
		double l = new Scanner(System.in).nextDouble();
		System.out.println("Tinggi Balok = ");
		double t = new Scanner(System.in).nextDouble();
		System.out.println("Nilai yang Anda Masukkan Adalah :");
		System.out.println("Panjang = " + p);
		System.out.println("Lebar = " + l);
		System.out.println("Tinggi = " + t);

	}

}
