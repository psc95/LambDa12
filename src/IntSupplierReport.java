import java.util.function.IntSupplier;

public class IntSupplierReport {
	public static void main(String[] args) {
		
		/* 과제물 겸 문제) IntSupplier 함수형 인터페이스의 추상메서드 getAsInt()는 매개값이 없고,정수 숫자로
		 *  반환값만 가진다. 이것과 Math.random()정적메서드를 활용해서 임의의 정해지지 않는 수를 난수라고 하는데
		 *  정수 난수를 리턴받아서 주사위의 눈의 수를 구하는 프로그램을 만들어 보자.물론 오늘 배운 람다식 타켓 타입 문법을 활용해야 한다.
		 *  결국은 1~6사이의 임의의 정해지지 않은 정수 숫자 난수를 반환 받으면 그것이 곧 임의의  주사위의 눈의 수가 된다.
		 */
		IntSupplier diceResult = () -> {
			int result = (int)(Math.random()*6)+1;
			/* random()정적메서드 기능은 0.0이상 1.0미만 실수 숫자 난수가 발생-> *6하면 0.0이상 6.0미만 사이의
			 * 실수 숫자 난수 발생-> (int)로 형변환하면 반올림 하지 않고 소수점 이하는 버리고 정수 숫자만 구하면
			 * 0이상 6미만 사이의 정수 숫자 난수를 구함 -> +1을 하면 1이상 7미만 즉 1부터 6사이의 정수 숫자 난수를 구함.
			 */
			return result;
		};
		
		int result = diceResult.getAsInt();
		System.out.println("임의의 주사위 눈의 수 = "+result);
	}
}
