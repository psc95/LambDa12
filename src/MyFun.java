/* 매개변수와 리턴타입이 없는 함수형 인터페이스 정의
 * 
 * @FunctionalInterface 특징)
 *  1.자바 8부터는 @FunctionalInterface를 사용해서 함수형 인터페이스를 정의할 수 있다.
 *  2.함수형 인터페이스에는 오직 추상메서드가 하나만 올수 있고, 하나의 추상메서드는 꼭 정의해야 한다.
 *  3.함수형 인터페이스는 람다식 타켓 타입으로 사용하기 위한 인터페이스 이다. 즉 함수형 인터페이스는 람다식을 위한 인터페이스 이다.
 *  추상메서드를 둘 이상 정의하면 컴파일 에러가 발생한다.
 */

@FunctionalInterface
public interface MyFun {
	abstract public void method();
	//abstract가 생략된 추상메서드
}
