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
		System.out.println(name + "�� �����մϴ�");
	}
	void play() {
		slevel--;
		System.out.println(name + "�� ��ϴ�");
	}
	
	int getSlevel() {
		return slevel;
	}
}
