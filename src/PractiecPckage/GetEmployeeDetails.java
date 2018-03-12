package PractiecPckage;



public class GetEmployeeDetails {

	public static void main(String[] args) {
	
		Employee e;
		
		SetEmployeeValue s = new SetEmployeeValue();
		e = s.insertEmployee();
		System.out.println(e.geteid());
		System.out.println(e.empDetails);
		

	}

}
