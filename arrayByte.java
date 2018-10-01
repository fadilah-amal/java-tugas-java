import java.util.Scanner;
public class arrayByte {
public static void main(String[] args){
	//Deklarasi Variabel
	byte[] bit;
	//Inisialisasi Valuenya
	bit = new byte[6];
	bit[0]=15;
	bit[1]=25;
	bit[2]=34;
	bit[3]=10;
	bit[4]=15;
	bit[5]=20;
	//Operasi Nilai Variabel
	System.out.println("Bilangan dengan tipe Byte :");
	for (int i=0;i<bit.length;i++){
	//Menampilkan Hasil Operasi
		System.out.println("Index " + i+" = " +bit[i]);
	}
	//Input Nilai Variabel Melalui Keyboard
	System.out.println("Silahkan Input Bilangan dengan Tipe Byte");
	System.out.print("Bilangan :");
	byte a =new Scanner(System.in).nextByte();
	System.out.println("Bilangan Yang Anda Masukkan Adalah : " + a);

}
}
