package sample;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		int [] b = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < b.length; i++) {
			if(i % 2 != 0) {
				b[i] = a[(i/2)];
			}else {
				b[i] = 0;
			}
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + (i+1) + "] = " + b[i]);
		}
		
		sc.close();

	}

}
