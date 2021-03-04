package Argorithm.Java.Array;

/**
 * @Description 数组查找，排序及逆序
 * @author ZhangZhaoRu
 * @version
 * @date 2021年3月3日下午8:43:20
 *
 */
public class ArrayObj {
	private static final int MAX_LENGTH = 100;
	private static final int[] dataArr = new int[MAX_LENGTH];

	public static int[] reserveArr(int[] data) {
		for (int i = 0; i < data.length / 2; i++) {
			int temp = data[i];
			data[i] = data[data.length - 1 - i];
			data[data.length - i - 1] = temp;
		}
		return data;
	}

	public static boolean linearSearch(int[] data, int target) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return true;
			}
		}
		return false;
	}

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

	public static void main(String[] args) {
//		int[] data = { 1, 2, 3, 4, 5, 6, 7 };
		int[] data = { 1, 3, 2, 4, 4, 7, 6, 5 };
		// data = reserveArr(data);
//		data = bubbleSort4Arr(data);
		data = quickSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		if (linearSearch(data, 12)) {
			System.out.println("find success");
		} else {
			System.out.println("find file");
		}
		if (binSearch(data, 4)) {
			System.out.println("find success");
		} else {
			System.out.println("find fail");
		}

	}
}
