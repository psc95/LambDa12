/* 람다식 코드를 더 줄인 메서드 참조에 관한 실습을 위해서 2개의 인스턴스 메서드와 정적메서드를 정의 한다.
 */
public class Calculator {
	
	public static int staticMethod(int x, int y) {
		return x+y;
	}//정적 메서드
	
	public int instanceMethod(int x, int y) {
		return x+y;
	}//인스턴스 메서드
	
}
