package Argorithm.Java.Array;
import java.util.Arrays;

/**
 * 
* @Description 操作数组的工具类
* @author ZhangZhaoRu
* @version
* @date 2021年3月4日上午9:21:10
*
 */
public class ArraysTest {
	public static void main(String[] args) {
		// 判断两个数组是否相等
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,3,4};
		if(arr1.equals(arr2)) {
			System.out.println("is equals");
		}else {
			System.out.println("not equals");
		}
		
		// 遍历数组信息
		System.out.println(Arrays.toString(arr1));
		
		int[] arr3 = new int[5];
		Arrays.fill(arr3,3);
		
		Arrays.sort(arr1);
		
		int[] arr4 = new int[] {1,2,3,4,5,6};
		if(Arrays.binarySearch(arr4, 211)!=-1) {
			System.out.println("can find");
		}else {
			System.out.println("can not find");
		}
		
	}
}
