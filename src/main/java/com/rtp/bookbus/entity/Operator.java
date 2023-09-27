package com.rtp.bookbus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operators")
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operator_id")
    private int operatorId;

    @Column(name = "operator_name", nullable = false)
    private String operatorName;

    @Column(name = "contact_number", nullable = false)
    private String contactNumber;

    @Column(name = "email", nullable = false)
    private String email;

    public Operator() {
    	
    }

	public Operator(String operatorName, String contactNumber, String email) {
		
		this.operatorName = operatorName;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Operator [operatorId=" + operatorId + ", operatorName=" + operatorName + ", contactNumber="
				+ contactNumber + ", email=" + email + "]";
	}    
}

