package Argorithm.Java.Array;

/**
 * 
 * @Description 数组工具类
 * @author ZhangZhaoRu
 * @version
 * @date 2021年3月4日下午2:17:53
 *
 */
public class ArrayUtil {
	private static final int MAX_LENGTH = 100;
	private static final int[] dataArr = new int[MAX_LENGTH];

	// 查找数组的最大值
	public int findMaxNum4Arr(int[] arr) {
		int maxNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

	// 查找数组的最小值
	public int findMinNum4Arr(int[] arr) {
		int minNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minNum) {
				minNum = arr[i];
			}
		}
		return minNum;
	}

	// 输出数组的总和
	public int sum4Arr(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		return res;
	}

	// 输出数组的平均数
	public double ave4Arr(int[] arr) {
		return (double) sum4Arr(arr) / (double) arr.length;
	}

	// 反转数组
	public int[] reserveArr(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}

	// 线性查找
	public static boolean linearSearch(int[] data, int target) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return true;
			}
		}
		return false;
	}

	// 二分查找
	public static boolean binSearch(int[] data, int target) {
		if (data.length == 0 || data == null) {
			return false;
		}
		int left = 0;
		int right = data.length - 1;
		while (left <= right) {
			int mid = (left + right) >> 1;
			if (data[mid] == target) {
				return true;
			} else if (data[mid] > target) {
				left = mid + 1;
			} else if (data[mid] < target) {
				right = mid - 1;
			}
		}
		return false;
	}

	// 冒泡排序法
	public static int[] bubbleSort4Arr(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j] < data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		return data;
	}

	// 快排
	public static int[] quickSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			dataArr[i] = data[i];
		}
		quikSort4Arr(0, data.length - 1);
		for (int i = 0; i < data.length; i++) {
			data[i] = dataArr[i];
		}
		return data;
	}

	public static void quikSort4Arr(int left, int right) {
		if (left > right) {
			return;
		}
		int base = dataArr[left];
		int i = left;
		int j = right;
		while (i != j) {
			while (dataArr[j] >= base && i < j) {
				j--;
			}
			while (dataArr[i] <= base && i < j) {
				i++;
			}
			if (i < j) {
				int temp = dataArr[i];
				dataArr[i] = dataArr[j];
				dataArr[j] = temp;
			}
		}
		//
		dataArr[left] = dataArr[i];
		dataArr[i] = base;
		quikSort4Arr(left, i - 1);
		quikSort4Arr(i + 1, right);
	}
}
