
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestString6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random r1 = new Random() ;
		int[] arr = new int[10];
		int[] arr1 = new int[10];
		for(int i = 0;i < 10;i++) {
			arr[i] = r1.nextInt(99);
		}
		System.out.println(Arrays.toString(arr));
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int find = -1;
		if((find = Arrays.binarySearch(arr1, key)) > -1) {
			System.out.println("该数位于"+find);
		}else
			System.out.println("查无此数");
		
	}

}
