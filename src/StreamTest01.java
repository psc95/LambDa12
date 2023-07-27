import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/* 컬렉션에 저장된 복수개의 원소값을 기존 방법을 사용해서 가져오는 것과 자바 8에서 추가된 람다식과 스트림을 사용해서
 * 가져온 예)
 */
public class StreamTest01 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","이순신","강감찬");//배열을 컬렌션 List로 변환
		
		//기존 방법인 Iterator를 사용한 예
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {//다음 원소값이 존재하면 참
			String name = iterator.next();//다음 원소값을 가져옴.
			System.out.print(" "+name);
		}
		System.out.println("\n===============> \n");
		
		//자바 8에서 추가된 람다식과 스트림을 활용한 예)
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.print(" "+name));
	}
}
