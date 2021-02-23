package classcode;

import java.util.Scanner;
import java.lang.Math;

public class ExerciseVariables {

	public static void main(String[] args) {
		// 1
		int a = 5;
		int b = 6;
		int c = a + b;
		System.out.println(c);
		// 2

		double aa = 33;
		double cc = 44;
		double dd = aa + cc;
		System.out.println(dd);

		// 3
		int i = 5;
		double D = 30;
		double J = (double)i + D;
		System.out.println(J);

		// 4
		int v = 4;
		int vv = 44;
		int vvv = vv/v;
		System.out.println(vvv);		

		// 5
		double dD = 102928487;
		double Dd = 313;
		double bisPrime = dD/Dd;
		System.out.println(bisPrime);
		System.out.println((int)bisPrime);

		// 6
		int ii = 4332;
		int iii = 3340;

		// 7


		double coffee = 2.99;
		double mocha = 4.99;
		double HerbalTea = 2.89;
		double subTotal = 3* coffee + 4* mocha + 2* HerbalTea;
		double SalesTaxRate = .0275;
		double totalSale = subTotal * (1 + SalesTaxRate);
		// totalSale = totalSale*100;
		// totalSale = Math.round(totalSale);
		// totalSale = totalSale/100;
		totalSale = (double)(Math.round(totalSale*100))/100;
		System.out.println(totalSale);




	}

}
