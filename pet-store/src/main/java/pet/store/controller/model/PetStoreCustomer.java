package pet.store.controller.model;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pet.store.entity.Customer; 

@Data
@NoArgsConstructor
public class PetStoreCustomer {
  private Long customerId;
  private String customerFirstName;
  private String customerLastName;
  private String customerEmail;
  
  public PetStoreCustomer(Customer customer) {
	customerId = customer.getCustomerId();
	customerFirstName = customer.getCustomerFirstName();
	customerLastName = customer.getCustomerLastName();
	customerEmail = customer.getCustomerEmail();
  }
}
