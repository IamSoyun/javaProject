package Stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class AsDoubleStreamExample {
	public static void main(String[] args) {
		int[] intAry = {1, 2, 3, 4, 5};
		IntStream is = Arrays.stream(intAry);
		
		is.forEach(new IntConsumer() { //IntStream

			@Override
			public void accept(int value) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		is.asDoubleStream() //DoubleStream
			.forEach(new DoubleConsumer() {

				@Override
				public void accept(double value) {
					// TODO Auto-generated method stub
					
				}
				
			});
		
		is.boxed() //Stream<T>
			.forEach(new Consumer<Integer>() {

				@Override
				public void accept(Integer t) {
					// TODO Auto-generated method stub
					
				}
				
			});
		
	}
}
