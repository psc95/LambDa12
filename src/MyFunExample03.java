//매개변수와 리턴 값이 있는 함수형 인터페이스 MyFun03을 활용한 예제
public class MyFunExample03 {
	public static void main(String[] args) {
		
		MyFun03 fi;

		fi = (a,b) ->{
			int result = a + b;
			return result;
		};
		System.out.println("5 + 10 = "+fi.method(5, 10));

		fi = (x,y) -> {return x+y;};
		System.out.println("10 + 10 = "+ fi.method(10, 10));

		fi = (a,b) -> a*b; //return 키워드가 생략
		System.out.println("10 X 5 = "+ fi.method(10, 5));

		/* 문제) 별도의 정적메서드 sum(int a, int b){를 정의해서 덧셈한 결과값을 리턴받아서
		 * 출력하게 하는 람다식 문장을 만들어보자.}
		 */
		
		fi = (a,b) -> sum(a,b);
		System.out.println(" 5 + 5 = "+fi.method(5, 5));
	}
	static int sum(int a, int b){
		int result = a + b;
		return result;
	}
}
