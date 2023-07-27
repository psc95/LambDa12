import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//숫자 범위로 부터 스트림 얻기
public class StreamTest05 {
	static int sum;//누적합을 저장할 변수
	public static void main(String[] args) {
		
		/* 문제)IntStream하위의 rangeClosed(int a, int b)메서드를 활용해서 1부터 100까지 순차적으로 제공하는
		 * 스트림 객체를 생성한 다음 해당 자연수의 누적합을 구해서 출력해 보자.
		 * 누적합을 구할 때 메서드 인자값으로 람다식을 사용해야 한다.
		 */
		IntStream stream = IntStream.rangeClosed(1, 100);//1부터 100까지의 순차적으로 제공하는 IntStream
		stream.forEach( i -> sum += i);
		System.out.println("1부터 100까지의 누적합 = "+sum);
		
//		IntStream num = IntStream.rangeClosed(1, 100);
//		int sum1 = num.reduce( 0 , (n1,n2)->n1+n2);
//		System.out.println(sum1);
		
		int total = 0;//누적합
		/* 문제2)일반 for반복문을 활용해서 51부터 100까지의 누적합을 구해보자.
		 * 
		 */
		for(int i = 51; i <= 100; i++) {
			total = total+i;
		}
		System.out.println("51부터 100까지의 누적합 = "+total);
		System.out.println("\n=========================>\n");
		
		total = 0;
		List<Integer> numList = new ArrayList<>();
		/* 문제3)일반 for반복문을 1부터 100까지 반복 하면서 Math.random()메서드를 활용해서
		 * 1부터 10사이의 임의의 난수를 100번 발생하여 컬렉션 numList에 추가한 다음 난수 누적합을 구해서 출력 해보고
		 * numList컬렉션과 향상된 확장for반복문을 활용해서 컬렉션 원소의 누적합을 구해서 각각 출력해 본다.
		 */
//		for(int i = 1; i <= 100; i++){
//			numList.add((int)(Math.random()*10)+1);
//			total = numList.stream().mapToInt(Integer::intValue).sum();
//		}
//		System.out.println(total);
		
		for(int i = 1; i <= 100; i++) {
			int number = (int)(Math.random()*10)+1;//1부터 10사이의 임의의 정수 숫자 난수가 발생
			numList.add(number);
			total += number;
		}
		System.out.println("정수 숫자 난수 누적합 = "+total);
		
		//향상된 확장 for문
		total = 0;
		for(int num : numList) {
			total += num;
		}
		System.out.println("1부터 100까지 누적 합 = "+total);
		
		
	}
}
