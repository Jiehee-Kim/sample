package sample;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int [] a = {1, 2, 3};
		int [] b = new int[3];
		int [] c = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("숫자를 입력하세요 : ");
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < c.length; i++) {
			if(i < 3) {
				c[i] = a[i];
			}else {
				c[i] = b[i-3];
			}
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
		
		
		sc.close();
	}

}
