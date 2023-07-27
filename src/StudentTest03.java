import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//스트림과 람다식을 활용한 예제 => 컬렉션으로 부터 스트림 얻기
public class StudentTest03 {
	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
					new Student("신사임당님",100),
					new Student("강감찬님",99),
					new Student("유관순님",88)
				);
		
		Stream<Student> stream = studentList.stream();
		stream.forEach(student -> System.out.println(student.getName()));
	}
}
