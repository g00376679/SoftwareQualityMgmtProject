package implementation;

import interfaces.Job;
import interfaces.Person;

public class PersonImpl implements Person {
	private String name;
	private int age;

	public PersonImpl(String n, int a) {
		this.name=n;
		this.age=a;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public Job getJob() {
		return null;
	}

	@Override
	public void setJob(Job j) {
	}

	@Override
	public void setAge(int a) {
		age = a;

	}

	@Override
	public void setName(String n) {
		name =n;
	}

	@Override
	public boolean equals(Person p) {
		return false;
	}

	@Override
	public boolean olderThan(Person p) {
		return false;
	}

	@Override
	public boolean youngerThan(Person p) {
		return false;
	}

	@Override
	public boolean isAdult() {
		Person p = new PersonImpl(name, age);
		if(p.getAge()==18) {
			return true;
		}else 
		{
			return false;
		}
		
	}

	@Override
	public boolean isColleague(Person p) {
		return false;
	}

}
