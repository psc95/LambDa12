
public class UsingThisExample {
	public static void main(String[] args) {
		
		/* 문제)UsingThis외부 클래스 객체 생성, 외부 클래스 안의 Inner 내부 클래스 객체를 생성해서
		 *  m()메서드를 호출하는 과정을 만들어 보자.
		 */
		UsingThis ut = new UsingThis();//외부클래스 객체 ut를 생성
		UsingThis.Inner inner = ut.new Inner();//내부클래스 객체 inner생성
		inner.m();
	}
}
