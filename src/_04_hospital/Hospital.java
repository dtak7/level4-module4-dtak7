package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	//doctors
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Doctor> getDoctors() {
		return this.doctors;
	}
	 void addDoctor(Doctor d) {
		doctors.add(d);
	}
	 //patients
	 ArrayList<Patient> patients = new ArrayList<Patient>();
	 ArrayList<Patient> getPatients(){
		 return this.patients;
	 }
	 void addPatient(Patient p) {
		 patients.add(p);
	 }
}
