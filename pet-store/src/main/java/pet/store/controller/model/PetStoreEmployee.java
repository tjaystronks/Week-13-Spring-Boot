package pet.store.controller.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pet.store.entity.Employee;

@Data
@NoArgsConstructor
public class PetStoreEmployee {
  private Long employeeId;
  private String employeeFirstName;
  private String employeeLastName;
  private String employeePhone;
  private String employeeJobTitle;
  
  public PetStoreEmployee(Employee employee) {
	employeeId = employee.getEmployeeId();
	employeeFirstName = employee.getEmployeeFistName();
	employeeLastName = employee.getEmployeeLastName();
	employeePhone = employee.getEmployeePhone();
	employeeJobTitle = employee.getEmployeeJobTitle();
  }
 }

