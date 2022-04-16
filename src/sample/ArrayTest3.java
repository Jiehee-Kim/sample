package sample;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		int[] b = new int[3];
		int x = a;
		
		for(int i = 0; i < 3; i++) {	
			b[i] = a % 10;
			x = a / 10;
			a = x;
			
			System.out.println("b[" + i + "] = " + b[i]);	
		}
		
		int[] c = new int[3];
		int y = 0;
		int i = 0;
		
		for(int j = 2; j >= 0; j--) {
			y = b[j];
			c[i] = y;
			
			System.out.println("c[" + i + "] = " + c[i]);

			i++;
		}
				
		

		sc.close();
	}

}
