
package common.excel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import common.EmpDAO;
import common.Employee;

public class ExcelExample {
	public static void main(String[] args) {
		ExmployeeExcelWriter writer = new ExmployeeExcelWriter();
		List<Employee> list = EmpDAO.getEmplist();
		List<Employee> list2 = new ArrayList();

		list.stream().filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}

		}).forEach(new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
			list2.add(t);
				
			}

		});
//		System.out.println(list2.);
	//	list.stream().forEach(System.out::println);
		//list2.stream().forEach(System.out::println);
		
		writer.xlsWriter(list2);
		System.out.println("엑셀완료");
	}
}
