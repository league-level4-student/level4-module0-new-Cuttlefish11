package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */
	private Object memberObj;
	private String nomenclature;
	private double degreesTurned;
	private int itemsReceived;

	public void setItemsReceived(int randomPositiveNum) {
		// TODO Auto-generated method stub
		itemsReceived=randomPositiveNum;
	}

	public Integer getItemsReceived() {
		// TODO Auto-generated method stub
		if (itemsReceived > 0) {
		return itemsReceived;
		}
		else {
			return 0;
		}
	}
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	

	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	public void setDegreesTurned(double randomPositiveNum) {
		degreesTurned = randomPositiveNum;
	}

	public Double getDegreesTurned() {
		// TODO Auto-generated method stub
		if (degreesTurned >= 0.0 && degreesTurned <= 360.0) {
			return degreesTurned;	
		}
		else if (degreesTurned < 0.0){
			return 0.0;
		}
		else if (degreesTurned > 360.0) {
			return 360.0;
		}
		else {
		return 66.6;	
		}
		
	}
	


	public void setNomenclature(String randomString) {
		nomenclature =randomString;
	}

	public Object getNomenclature() {
		// TODO Auto-generated method stub
		if (nomenclature != "") {
		return nomenclature;
		}
		else {
			return " ";
		} 
	}
	
	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	

	
	public void setMemberObj(Object randomObject) {
		memberObj = randomObject;
	}

	public Object getMemberObj() {
		// TODO Auto-generated method stub
		if (memberObj instanceof String) {
			return false;	
		}
		else {
			return memberObj;
		}
	}

}
