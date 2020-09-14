package streams.intermediate;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import common.EmpDAO;
import common.Employee;


public class ReduceExample {
	public static void main(String[] args) {
		List<Employee> empList=EmpDAO.getEmplist();
		Stream<Employee>stream=empList.stream();
		OptionalDouble avg=stream.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				// TODO Auto-generated method stub
				return t.getJobId().equals("IT_PROG");
			}
			
		}).flatMapToInt(new Function<Employee,IntStream>(){

			@Override
			public IntStream apply(Employee t) {
				// TODO Auto-generated method stub
				return IntStream.of(t.getSalary());
			}
			
		}).average();
		System.out.println("평균급여는 :" +avg.getAsDouble());
	}
}
