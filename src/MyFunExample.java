//매개변수가 없고, 리턴타입이 없는 MyFun 함수형 인터페이스를 활용한 예제

public class MyFunExample{
	public static void main(String[] args) {
		
		MyFun fi;
		fi = ()->{
			String str = "저녁 먹으러 갑시다1.";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("비가 옵니다");};
		fi.method();
		
		fi = () -> System.out.println("자바를 배웁니다."); //실행문장이 한줄인 경우에는 {}를 생략해도 된다.
		fi.method();
	}
}
