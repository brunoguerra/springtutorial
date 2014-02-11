package hello;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Customer implements Serializable {

	private static final long serialVersionUID = 5828672055468787638L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private int accountNumber;
	
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
