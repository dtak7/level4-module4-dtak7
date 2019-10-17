package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	// doctors
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();

	ArrayList<Doctor> getDoctors() {
		return this.doctors;
	}

	void addDoctor(Doctor d) {
		doctors.add(d);
	}

	// patients
	ArrayList<Patient> patients = new ArrayList<Patient>();

	ArrayList<Patient> getPatients() {
		return this.patients;
	}

	void addPatient(Patient p) {
		patients.add(p);
	}

	void assignPatientsToDoctors() throws DoctorFullException {
		for (int i = 0; i < doctors.size(); i++) {
			for (int j = 0; j < 3; j++) {
				if (patients.size() == 0) {
					System.out.println("run");
					System.out.println(doctors.get(0).patientList);
					return;
				}
				doctors.get(i).assignPatient(patients.get(0));
				patients.remove(0);
			}
		}
	}
}