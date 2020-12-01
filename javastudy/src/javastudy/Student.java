package javastudy;

public class Student {
	int sid;
	String name;
	int age;
	String gender;
	String dept;
	private int slevel =0;
	
	void study() {
		slevel++;
		System.out.println(name + "이 공부합니다");
	}
	void play() {
		slevel--;
		System.out.println(name + "이 놉니다");
	}
	
	int getSlevel() {
		return slevel;
	}
}
