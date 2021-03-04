package OOPTestCLass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * 
* @Description 学生集合类
* @author ZhangZhaoRu
* @version
* @date 2021年3月4日下午1:45:12
*
 */
public class Students {
	// 1 遍历Student 数组
	public void traveStusArr(Student[] students) {
		for(int i = 0;i<students.length;i++) {
			students[i].printInfo();
		}
	}
	
	// 遍历Student链表
	public void traveStuList(List<Student> students) {
		for(Student student:students) {
			student.printInfo();
		}
	}
	
	// 实现对于Student链表按照年级进行筛选
	public List<Student> screenState(List<Student> students,int state){
		ArrayList<Student> res = new ArrayList<>();
		for(Student student:students) {
			if(student.getState()==state) {
				res.add(student);
			}
		}
		return res;
	}
	
	// 实现对于Student数组按照年级进行筛选
	public Student[] screenState(Student[] students,int state) {
		Student[] res = new Student[students.length];
		int k = 0;
		for(int i = 0;i<students.length;i++) {
			if(students[i].getState()==state) {
				Student temp = new Student();
				temp = students[i];
				res[k++] = temp;
			}
		}
		return res;
	}
	
	// 实现对于Student链表进行排序
	public List<Student> stusSort(List<Student> students){
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getScore() > o2.getScore() ? -1 : (o1.getScore() == o2.getScore() ? 0 : 1);
			}
		});
		return students;
	}
	
	// 实现对于Student数组成绩进行排序
	public Student[] stusSort(Student[] stus) {
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
		return stus;
	}
}
