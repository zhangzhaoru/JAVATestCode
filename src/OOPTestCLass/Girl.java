package OOPTestCLass;

public class Girl {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void marry(Boy boy) {
		System.out.println("我想嫁给"+boy.getName());
		boy.marry(this);// 传入当前的对象
	}
	
	/**
	 * 
	 * @Description 比较两个对象的大小
	 * @author shkstart
	 * @date 2021年3月5日上午11:50:30
	 * @param girl
	 */
	public int compare(Girl girl) {
		if(this.age>girl.age) {
			return 1;
		}else if(this.age<girl.age) {
			return -1;
		}else {
			return 0;
		}
	}

}
