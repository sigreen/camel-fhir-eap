package org.example.camel_fhir_eap;

public class FHIR {

	private String patientId;
	private String componentCode;
	private String componentDisplay;
	private String valueQtyValue;
	private String valueQtyUnit;
	
	public String getPatientId() {
		return patientId;
	}



	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}



	public String getComponentCode() {
		return componentCode;
	}



	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}



	public String getComponentDisplay() {
		return componentDisplay;
	}



	public void setComponentDisplay(String componentDisplay) {
		this.componentDisplay = componentDisplay;
	}



	public String getValueQtyValue() {
		return valueQtyValue;
	}



	public void setValueQtyValue(String valueQtyValue) {
		this.valueQtyValue = valueQtyValue;
	}



	public String getValueQtyUnit() {
		return valueQtyUnit;
	}



	public void setValueQtyUnit(String valueQtyUnit) {
		this.valueQtyUnit = valueQtyUnit;
	}


	@Override
	public String toString() {
		return "FHIR [patientId=" + patientId + ", componentCode=" + componentCode + ", componentDisplay="
				+ componentDisplay + ", valueQtyValue=" + valueQtyValue + ", valueQtyUnit=" + valueQtyUnit + "]";
	}



	public FHIR() {
		// TODO Auto-generated constructor stub
	}

}
