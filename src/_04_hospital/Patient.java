package _04_hospital;

public class Patient {
	boolean hasPulseBeenChecked=false;
	void checkPulse() {
		hasPulseBeenChecked=true;
	}
	boolean feelsCaredFor() {
		if(hasPulseBeenChecked) {
			return true;
		}
		return false;
	}
}
