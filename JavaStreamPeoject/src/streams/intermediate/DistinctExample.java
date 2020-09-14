package streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class DistinctExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strAry= {"Hong","Park","Choi","Hong"};
		Stream<String>sStream=Arrays.stream(strAry);
		//sStream.sorted().peek(System.out::println).distinct()
		//.forEach(System.out::println);
		sStream=Arrays.stream(strAry);
		sStream.sorted().forEach(System.out::println);
		
		
		
		Student[] students= {new Student("존귀달이",20),
				new Student("존못형준",19),
				new Student("평범문선애",22),
				new Student("지금잠오는 문선애",21),
				new Student("지금잠오는 문선애",21),
				new Student("지금잠오는 문선애",23)};
		
		Stream<Student>tStream=Arrays.stream(students);
		//tStream.sorted().distinct().forEach(System.out::println);
		tStream.sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.score-o1.score;
			}
			
		}).forEach(System.out::println);
	}

}
