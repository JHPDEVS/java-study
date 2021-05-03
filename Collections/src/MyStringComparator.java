import java.util.Comparator;

public class MyStringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		// o1이 크면 양수 반환, o1과 o2과 같으면 0을 반환
		// o2가 크면 음수 반환,
		
		// 문자열 값의 비교는 comparable 인터페이스를 구현하고 있는 string 클래스의 comparte 메소드를 호출하면된다
		return o2.compareTo(o1);
	}

}
