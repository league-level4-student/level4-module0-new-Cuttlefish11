package _03_Intro_to_Enums;

import javax.swing.JOptionPane;

public enum StatesOfMatter {
SOLID, LIQUID, GAS;

}
//class problems
public class classy{
public void StatesOfMatter(){
	int celsiusTemp;
StatesOfMatter[] som = StatesOfMatter.values();	
String query = JOptionPane.showInputDialog("Enter a state of matter");
for (int i = 0; i < som.length; i++) {
	if(som[i].toString()==query) {
		System.out.println(som[i].ordinal()); 
		
	}
	
}


}
}

