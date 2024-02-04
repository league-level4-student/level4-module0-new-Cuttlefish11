package _03_Intro_to_Enums;

import java.util.Random;

import javax.swing.JOptionPane;

enum States {
SOLID(0), LIQUID(25.55), GAS(100);
	double celsiusTemp;
	double farenheit;

	private  States (double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
		if (farenheit==0.0) {
			farenheit = (this.celsiusTemp*9/5)+32;	
			}
	}
	
	//finished step 9
	
}

public class StatesOfMatter {

	
	public static void main(String[] args) {
		States SoM;
States[] som = States.values();	
String query = JOptionPane.showInputDialog("Enter a state of matter");
for (int i = 0; i < som.length; i++) {
	System.out.println(som[i].toString() + " " + query);
	if(som[i].toString().equals(query)) {
		System.out.println("Your elemental number is: " + som[i].ordinal()); 
		
	}
}

if (query.equals("SOLID")) {
SoM = States.SOLID; 	
System.out.println("F: "+ SoM.farenheit + " C: " + SoM.celsiusTemp);
switch (SoM) {
case SOLID:
	System.out.println("Ice Cream");
	break;

default:
	break;
} 
}
else if (query.equals("LIQUID")) {
SoM = States.LIQUID;
System.out.println("F: "+ SoM.farenheit + " C: " + SoM.celsiusTemp);
switch (SoM) {
case LIQUID:
	System.out.println("Root Beer");
	break;

default:
	break;
} 
}
else if (query.equals("GAS")) {
SoM = States.GAS; 	
System.out.println("F: "+ SoM.farenheit + " C: " + SoM.celsiusTemp);
switch (SoM) {
case GAS:
	System.out.println("Tamale");
	break;

default:
	break;
} 
}

}
}

