import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

//매개값은 있고, 리턴값이 없는 내장 함수형 인터페이스에 관한 실습

public class ConsumerExample {
	public static void main(String[] args) {
		
		Consumer<String> consumer = t -> System.out.println(t+"8");
		//매개값은 있고,리턴값이 없는 함수형 인터페이스로 accept()추상메서드 하나가 정의되어 있다.
		consumer.accept("java ");
		
		BiConsumer<String,String> biConsumer = (t, u) -> System.out.println(t+u);
		//BiConsumer 내장 함수형 인터페이스는 리턴값은 없고, 매개인자값이 2개인 추상메서드를 가진다.
		biConsumer.accept("java ", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java "+d);
		//DoubleConsumer 내장 함수형 인터페이스는 실수 매개값 하나를 가지고,리턴값이 없는 추상메서드를 가진다.
		doubleConsumer.accept(8.0);
	}
}
