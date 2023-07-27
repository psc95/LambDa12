import java.util.function.Function;

//생성자 참조에 관한 실습
public class ConstructorExample {
	public static void main(String[] args) {
		
		Function<Integer,Member2> function01 = Member2::new;//생성자 참조
		//Integer 타입으로 입력한 것을 Member2타입을 변환해서 반환한다.
		Member2 member01 = function01.apply(10);//추상메서드의 매개변수 개수와 타입을 가진 생성자를 호출
		
	}
}
