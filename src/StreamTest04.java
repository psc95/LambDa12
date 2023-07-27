import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//배열로 부터 스트림 얻기
public class StreamTest04 {
	public static void main(String[] args) {
		
		String[] strArray = {"홍길동","이순신","세종대왕님"};
		Stream<String> strStream = Arrays.stream(strArray);
		//배열로 부터 문자열 타입 요소를 처리하는 스트림 생성
		strStream.forEach( a-> System.out.print(" "+a));
		System.out.println("\n=======================\n");
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		//배열로 부터 기본 int타입 요소를 처리하는 스트림 생성
		intStream.forEach(i -> System.out.println(i));
	}
}
