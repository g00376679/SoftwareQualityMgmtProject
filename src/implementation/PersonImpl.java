package implementation;

import interfaces.Job;
import interfaces.Person;

public class PersonImpl implements Person {
	private String name = "";
	private int age;
	private Person p;
	private Job job;

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
		return job;
	}

	@Override
	public void setJob(Job j) {
		this.job = j;
	}

	@Override
	public void setAge(int a) {
		if(a<0) {
			
		}else {
			this.age =a;
		}

	}

	@Override
	public void setName(String n) {
		
		if(n.equalsIgnoreCase(null)) {
			name = n;
		}
		else {
			name = n;
		}
	}

	@Override
	public boolean equals(Person obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonImpl other = (PersonImpl) obj;
		if (age != other.age)
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		return true;
	}

	@Override
	public boolean olderThan(Person p) {
		if(p.getAge() < getAge()) {
			return true;
		}else {return false;}
	}

	@Override
	public boolean youngerThan(Person p) {
		if(p.getAge() > getAge()){
			return true;
		}else{return false;
		}
	}

	@Override
	public boolean isAdult() {
		if(this.age > 18) {
			return true;
		}else {return false;}
		
	}

	@Override
	public boolean isColleague(Person p) {
		if(p.getJob().equals("Vice Dean") && this.getJob().equals("Prof.")) {
			return true;
		}else {return false;}

	}

	

	
	
}
