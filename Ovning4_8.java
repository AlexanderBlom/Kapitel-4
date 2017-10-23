import javax.swing.*;
/*
Program som bestämmer om personnummer tillhör en man eller kvinna.
Alexander Blom
2017/10/23
*/
public class Ovning4_8{
	public static void main(String[] args) {
		
		String pNummer = JOptionPane.showInputDialog(null, "Vad ar ditt personnummer? (yymmddxxxx)");
		pNummer = pNummer.substring(8, 9);

		switch(pNummer) {
			case "1": case "3": case "5": case "7": case "9":
				JOptionPane.showMessageDialog(null, "Du ar en man.");
				break;
			case "0": case "2": case "4": case "6": case "8":
				JOptionPane.showMessageDialog(null, "Du ar en kvinna.");
				break;
		}
	}
}