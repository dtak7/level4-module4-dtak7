package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	void setItemsReceived(int i) {
		if(i<=0) {
			i=0;
		}
		this.itemsReceived=i;
	}
	int getItemsRecived() {
		return this.itemsReceived;
	}
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	void setDegreesTurned(float f) {
		if(f>360) {
			f=0;
		}
		else if(f<0) {
			f=360;
		}
		 this.degreesTurned=f;
	}
	float getDegreesTurned() {
		return this.degreesTurned;
	}
	private String nomenclature = ""; //must not be set to a blank string. Blank Strings get set to a space
	void setNomenclature(String s) {
		if(s.equals("")) {
			s=" ";
		}
		this.nomenclature=s;
	}
	String getNomenclature() {
		return this.nomenclature;
	}
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	void setMemberObject(Object o) {
		if(o instanceof String) {
			o = new Object();
			this.memberObj=o;
		}
	}
	Object getMemberObject() {
		return this.memberObj;
	}
	
	
}
