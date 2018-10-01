import java.util.Scanner;
public class float1 {
	public static void main(String[] args){
		//deklarasi variabel
		float nilaiA, nilaiB, nilaiC, nilaiD, hasil1, hasil2;
		
		//inisialisasi valuenya
		nilaiA = (float) 18.4;
		nilaiB = (float) 2.2;
		nilaiC = (float) 4.1;
		nilaiD = (float) 2.4;
		
		//penggunaan dalam operasi
		hasil1 = (nilaiA + nilaiB) * (nilaiC - nilaiD);
		hasil2 = hasil1 / nilaiA;
		
		//menampilkan hasil operasi
		System.out.println("Nilai A : " + nilaiA);
		System.out.println("Nilai B : " + nilaiB);
		System.out.println("Nilai C : " + nilaiC);
		System.out.println("Nilai D : " + nilaiD);
		System.out.println("Operasi Bilangan : ");
		System.out.println("1. (A + B) * (C - D) ");
		System.out.println("Hasil1 = " + hasil1);
		System.out.println("2. Hasil1 / C  " );
		System.out.println("Hasil2 = " + hasil2);
		
		//Input Bilangan dari Keyboard
		System.out.println("Masukkan Nilai Bilangan Float Anda : ");
		System.out.print("A = ");
		float A =  new Scanner(System.in).nextFloat();
		System.out.print("B = ");
		float B =  new Scanner(System.in).nextFloat();
		System.out.print("C = ");
		float C =  new Scanner(System.in).nextFloat();
		System.out.print("D = ");
		float D =  new Scanner(System.in).nextFloat();
		System.out.println("Bilangan Float Yang Anda Masukkan Adalah : ");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D);
		
		
	}

}
