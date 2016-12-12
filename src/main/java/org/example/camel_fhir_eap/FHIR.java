package org.example.camel_fhir_eap;

public class FHIR {
	
	private String status;

	@Override
	public String toString() {
		return "FHIR [status=" + status + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FHIR() {
		// TODO Auto-generated constructor stub
	}

}
