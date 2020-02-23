package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empAcc;

}
