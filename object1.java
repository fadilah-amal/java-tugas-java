import java.util.Scanner;
public class object1 {
	public static void main(String[] args){
		//Deklarasi Variabel
		String nama, nim, prodi;
		int umur;
		float tinggi, berat;
		//Inisialisasi Valuenya
		nama = "NURFADILAH";
		nim = "D0217315";
		prodi = "INFORMATIKA";
		umur = 19;
		tinggi = (float)158.5;
		berat = (float)48.5;
		//Melakukan dan Menampilkan Haasil Operasi
		System.out.println("Nama \t\t\t: " + nama);
		System.out.println("NIM \t\t\t: " + nim);
		System.out.println("Prodi \t\t\t: " + prodi);
		System.out.println("Umur \t\t\t: " + umur);
		System.out.println("Tinggi Badan \t\t: " + tinggi + "cm");
		System.out.println("Berat Badan \t\t: " + berat + "kg");
		//Input Data Melalui Keyboard
		System.out.println("Silahkan Melakukan Input Data");
		System.out.print("Nama :");
		String a = new Scanner(System.in).nextLine();
		System.out.print("NIM :");
		String b = new Scanner(System.in).nextLine();
		System.out.print("Prodi :");
		String c = new Scanner(System.in).nextLine();
		System.out.print("Umur :");
		int d = new Scanner(System.in).nextInt();
		System.out.print("Tinggi Badan :");
		float e = new Scanner(System.in).nextFloat();
		System.out.print("Berat Badan :");
		float f = new Scanner(System.in).nextFloat();
		System.out.println("Data Yang Anda Masukkan Adalah :");
		System.out.println("Nama \t\t\t: " + a);
		System.out.println("NIM \t\t\t: " + b);
		System.out.println("Prodi \t\t\t: " + c);
		System.out.println("Umur \t\t\t: " + d);
		System.out.println("Tinggi Badan \t\t: " + e +  " cm");
		System.out.println("Berat Badan \t\t: " + f +  " kg");
		
		
		
	}
	

}
