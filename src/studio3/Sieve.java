package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want the highest number to be?");
		int n = in.nextInt(); 
		boolean prime[] = new boolean [n];

		for (int m = 0; m < n; m++) {
			prime[m] = true;
			System.out.println(prime[m]);
		}

		for (int i = 1; i < n; i++) {
			for (int j = 2; j < n; j++) {
				if ((i%j == 0)&&(i != j)){
					prime[j] = false;
				}
			}
		}
			for (int i = 0;i < n;i++)
				{
					if (prime[i] == true) {
						System.out.println(i);
					}
		}
	}
}
		

				//				for (int j = 0; j < n; j ++) {
////				//					j = (i * i) + (j * i);
////				//					prime[j] = false;
////				//					System.out.println(prime[j]);
////				//
////				//				}
////			}
////
////		}
//		for (int i = 0;i < n;i++)
//		{
//			if (prime[i] == true) {
//				System.out.println(i);
//		}
//		}
//	}
//}
