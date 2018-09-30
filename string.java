import java.util.Scanner;
public class string {
	public static void main(String[] args){
		//deklarasi variabel
		String nama ;
		String nim ;
		String prodi ;
		String biodata;
		//inisialisasi value
		nama = "NURFADILAH";
		nim = "D0217315";
		prodi = "INFORMATIKA";
		//menampilkan nilai variabel
		System.out.println("Nama \t : " + nama);
		System.out.println("NIM \t : " + nim);
		System.out.println("Prodi \t : " + prodi);
		//Operasi Dengan tipe data String
		biodata =(""+nama +nim +prodi);
		System.out.println(biodata);
		//input dari keyboard
		System.out.println("Input Data Selanjutnya :");
		System.out.print("Masukkan Nama : ");
		nama = new Scanner(System.in).nextLine();
		System.out.print("Masukkan NIM : ");
		nim = new Scanner(System.in).nextLine();
		System.out.print("Masukkan Prodi : ");
		prodi = new Scanner(System.in).nextLine();
		System.out.println("Data Yang Anda Masukkan Adalah : ");
		System.out.println("Nama \t : " + nama);
		System.out.println("NIM \t : " + nim);
		System.out.println("Prodi \t : " + prodi);

}
}
