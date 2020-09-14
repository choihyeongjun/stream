package streams;

import java.util.Arrays;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class DoubleStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] dAry= {2.3,4.5,8.3,5.5,4.6};
		
		DoubleStream dstream=Arrays.stream(dAry);
		double sum=dstream.filter(new DoublePredicate() {

			@Override
			public boolean test(double value) {
				
				return value<5;
			}
			
		}).peek(new DoubleConsumer() {

			@Override
			public void accept(double value) {
				// TODO Auto-generated method stub
				System.out.println(value);
			}
			
		}).sum();
		System.out.println(sum);
		
		LongStream lstream=Arrays.stream(new long[] {10,29,38});
		IntStream istream=Arrays.stream(new int[] {1,2,3});
		DoubleStream ddstream=Arrays.stream(new double[] {1.1,2,2});
		Stream<Integer> intStream;
		
		
	}

}
