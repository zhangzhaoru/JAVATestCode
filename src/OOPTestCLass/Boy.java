package OOPTestCLass;

public class Boy {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public Boy() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void marry(Girl girl) {
		System.out.println("我想娶"+girl.getName());
	}

	public void shout() {
		if(age>=22) {
			System.out.println("你可以合法登记");
		}else {
			System.out.println("先谈恋爱");
		}
	}

}
