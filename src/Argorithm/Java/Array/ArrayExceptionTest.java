package Argorithm.Java.Array;

import java.util.Arrays;

/**
 * 
 * @Description 数组异常测试
 * @author ZhangZhaoRu
 * @version
 * @date 2021年3月4日上午9:31:38
 *
 */
public class ArrayExceptionTest {
	public static void main(String[] args) {
		// 1 数组角标越界异常 ArrayIndexOutOfBoundsException
		int[] arr1 = new int[5];
		try {
			for (int i = 0; i <= 5; i++) {
				arr1[i] = i;
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		// 2 空指针异常
		int[] arr2 = null;
		try {
			System.out.println(arr2[1]);
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		int[][] arr4 = new int[3][];
		System.out.println(arr4[0]);
		try {
			System.out.println(arr4[0][1]);
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// 调用的方法的对象是空指针
		String[] arr3 = new String[] { "aa", "bb", "cc" };
		arr3[0] = null;
		try {
			System.out.println(arr3[0].toString());
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
