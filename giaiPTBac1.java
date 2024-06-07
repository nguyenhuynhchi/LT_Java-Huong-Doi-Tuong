package GiaiPTBac1;

import java.util.Scanner;

public class giaiPTBac1 {
	public static void main(String[] args) {
		// PT Bậc 1: ax + b = 0
		/*
		 * Nếu a=0 Nếu b=0 ==> Pt có vô số nghiệm Nếu b!=0 ==> pt vô nghiệm
		 *
		 * Nếu a!=0 ==> Pt có nghiệm là x=-b/a
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hệ số a, b cho phường trình: ax + b = 0");

		double a, b, x;
		System.out.println("a= ");
		a = sc.nextDouble();
		System.out.println("b= ");
		b = sc.nextDouble();

		if (a == 0) {
			if (b == 0)
				System.out.println("PT có vô số nghiệm");
			else if (b != 0)
				System.out.println("PT vô nghiệm");
		} else {
			x = -b / a;
			System.out.println("PT có nghiệm x = " + x);
		}
	}
}
