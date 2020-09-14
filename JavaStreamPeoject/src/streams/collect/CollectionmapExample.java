package streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("최형준",25,Gender.MALE);
		Student s2=new Student("최평준",27,Gender.MALE);
		Student s3=new Student("최팡준",29,Gender.FEMALE);
		List<Student> students=Arrays.asList(s1,s2,s3);
		
		Map<String,Integer>map=students.stream().filter(s->s.age>20)
				.collect(Collectors
				.toMap(new Function<Student,String>(){

					@Override
					public String apply(Student t) {
						// TODO Auto-generated method stub
						return t.name;
					}
				},new Function<Student,Integer>(){
					@Override
					public Integer apply(Student t) {
						// TODO Auto-generated method stub
						return t.age;
					}
					
				}));
		Set<String>keys=map.keySet();
		for(String s:keys) {
			System.out.println("이름:"+s+","+"나이"+map.get(s));
		}
	}

}
