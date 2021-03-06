package Stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> System.out.println(t + " 8");		
		consumer.accept("java");
		
		BiConsumer<String, String> biCon = (t, u) -> System.out.println(t +" " +u);
		biCon.accept("java", "8");
	}
}
