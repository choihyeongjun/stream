package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class DistinctExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strAry= {"Hong","Park","Choi","Hong"};
		Stream<String>sStream=Arrays.stream(strAry);
		sStream.distinct().forEach(System.out::println);
	}

}
