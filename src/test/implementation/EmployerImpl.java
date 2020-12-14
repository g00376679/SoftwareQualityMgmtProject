package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interfaces.Employer;
import interfaces.Person;

public class EmployerImpl implements Employer {

	private String name;
	private String title;
	private double salary;
	List<Person> person = new ArrayList();
	
	public EmployerImpl(String n) {
		
	}

	@Override
	public void hire(Person p, String title, double salary) {
		
		
	}

	@Override
	public List<Person> getEmployees() {
		int employeeCount= getEmployeeCount();
		List<Person> p = new ArrayList(Arrays.asList(employeeCount));
		return p;
	}

	@Override
	public int getEmployeeCount() {
		
		return person.size();
	}

	@Override
	public boolean fire(Person p) {
		
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmployed(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person getHighestPaid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getLowestPaid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getStaffCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCountOf(String title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Person> getAll(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
