package OOPTestCLass;

/**
 * 
 * @Description 计算满足某种规则的递归数列
 * @author ZhangZhaoRu
 * @version
 * @date 2021年3月4日下午4:17:47
 *
 */
public class RecursiveSequence {
	public static int dsp(int num) {
		if (num == 0) {
			return 1;
		}
		if (num == 1) {
			return 4;
		}
		return 2 * dsp(num - 1) + dsp(num - 2);
	}
	
	public static int sum4Sequence(int num) {
		int res = 0;
		for(int i = 0;i<=num;i++) {
			res+=dsp(i);
		}
		return res;
	}
	
	public static void disRes(int num) {
		String detals = "n\t\tf(n)\t\tSum\n";
		
		for(int i = 0;i<=num;i++) {
			detals+=i+"\t\t"+dsp(i)+"\t\t"+sum4Sequence(i)+"\n";
		}
		System.out.println(detals);
	}
	public static void main(String[] args) {
		disRes(10);
	}

}
