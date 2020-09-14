package streams.intermediate;

import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		Stream<Integer>stream=Stream.of(1,2,3,4,5);
		stream.flatMap(new Function<Integer,Stream<Integer>>(){
			@Override
			public Stream<Integer> apply(Integer t) {
				return Stream.of(t*2);
			}
			
		}).forEach(System.out::println);
		
		
		OptionalDouble result=Employee.employees().stream().flatMapToDouble(new Function<Employee,DoubleStream>(){

			@Override
			public DoubleStream apply(Employee t) {
				// TODO Auto-generated method stub
				return DoubleStream.of(t.getIncome());
			}
		}).reduce(new DoubleBinaryOperator() {

			@Override
			public double applyAsDouble(double left, double right) {
				// TODO Auto-generated method stub
				System.out.println(left+", "+right);
				return left+right;
			}
			
		});/*.filter(n->n>2000).reduce(new DoubleBinaryOperator() {

			@Override
			public double applyAsDouble(double left, double right) {
				// TODO Auto-generated method stub
				return left<right? left:right;
			}
			
		});*/
		if(result.isPresent())
			System.out.println("result: "+result);
		else
			System.out.println("결과없음");
		Employee.employees().stream().flatMap(new Function<Employee,Stream<String>>(){

			@Override
			public Stream<String> apply(Employee t) {
				// TODO Auto-generated method stub
				return Stream.of(t.getName());
			}
			
		}).findFirst().ifPresent(System.out::println);
		
		Optional<LocalDate>result1=Employee.employees().stream().flatMap(new Function<Employee,Stream<LocalDate>>(){

			@Override
			public Stream<LocalDate> apply(Employee t) {
				// TODO Auto-generated method stub
				return Stream.of(t.getDateofBirth());
			}
			
		}).reduce(new BinaryOperator<LocalDate>() {

			@Override
			public LocalDate apply(LocalDate t, LocalDate u) {
				System.out.println(t+", "+u);
				return t.isBefore(u)?u:t;
			}
			
		});
		System.out.println("min 값"+result1);
	}
}
