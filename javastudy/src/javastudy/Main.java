package javastudy;
import javastudy.oop;

public class Main {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.age = 19;
		std1.dept = "컴정";
		std1.gender = "남";
		std1.name = "홍길동";
		std1.sid = 1111;
		std1.study();
		int level =std1.getSlevel();
		System.out.println(std1.name+"의 수준 " + level);
		Student std2 = new Student();
		std2.age = 19;
		std2.dept = "컴정";
		std2.gender = "여";
		std2.name = "일지매";
		std2.sid = 1235;
		std2.study();
	}	
}
