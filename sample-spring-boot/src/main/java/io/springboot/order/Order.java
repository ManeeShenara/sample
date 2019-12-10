package io.springboot.order;

import javax.persistence.*;

import io.springboot.customer.Customer;

import java.io.Serializable;

@Entity
@Table(name="order")
public class Order implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String oid;
	private String oname;
	private String odescription;
	
	@ManyToOne
	private Customer customer;



	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getOdescription() {
		return odescription;
	}

	public void setOdescription(String odescription) {
		this.odescription = odescription;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
