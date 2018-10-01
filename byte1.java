import java.util.Scanner;
public class byte1 {

	public static void main(String[] args) {
		//Deklarasi Variabel
		byte a, b, c, d, hssil ;
		//Inisialisasi Valuenya
		a = (byte)8;
		b = (byte)10;
		c = (byte)15;
		d = (byte)12;
		//Operasi Pada Bilangan
		int hasil = (a + b) * (b - c) / (d - b);
		//Menampilkan Hasil Operasi
		System.out.println("Nilai A : " + a);
		System.out.println("Nilai B : " + b);
		System.out.println("Nilai C : " + c);
		System.out.println("Nilai D : " + d);
		System.out.println("Operasi Bilangan");
		System.out.println("1. (a + b) * (b - c) / (d - b)");
		System.out.println("Hasil Operasi Bilangan : " + hasil);
		//Input Nilai Variabel Dengan Keyboard
		System.out.println("Silahkan Mmasukkan Nilai Bilangan Byte");
		System.out.print("Nilai A : ");
		byte A = new Scanner(System.in).nextByte();
		System.out.print("Nilai B : ");
		byte B = new Scanner(System.in).nextByte();
		System.out.print("Nilai C : ");
		byte C = new Scanner(System.in).nextByte();
		System.out.print("Nilai D : ");
		byte D = new Scanner(System.in).nextByte();
		System.out.println("Nilai Bilangan Byte yang Anda Masukkan adalah : ");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("A = " + C);
		System.out.println("D = " + D);
	}

}
