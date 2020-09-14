package streams.intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>list=Employee.employees();
		list.stream().filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.isMale();
			}
		}).peek(s->{
			s.setIncome(s.getIncome()*1.1);
		}).forEach(System.out::println);
		list.stream().filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getDateofBirth().isBefore(LocalDate.of(1993, Month.SEPTEMBER,1));
			}
			
		}).forEach(System.out::println);
		
	}

}
