package step9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(), n = sc.nextInt();
		
		List<Integer> primes = new ArrayList<>();
		
		for(int i=m; i<=n; i++) {
			if(checkPrime(i))
				primes.add(i);
		}
		
		if(primes.size() == 0)
			System.out.println(-1);
		else {
			System.out.println(primes.stream().mapToInt(Integer::intValue).sum());
			System.out.println(primes.get(0));
		}
		
		sc .close();
	}
	
	public static boolean checkPrime(int i) {
		boolean check = true;
		for(int j=2; j*j<=i; j++) {
			if(i%j == 0) {
				check = false;
				break;
			}
		}
		
		if(i == 1)
			return false;
		else {
			return check;
		}
	}
}
