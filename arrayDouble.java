import java.util.Scanner;
public class arrayDouble {
	public static void main(String[] args){
		//Deklarasi Variabel
		double[]bilangan;
		//Inisialisasi Valuenya
		bilangan=new double[3];
		bilangan[0]=1.5;
		bilangan[1]=2.5;
		bilangan[2]=3.4;
		//Operasi Variabel dengan tipe array double
		System.out.println("Bilangan dengan tipe double :");
		for (int i=0;i<bilangan.length;i++){
		//Menampilkan Hasil Operasi
			System.out.println("Index " + i+" = " +bilangan[i]);
		//Input Nilai Variabel Melalui Keyboard
			
		}
		System.out.println("Silahkan Input Bilangan dengan Tipe Double");
		System.out.print("Bilangan :");
		double a =new Scanner(System.in).nextDouble();
		System.out.println("Bilangan Yang Anda Masukkan Adalah : " + a);
	}

}
