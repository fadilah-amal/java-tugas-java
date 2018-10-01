import java.util.Scanner;
public class arrayBoolean {
	public static void main(String[] args){
		//Deklarasi Variabel
		boolean[] Y={true, false};//Inisialisasi Valuenya
		//Operasi dan Menampilkan Hasil Operasi
		System.out.println("Bilangan Boolean : ");
		System.out.println(Y[0]);
		System.out.println(Y[1]);
		//Input Nilai Variabel Melalui Keyboard
		System.out.println("Silahkan Input Bilangan dengan Tipe Boolean");
		System.out.println("1. ");
		String a =new Scanner(System.in).nextLine();
		System.out.println("2. ");
		boolean b =new Scanner(System.in).nextBoolean();
		System.out.println("Bilangan dengan tipe Boolean Yang Anda Masukkan Adalah : ");
		System.out.println("1. " + a);
		System.out.println("1. " + b);
		}
	
	}


