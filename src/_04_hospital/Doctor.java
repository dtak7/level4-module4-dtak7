package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	//doctors
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	boolean performsSurgery() { 
		return false;  
	}
	boolean makesHouseCalls() {
		return false;
	}
	void doMedicine() {
		for(int i =0; i<patientList.size();i++) {
		patientList.get(i).checkPulse();
		}
	}
	//patients
	
	ArrayList<Patient> getPatients() {
		return this.patientList;
	}
	void assignPatient(Patient p) throws DoctorFullException {
		patientList.add(p);
		if(patientList.size()>3) {
			patientList.remove(p);
			throw new DoctorFullException();
		}
	}
}
