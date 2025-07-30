package step10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			x.add(sc.nextInt());
			y.add(sc.nextInt());
		}
		
		int width = x.stream().mapToInt(Integer::intValue).max().getAsInt() 
				- x.stream().mapToInt(Integer::intValue).min().getAsInt();
		int height = y.stream().mapToInt(Integer::intValue).max().getAsInt() 
				- y.stream().mapToInt(Integer::intValue).min().getAsInt();
		
		System.out.println(width * height);
		
		sc.close();
	}
}
