package personalsub;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr = ArrayGenerator();
        
        BubbleSort(arr);
        
        System.out.print("정렬된 배열 : ");
        System.out.println(Arrays.toString(arr));
	}
	
	public static int[] ArrayGenerator() {
		Random rand = new Random();
        int[] arr = new int[10];  // 10개의 정수로 이루어진 배열

        // 배열에 랜덤 값 할당 (1부터 100까지)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;  // 1부터 100까지의 랜덤한 값
        }

        // 배열 출력
        System.out.print("생성된 배열 :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        return arr;
	}
	
	public static void BubbleSort(int[] arr) {
		int temp;
        
        for(int a=0; a<10; a++) {
	        for(int i=0; i<9; i++) {
	        	if(arr[i] > arr[i+1]) {
	        		temp = arr[i];
	        		arr[i] = arr[i+1];
	        		arr[i+1] = temp;
	        	}
	        }
        }
	}
}
