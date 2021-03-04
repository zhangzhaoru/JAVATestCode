package OOPTestCLass;

public class Person {
	private String name;
	private int age;
	private int sex;

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

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void study() {
		System.out.println("Studying");
	}
	
	public void showAge() {
		System.out.println("Age: "+getAge());
	}
	
	public void addAge() {
		setAge(this.age+2);
	}

}
