package OOPTestCLass;
/**
 * 
* @Description 使用值传递方法调用其他对象的方法
* @author ZhangZhaoRu
* @version
* @date 2021年3月4日下午4:11:57
*
 */
public class PassObject {
	public void printAreas(Circle c,int time) {
		String details = "Radius	        Area"+"\n";
		for(int i = 1;i<=time;i++) {
			c.setRadius((double)i);
			details+=(double)i+"\t\t"+c.calArea()+"\n";
		}
		System.out.println(details);
		System.out.println("====================end=================");
	}
	
	public static void main(String[] args) {
		PassObject passObject = new PassObject();
		Circle circle = new Circle();
		passObject.printAreas(circle, 5);
		System.out.println("当前的半径值为： "+circle.getRadius());
	}
}
