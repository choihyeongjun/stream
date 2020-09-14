package streams;

import java.util.*;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		//컬렉션: 외부 반복자
		List<String> users=Arrays.asList("나","달이","문선","최형");
		Iterator<String> iter=users.iterator();
		while(iter.hasNext()) {
			String str=iter.next();
			System.out.println(str.toString());
		}
		
		
		
		//스트림: 내부 반복자
		Stream<String>streams=users.stream();
		streams.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t.toString());
			}
			
		});
		
	}
}
