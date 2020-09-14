package streams.collect;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import common.EmpDAO;
import common.Employee;

public class CollectionDataBaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//직원테이블
		//입사일자 기준. 1990년대 입사한 사람들
		//list 컬렉션에 저장.
		
		List<Employee> emp=EmpDAO.getEmplist();
		Stream<Employee>stream=emp.stream();
		Collector<Employee,? ,List<Employee>>collector=Collectors.toList();
		stream.filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				// TODO Auto-generated method stub
				return (t.getHireDate().isAfter(LocalDate.of(1990, Month.JANUARY,1)));
			}
			
		}).filter(new Predicate<Employee>() {
			  
			  @Override 
			  public boolean test(Employee t) { 
			  return t.getHireDate().isBefore(LocalDate.of(2000, Month.JANUARY,1)); 
			  	}
			  
			  
			  })
			 
		.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee t) {
				// TODO Auto-generated method stub
				System.out.println(t.getFirstname()+" "+t.getLastName()+" ,"+t.getHireDate() );
			}
			
		});
		stream=emp.stream();
		
		stream.filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				// TODO Auto-generated method stub
				return t.getJobId().equals("ST_CLERK");
			}
			
		}).collect(collector)
		.forEach(new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		//System.out.println(collector);
	}

}
