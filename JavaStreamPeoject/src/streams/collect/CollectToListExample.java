package streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

enum Gender{ 
	MALE,
	FEMALE;
}
class Student{
	String name;
	int age;
	Gender gender;
	public Student(String name,int age,Gender gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
}
public class CollectToListExample {
	
	public static void main(String[] args) {
		Student s1=new Student("최형준",25,Gender.MALE);
		Student s2=new Student("최평준",27,Gender.MALE);
		Student s3=new Student("최팡준",29,Gender.FEMALE);
		List<Student> students=Arrays.asList(s1,s2,s3);
		
		Collector<Student,? ,List<Student>>collector=Collectors.toList();
		students.stream().filter(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				// TODO Auto-generated method stub
				return t.age>25;
			}
		}).collect(collector)
		.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				// TODO Auto-generated method stub
				System.out.println(t.name+","+t.age);
			}
			
		});
		
	}
}
