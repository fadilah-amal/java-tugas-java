import java.util.Scanner;
public class arrayFloat {
public static void main(String[] args){
	//Deklarasi Variabel
	float[]decimal;
	//Inisialisasi Valuenya
	decimal = new float[5];
	decimal[0]=(float)19.5;
	decimal[1]=(float)20.5;
	decimal[2]=(float)30.4;
	decimal[3]=(float)15.5;
	decimal[4]=(float)18.8;
	//Operasi Variabel dengan tipe array double
	System.out.println("Bilangan dengan tipe Float :");
	for (int i=0;i<decimal.length;i++){
	//Menampilkan Hasil Operasi
		System.out.println("Index" + i+" = " +decimal[i]);
	}
	//Input Nilai Variabel Melalui Keyboard
	System.out.println("Silahkan Input Bilangan dengan Tipe Float");
	System.out.print("Bilangan :");
	float a =new Scanner(System.in).nextFloat();
	System.out.println("Bilangan Yang Anda Masukkan Adalah : " + a);
}
}
