package javastudy;
import javastudy.oop;

public class Main {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.age = 19;
		std1.dept = "����";
		std1.gender = "��";
		std1.name = "ȫ�浿";
		std1.sid = 1111;
		std1.study();
		int level =std1.getSlevel();
		System.out.println(std1.name+"�� ���� " + level);
		Student std2 = new Student();
		std2.age = 19;
		std2.dept = "����";
		std2.gender = "��";
		std2.name = "������";
		std2.sid = 1235;
		std2.study();
	}	
}
