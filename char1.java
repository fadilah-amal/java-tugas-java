import java.util.Scanner;
public class char1 {

	public static void main(String[] args) {
		//Deklarasi Variabel
		char a, b, c, d, e, f, g;
		String nama;
		//Inisialisasi Valuenya
		a = 'F';
		b = '@';
		c = 'D';
		d = 'I';
		e = 'L';
		f = '@';
		g = 'H';
		//Operasi Menggunakan Tipe data Char
		nama = (""+a+b+c+d+e+f+g);
		//Menampilkan Nilai Bilangan Char
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println("Nama : " +nama);
		//Input Nillai Dengan Keyboard
		System.out.println("Silahkan Masukkan Karakter !");
		System.out.print("Karakter : ");
		String karakter = new Scanner(System.in).nextLine();
		System.out.println("Karakter Yyang Anda Masukkan  Adalah : " + karakter);
	}

}
