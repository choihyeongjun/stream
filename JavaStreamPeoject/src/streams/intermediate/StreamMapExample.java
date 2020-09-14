package streams.intermediate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import common.EmpDAO;
import common.Employee;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<common.Employee> employees = EmpDAO.getEmplist();

		LocalDate date = LocalDate.of(2020, 5, 1);
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));// 데이트타입->문자열
		LocalDate.parse("2010-05-05", DateTimeFormatter.ISO_DATE);// 문자열->데이트

		Stream<common.Employee> stream = employees.stream();
	

		stream.filter(new Predicate<common.Employee>() {

			@Override
			public boolean test(Employee t) {
				// TODO Auto-generated method stub
				return t.getHireDate().getYear()>1991 ;
			}

		}).forEach(new Consumer<common.Employee>() {

					@Override
					public void accept(Employee t) {
						// TODO Auto-generated method stub
						System.out.println(t);
					}

				});
		
		
		/*.reduce(new BinaryOperator<common.Employee>() {

			@Override
			public Employee apply(Employee t, Employee u) {
				// TODO Auto-generated method stub
				return t.getSalary()<u.getSalary()?u:t;
			}
			
		});*/
		//System.out.println(result);
		

	}

}
