import java.util.Scanner;
public class integer {

	public static void main(String[] args) {
		//deklarasi variabel
			int A;
			int B;
			int D;
			float E;
		
		//contoh iniliasisasi valuenya
			A = 50;
			B = 40;
			int C = 76;
			
		//contoh penggunaan dalam operasi
			D = ((A + B) * (A - B)) + A ;
			E = (float)D / (float)C;
			
		//menampilkan hasil operasi
			System.out.println("A = " + A);
			System.out.println("B = " + B);
			System.out.println("C = " + C);
			System.out.println(" Operasi Bilangan");
			System.out.println("1. ((A + B) * (A - B)) + A");
			System.out.println("Hasil 1 = " + D);
			System.out.println("2. Hasil1 / C ");
			System.out.println("Hasil2 = " + E);
			
		//input dari keyboard
			System.out.println("Masukkan Bilangan Integer : ");
			int F = new Scanner(System.in).nextInt();
			System.out.print("Bilangan Integer Yang Anda Masukkan Adalah : ");
			System.out.println(F);
	}	

}
