import java.util.Scanner;
public class arrayChar {
public static void main(String[] args){
	//Deklarasi Variabel
	char []nama;
	//Inisialisasi Valuenya
	nama = new char[4];
	nama[0]='D';
	nama[1]='I';
	nama[2]='L';
	nama[3]='@';
	//Operasi Nilai Variabel
	System.out.println("Nilai Variabel Dengan Tipe Char");
	for (int i=0;i<nama.length;i++){
	//Menampilkan Hasil Operasi
	System.out.println("Index " + i+" : " +nama[i]);
	}
	System.out.println("Silahkan Input Karakter dengan Tipe Char");
	System.out.print("Karakter :");
	String a =new Scanner(System.in).nextLine();
	System.out.println("Karakter Yang Anda Masukkan Adalah : " + a);
}
}
