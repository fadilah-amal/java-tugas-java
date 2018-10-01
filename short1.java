import java.util.Scanner;
public class short1 {
public static void main(String[] args){
	//Deklarasi Variabel
	short beratDila, beratDina; 
	int selisih;
	//Inisialisasi Valuenya
	beratDila = 155;
	beratDina = 150;
	//Operasi Pada Bilangan short
	selisih = beratDila-beratDina ;
	//Menampilkan Hasil Operasi Bilangan
	System.out.println("Selisih Berat Badan");
	System.out.println("Berat Dila : " + beratDila);
	System.out.println("Berat Dina : " + beratDina);
	System.out.println("Selisih Berat Badan Mereka adalah : " + selisih);
	//Input Nilai Dengan Keyboard
	System.out.println("Silahkan Masukkan Berat Badan Anda !");
	System.out.print("Berat : ");
	short berat = new Scanner(System.in).nextShort();
	System.out.println("Berat Badan Yang Anda Masukkan Adalah : " + berat);
}
}
