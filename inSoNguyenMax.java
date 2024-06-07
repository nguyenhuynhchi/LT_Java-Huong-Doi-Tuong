package inSoNguyenMax;

import java.util.Scanner;

public class inSoNguyenMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		System.out.println("Nhập 2 so nguyen: ");
		System.out.println("n: ");
		n = sc.nextInt();
		System.out.println("m: ");
		m = sc.nextInt();
		int max = n;
		if (max < m) {
			max = m;
		}
		System.out.println("So nguyen lon nhat la: " + max);
	}
}
