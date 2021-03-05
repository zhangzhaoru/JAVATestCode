package OOPTestCLass;
/**
 * 
* @Description 创建JavaBean类
* @author ZhangZhaoRu
* @version
* @date 2021年3月5日上午10:44:10
*
 */
/* 1 类是公共的
 * 2 有一个无参构造器
 * 3 有属性，并且有相应的get、set方法
 */
public class Custmoer {
	private int id;
	private String name;
	
	public Custmoer() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
