//람다식으로 멀티스레드 프로그램 구현(하나의 프로그램 내에서 동시 작업이 이루어지는 것을 말한다.)

public class RunnableExample {
	public static void main(String[] args) {
		
		Runnable runnable = () ->{
			for(int i = 10; i >= 1; i--) {
				System.out.println(i);
			}
		};//스레드 람다식 타켓 타입으로 사용
		
		Thread th = new Thread(runnable);
		th.start();//스레드 시작
		
		Thread th1 = new Thread(() ->{
			for(int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		});//람다식으로 스레드 구현
		th1.start();//멀티스레드 시작
	}
}
