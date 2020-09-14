package streams.collect;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import common.EmpDAO;
import common.Employee;
public class CollectionDataBaseGroupby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//직무별 -사원
		List<Employee> emp=EmpDAO.getEmplist();
		
		Map<String,List<Employee>> eMap=
				emp.stream().collect(Collectors.groupingBy(new Function<Employee,String>(){

					@Override
					public String apply(Employee t) {
						// TODO Auto-generated method stub
						return t.getJobId();
					}
					
				},Collectors.toList()));
		
		
		Set<String> set=eMap.keySet();
		for(String s: set) {
			System.out.println(s);
			List<Employee> list=eMap.get(s);
			for(Employee e: list) {
				System.out.println("이름: "+e.getLastName()+ "연봉:"+e.getSalary());
			}
		}
		
		
	}

}
