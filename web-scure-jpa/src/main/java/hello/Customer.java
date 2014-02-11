package hello;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Customer implements Serializable {

	private static final long serialVersionUID = 5828672055468787638L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Getter @Setter
	private int accountNumber;
	@Getter @Setter
	private String name;
	
	public Customer() {
	}
	
	public Customer(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Customer %s with account %d", 
				name, accountNumber);
	}
	
	
	
	
}