package project.dto;

import java.math.BigInteger;


public class SpecialtyDTO {

	// 专业id
	private BigInteger id;
	
	// 专业
	private String specialty;
	
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	
}
