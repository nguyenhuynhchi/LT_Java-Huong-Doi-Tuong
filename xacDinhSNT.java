package XacDinhSNT;

import java.util.Scanner;

public class xacDinhSNT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Nhập vào x: ");
		x = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= x; i++) {

			if (x % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(x+" la SNT");
		}
		else {
			System.out.println(x+" khong la SNT");
		}
	}
}
