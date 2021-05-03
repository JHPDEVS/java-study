import java.util.*;

public class Sort {
	private String name;
	
	public Sort(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		String[] sample = {"I","walk","the","line"};
		
		List<String> list = Arrays.asList(sample);

		System.out.println("������...");
		System.out.println(list);
		
		// Collections�� sort �޼���� List Ÿ���� ���ڷ� ������.
		// ���ڷ� ������.
		System.out.println("������...");
		//���� ������ Ŭ������ comparable ���� ������ Ŭ������ �ƴϸ� Comparator
		
		// ������ Ÿ�� Ŭ������ ���� ������ �� ������
		// Comparable �������̽��� �����ؼ� ���� ����� ������ �� �ִ�.
		// ������ Ÿ�� Ŭ������ ���� ������ �� ������ (���� ���, String, Integer...)
		// Comparator Ŭ������ �����ؼ� ���� ����� �˷���� �ϳ�.
		// �Ǵ� ������ Ÿ�� Ŭ������ ������ �� ������,  �� Ŭ������ �������� �ʰ�
		// ���� ����� �����ϰ��� �� ���� Comparator Ŭ������ ������ �ش�.
		Collections.sort(list, new MyStringComparator()); // ��������
		System.out.println(list);
	}
	
	//add�� �ϴ� ����?
	// ���ڷ� ���޵� �� ���� ���� ���ϰ� �� ����� ��ȯ�ϴ� ��.
	public int add(int n1, int n2) {
		return n1+n2;
	}
}
