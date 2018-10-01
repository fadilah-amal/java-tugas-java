import java.util.Scanner;
public class arrayInteger {
	public static void main(String[] args){
		//Deklarasi Variabel
		int A[] ={1,2,3,4,5,6,7,8,9};//Inisialisasi Valuenya
		A = new int[9];
		//Operasi Pada Array
		System.out.println("Nomor Index :");
		for (int i=0;i<A.length;i++){
		//Menampilkan Hasil Operasi

		System.out.println(i);
		}
		//Input Bilangan Melalui Keyboard
		System.out.println("Silahkan Input Bilangan Bulat");
		System.out.print("Bilangan :");
		int a =new Scanner(System.in).nextInt();
		System.out.println("Bilangan Yang Anda Masukkan Adalah : " + a);
		
	}

}
