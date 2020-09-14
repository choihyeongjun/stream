package streams.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import streams.intermediate.Student;
public class CollectionExample {
	public static void main(String[] args) {
		
		
		Set<String> setStr=new HashSet<>();
		Iterator<String>iter=setStr.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		List<Student> students=new ArrayList<>();
		students.add(new Student("최형준",80));
		students.add(new Student("달이",1000));
		/*
		 * for(Student s: students) { System.out.println(s);
		 * 
		 * }
		 */
		List<Student> studentw=new ArrayList<>();
		studentw.add(new Student("김다희",80));
		studentw.add(new Student("이광순",100));
		
		
		List<Student> studentr=new ArrayList<>();
		studentr.add(new Student("달달이",10));
		studentr.add(new Student("개복치",20));
		
		Map<String,Integer>map =new HashMap<>();
		map.put("문선애", 25);
		map.put("복치복치개복치",26);
		
		/*
		 * Set<String> key=map.keySet(); Iterator<String> itr=key.iterator();
		 * while(itr.hasNext()) { String k=itr.next();//key 값을 가지고
		 * System.out.println(map.get(k));//value 값을 가지고 }
		 */
		
		
		Map<String,List<Student>> stMap=new HashMap<>();
		stMap.put("남자",students);
		stMap.put("여자", studentw);
		stMap.put("재평가",studentr);
		
		Set<String> setk=stMap.keySet();
		for(String s: setk) {
			System.out.println(s);
			List<Student> valueList=stMap.get(s);
			for(Student st:valueList) {
				System.out.println(st);
			}
		}
		
	}
}
