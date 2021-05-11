package homework3.Entities;
import homework3.Abstract.Entity;

import java.time.LocalDate;


public class Customer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate DateOfDay;
	private String nationalityId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfDay() {
		return DateOfDay;
	}
	public void setDateOfDay(LocalDate dateOfDay) {
		DateOfDay = dateOfDay;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	

}
