import java.util.Scanner;
public class boolean1 {
	public static void main(String[] args){
		//Deklarasi Variabel
		boolean tinggi,pendek;
		//Inisialisasi Valuenya
		tinggi = true;
		pendek = false;
		//Melakukan Operasi
		if(tinggi){
			//Menampilkan Hasil Operasi
			System.out.println("");
			System.out.println("Boolean Bernilai True " );
			System.out.println("Silahkan Masukkan Keterangan True or False :");
			//Input Melalui Keyboard
			System.out.print("Keterangan : ");
			boolean a = new Scanner(System.in).nextBoolean();
			System.out.println("Keterangan Yang Anda Masukkan Adalah : " + a );
		}if(pendek){
			boolean b = new Scanner(System.in).nextBoolean();
			System.out.println("Keterangan Yang Anda Masukkan Adalah : " + b );
			
			
}
	}
	
}

	

