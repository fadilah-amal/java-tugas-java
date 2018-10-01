import java.util.Scanner;
public class arrayObject1 {
	public static void main(String[] args){
		//Deklarasi Variabel
		String[]nama;
		int[]usia;
		float[]tinggi;
		double[]berat;
		//Inisialisasi Valuenya
		nama = new String[1];
		nama[0] = "NURFADILAH";
		usia = new int[1];
		usia[0] = 19;
		tinggi = new float[1];
		tinggi[0] = 155;
		berat = new double[1];
		berat[0] = 45.8;

		//Operasi Variabel
		for (int i=0;i<nama.length;i++){
			System.out.println("Index " +"Nama " + i+" \t\t= " +nama[i]);
		}
		for (int i=0;i<usia.length;i++){
			System.out.println("Index " +"Usia " + i+" \t\t= " +usia[i]);
		}
		for (int i=0;i<tinggi.length;i++){
			System.out.println("Index " +"Tinggi Badan "+ i+" \t= " +tinggi[i]);
		}
		for (int i=0;i<berat.length;i++){
			System.out.println("Index " +"Berat Badan " + i+" \t= " +berat[i]);
		}
		System.out.println("Silahkan Input Biodata Anda !");
		System.out.print("Nama : ");
		String a = new Scanner(System.in).nextLine();
		System.out.print("Usia : ");
		int b = new Scanner(System.in).nextInt();
		System.out.print("Tinggi Badan : ");
		float c = new Scanner(System.in).nextFloat();
		System.out.print("Berat Badan : ");
		double d = new Scanner(System.in).nextDouble();
		System.out.println("Biodata Yang Anda Masukkan Adalah :");
		System.out.println("Nama : " + a);
		System.out.println("Usia : " + b);
		System.out.println("Tinggi Badan : " + c);
		System.out.println("Berat Badan : " +d);
	}
}
