package p2024_08_08;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class BackJoon_240808_2 {

	public static void main(String[] args) throws NoSuchElementException {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(a+b);
		}
	}catch(NoSuchElementException e) {
		
	}finally {
		sc.close();
	}

	}

}
