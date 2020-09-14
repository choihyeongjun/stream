package streams;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntExample {

	public static void main(String[] args) {
		//1~10까지 정수형
		//배열로 부터 스트림생성
		//스트림 생성하고 filter통해
		//최종집계처리는 sum
		
		IntStream.range(1,10).forEach(s->System.out.println(s));
		System.out.println("--rangeclosed");
		IntStream.rangeClosed(1,10).filter(n->n>5)
		.forEach(System.out::println);
		
		
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		IntStream stream=Arrays.stream(array);
		int sum=stream.filter(new IntPredicate() {

			@Override
			public boolean test(int value) {
			
				return value%2==0;
			}
			
		}).sum();
			
		
		System.out.println(sum);
		//System.out.println("cnt="+cnt);
	}
		

}
