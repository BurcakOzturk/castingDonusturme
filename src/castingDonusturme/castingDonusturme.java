package castingDonusturme;

import java.util.Scanner;

public class castingDonusturme {

	public static void main(String[] args) {

		int intDeger,doubleDonusum;
		double doubleDeger,intDonusum;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Integer tipte bir değer giriniz(ör:37) : " );
		intDeger = input.nextInt();
		
		System.out.print("Double tipte bir değer giriniz(ör:5,2) : " );
		doubleDeger = input.nextDouble();
		
		doubleDonusum = (int) doubleDeger;
		intDonusum = (double) intDeger;

		System.out.println();
		System.out.println(intDeger+" olarak girilen integer değerin, double olarak çıktısı : "+intDonusum);
		System.out.println(doubleDeger+" olarak girilen double değerin, integer olarak çıktısı : "+doubleDonusum);
	}

}
