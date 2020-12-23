package implementation;

import interfaces.Job;
import interfaces.Person;

public class JobImpl implements Job {

	private String title ;
	private double salary;
	private String company;
	private Person per;
	private Job job;
	
	public JobImpl(String t, int s, String c) {
		this.title = t;
		this.salary = s;
		this.company = c;
		
	}

	@Override
	public double getSalary() {
		
		return salary;
	}

	@Override
	public String getTitle() {
		
		return title;
	}

	@Override
	public void setSalary(double s) {
		//this.salary = s;
		if(s<=0) {
			
		}else {
			this.salary=s;
		}

	}

	@Override
	public void setTitle(String t) {
		if(t.isBlank()) {
			
		}else {
			this.title =t;
		}

	}

	@Override
	public String getCompany() {
		
		return company;
	}

	@Override
	public void setCompany(String c) {
		if(c.isBlank()) {
			
		}else {
			this.company =c;
		}
		
			
	}

	@Override
	public boolean equals(Job obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobImpl other = (JobImpl) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (per == null) {
			if (other.per != null)
				return false;
		} else if (!per.equals(other.per))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
		
	}
	

	
	

}
