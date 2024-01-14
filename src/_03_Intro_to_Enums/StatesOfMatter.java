package _03_Intro_to_Enums;

import javax.swing.JOptionPane;

enum States {
SOLID(0), LIQUID(25.55), GAS(100);
	double celsiusTemp;
	double farenheit;
	private  States (double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
	private void convert(double farenheit) {
	farenheit = (this.celsiusTemp*9/5)+32;	
	}
	//finished step 9
}

public class StatesOfMatter {

	
	public static void main(String[] args) {
	
States[] som = States.values();	
String query = JOptionPane.showInputDialog("Enter a state of matter");
for (int i = 0; i < som.length; i++) {
	System.out.println(som[i].toString() + " " + query);
	if(som[i].toString().equals(query)) {
		System.out.println("Your elemental number is: " + som[i].ordinal()); 
		
	}
}

}
}

