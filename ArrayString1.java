import java.util.Scanner;
public class ArrayString1 {
	public static void main(String[] args){
	//Deklarasi Variabel
	String[]mahasiswa;
	//Inisialisasi Valuenya
	mahasiswa=new String[3];
	mahasiswa[0]="NURFADILAH";
	mahasiswa[1]="NURDINA";
	mahasiswa[2]="NISMAWATI";
	//Operasi Variabel dengan tipe array string
	System.out.println("Nama Mahasiswa Tipe Array :");
	System.out.println("Daftar Nama Mahasiswa :");
	for (int i=0;i<mahasiswa.length;i++){
	//Menampilkan Hasil Operasi
		System.out.println("Nama" + i+" : " +mahasiswa[i]);	
	}
	//Input Nilai Variabel Melalui Keyboard
	System.out.println("Silahkan Input Nama Anda");
	System.out.print("Nama :");
	String a =new Scanner(System.in).nextLine();
	System.out.println("Nama Yaang Anda Masukkan Adalah : " + a);
	}
}


