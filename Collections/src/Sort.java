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

		System.out.println("정렬전...");
		System.out.println(list);
		
		// Collections의 sort 메서드는 List 타입을 인자로 가진다.
		// 인자로 가진다.
		System.out.println("정렬후...");
		//내가 구현한 클래스는 comparable 내가 구현한 클래스가 아니면 Comparator
		
		// 원소의 타입 클래스를 내가 변경할 수 있으면
		// Comparable 인터페이스를 구현해서 정렬 방법을 변경할 수 있다.
		// 원소의 타입 클래스를 내가 변경할 수 없으면 (예를 들어, String, Integer...)
		// Comparator 클래스를 구현해서 정렬 방법을 알려줘야 하낟.
		// 또는 원소의 타입 클래스를 변경할 수 있지만,  그 클래스를 변경하지 않고
		// 정렬 방법을 변경하고자 할 때도 Comparator 클래스를 구현해 준다.
		Collections.sort(list, new MyStringComparator()); // 내림차순
		System.out.println(list);
	}
	
	//add가 하는 일은?
	// 인자로 전달된 두 개의 값을 더하고 그 결과를 반환하는 것.
	public int add(int n1, int n2) {
		return n1+n2;
	}
}
