package OOPTestCLass;

public class Student {
	private String name;
	private int age;
	private String major;
	private String intersts;
	private int number;
	private int state;
	private int score;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getIntersts() {
		return intersts;
	}

	public void setIntersts(String intersts) {
		this.intersts = intersts;
	}

	public void say() {
		System.out.println("姓名： " + name);
		System.out.println("年龄： " + age);
		System.out.println("主修专业： " + major);
		System.out.println("兴趣： " + intersts);
	}

	public void printInfo() {
		System.out.println("---------------------");
		System.out.println("学号： " + getNumber());
		System.out.println("年纪： " + getState());
		System.out.println("成绩： " + getScore());
	}

}
