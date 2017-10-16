import javax.swing.*;
/*
*/
public class Ovning4_6{
	public static void main(String[] args) {
		String pNummer1 = JOptionPane.showInputDialog(null, "Skriv ditt personnummer i 'YYMMDD' form.");
		pNummer1 = pNummer1.substring(2);
		
		String pNummer2 = JOptionPane.showInputDialog(null, "Skriv dit personnummer i 'YYMMDD' form.");
		pNummer2 = pNummer2.substring(2);

		if (pNummer1.equals(pNummer2))
			JOptionPane.showMessageDialog(null, "Ni fyller ar pa samma dag.");
		else
			JOptionPane.showMessageDialog(null, "Ni fyller inte ar pa samma dag.");

	}
}