package step9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		
		List<Integer> factor = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0)
				factor.add(i);
		}
		
		if(k > factor.size())
			System.out.println(0);
		else
			System.out.println(factor.get(k-1));
		
		sc.close();
	}
}
