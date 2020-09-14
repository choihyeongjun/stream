package streams.intermediate;

import java.util.Objects;

public class Student implements Comparable<Student>{
	String name;
	int score;
	
	public Student(String name,int score) {
		this.name=name;
		this.score=score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	public int hashCode() {
		//return this.score;
		return Objects.hashCode(this.name)+this.score;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student that=(Student) obj;
			return this.name==that.name &&this.score==that.score;
		}
		else
			return false;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.score-o.score;//음수값 오름차순, 양수값 내림차순
	}
	
	
}
