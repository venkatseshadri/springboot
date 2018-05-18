package org.venkattest.model;

import org.springframework.stereotype.Component;

@Component
public class Employee extends UtilizationImpl {

	public final int DEFAULT_EMPLOYEE_ID = 1000;
	public final String DEFAULT_LAST_NAME = "Doe";
	public final String DEFAULT_FIRST_NAME = "John";
	
	public Employee() {
		super(DEFAULT_CAPACITY_HOURS, DEFAULT_CREDITED_HOURS, DEFAULT_START_DATE, DEFAULT_END_DATE);
		this._lastName = DEFAULT_LAST_NAME;
		this._firstName = DEFAULT_FIRST_NAME;
		this._id = DEFAULT_EMPLOYEE_ID;
	}
	
	public Employee(String _lastName, String _firstName, int _id) {
		super(DEFAULT_CAPACITY_HOURS, DEFAULT_CREDITED_HOURS, DEFAULT_START_DATE, DEFAULT_END_DATE);
		this._lastName = _lastName;
		this._firstName = _firstName;
		this._id = _id;
	}
	
	public void initEmployee(double _creditedHours, double _capacityHours) {
		this._creditedHours = _creditedHours;
		this._capacityHours = _capacityHours;
	}

	String _lastName;
	String _firstName;
	int _id;

	public String get_lastName() {
		return _lastName;
	}

	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}

	public String get_firstName() {
		return _firstName;
	}

	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	@Override
	public double getUtilization() {
		return _creditedHours/_capacityHours;
	}
	
}
