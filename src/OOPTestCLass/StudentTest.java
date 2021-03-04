package OOPTestCLass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * 
 * @Description 建立学生类链表，筛选年纪为3年纪的学生并答应信息，对于所有学生按成绩进行排序，并打印信息
 * @author ZhangZhaoRu
 * @version
 * @date 2021年3月4日下午12:08:37
 *
 */

public class StudentTest {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Student student = new Student();
			student.setNumber(i + 1);
			student.setScore((int) (Math.random() * (100 - 0) + 0));
			student.setState((int) (Math.random() * (6 - 1) + 1));
			students.add(student);
		}

		for (Student student : students) {
			if (student.getState() == 3) {
				student.printInfo();
			}
		}

		System.out.println("所有学生按成精进行排序");
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getScore() > o2.getScore() ? -1 : (o1.getScore() == o2.getScore() ? 0 : 1);
			}
		});
		for (Student student : students) {
			student.printInfo();
		}

		// 使用数组方法实现,对于各个元素需要重新new
		System.out.println("使用数组方法实现");
		System.out.println("筛选年纪为3的学生");
		Student[] stus = new Student[20];
		for (int i = 0; i < stus.length; i++) {
			Student student = new Student();
			student.setNumber(i + 1);
			student.setScore((int) (Math.random() * (100 - 0) + 0));
			student.setState((int) (Math.random() * (6 - 1) + 1));
			stus[i] = student;
		}
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].getState() == 3) {
				stus[i].printInfo();
			}
		}

		// 使用冒泡排序法排序
		System.out.println();
		for (int i = 0; i < stus.length - 1; i++) {
			for (int j = 0; j < stus.length - 1 - i; j++) {
				if (stus[j].getScore() < stus[j + 1].getScore()) {
					Student temp = new Student();
					temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < stus.length; i++) {
			stus[i].printInfo();
		}

	}
}
