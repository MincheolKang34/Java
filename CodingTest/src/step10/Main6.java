package step10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> angles = new ArrayList<Integer>();
		
		for(int i=0; i<3; i++)
			angles.add(sc.nextInt());
		
		if(angles.stream().mapToInt(Integer::intValue).sum() != 180)
			System.out.println("Error");
		else {
			if(angles.stream().mapToInt(Integer::intValue).allMatch(x -> x == 60))
				System.out.println("Equilateral");
			else if(angles.get(0).equals(angles.get(1)) || angles.get(0).equals(angles.get(2))
					|| angles.get(2).equals(angles.get(1)))
				System.out.println("Isosceles");
			else
				System.out.println("Scalene");
		}
		
		sc.close();
	}
}
