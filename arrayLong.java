import java.util.Scanner;
public class arrayLong {
	public static void main(String[] args){
		//Deklarasi Variabel
		long[]harga;
		//Inisialisasi Valuenya
		harga = new long[9];
		harga[0]=150000000;
		harga[1]=250000000;
		harga[2]=340000000;
		harga[3]=100000000;
		harga[4]=160000000;
		harga[5]=200000000;
		harga[6]=170000000;
		harga[7]=180000000;
		harga[8]=110000000;
		//Operasi Variabel dengan tipe array double
		System.out.println("Bilangan dengan tipe Long :");
		for (int i=0;i<harga.length;i++){
		//Menampilkan Hasil Operasi
			System.out.println("Index" + i+" = " +harga[i]);
		}
		//Input Nilai Variabel Melalui Keyboard
		System.out.println("Silahkan Input Bilangan dengan Tipe Long");
		System.out.print("Bilangan :");
		long a =new Scanner(System.in).nextLong();
		System.out.println("Bilangan Yang Anda Masukkan Adalah : " + a);
	}

}
