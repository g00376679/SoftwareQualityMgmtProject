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
	private Person per;
	List<Person> person = new ArrayList();
	
	public EmployerImpl(String n) {
		this.name =  n;
	}
	
	public EmployerImpl(Person p , String s , double d) {
		this(s);
		this.per = p;
		this.salary = d;
	}
	

	@Override
	public void hire(Person p, String title, double salary) {
		Employer emp  = new EmployerImpl( p,  title,  salary);
		person.add((Person) emp);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public List<Person> getEmployees() {
		List<Person> p = new ArrayList(Arrays.asList(getEmployeeCount()));
		return p;
	}

	@Override
	public int getEmployeeCount() {
		
		return person.size();
	}

	@Override
	public boolean fire(Person p) {
		
		if(person.contains(p)){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public boolean isEmployed(Person p) {
		if(person.contains(p)){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public Person getHighestPaid() {
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
