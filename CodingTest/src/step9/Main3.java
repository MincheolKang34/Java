package step9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();

			if(n == -1)
				break;
			
			List<Integer> factor = new ArrayList<>();
			for(int i=1; i<=n-1; i++) {
				if(n%i == 0)
					factor.add(i);
			}
			
			if(factor.stream().mapToInt(Integer::intValue).sum() == n) {
				System.out.print(n+" = ");
				for(int i=0; i<factor.size(); i++) {
					if(i == factor.size()-1)
						System.out.println(factor.get(i));
					else
						System.out.print(factor.get(i)+" + ");
				}
			}else
				System.out.println(n+" is NOT perfect.");
		}
		
		sc.close();
	}
}
