import java.util.Comparator;

public class MyStringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		// o1�� ũ�� ��� ��ȯ, o1�� o2�� ������ 0�� ��ȯ
		// o2�� ũ�� ���� ��ȯ,
		
		// ���ڿ� ���� �񱳴� comparable �������̽��� �����ϰ� �ִ� string Ŭ������ comparte �޼ҵ带 ȣ���ϸ�ȴ�
		return o2.compareTo(o1);
	}

}
