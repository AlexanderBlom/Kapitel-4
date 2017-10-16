import javax.swing.*;
/*
Program som bestämmer om måtten på ett brev är giltiga
Alexander Blom
2017/10/16
*/

public class Ovning4_4{
	public static void main(String[] args) {
		String breddS = JOptionPane.showInputDialog(null, "Skriv bredden pa brevet i mm");
		int bredd = Integer.parseInt(breddS);

		String langdS = JOptionPane.showInputDialog(null, "Skriv langden pa brevet i mm");
		int langd = Integer.parseInt(langdS);

		String tjockS = JOptionPane.showInputDialog(null, "Skriv tjocklecken pa ditt brev i mm");
		int tjock = Integer.parseInt(tjockS);

		if (langd >= 140 && langd <= 600 && tjock <= 100 && bredd >= 90 && langd + tjock + bredd <= 900)
			JOptionPane.showMessageDialog(null, "Matten OK");
		else
			JOptionPane.showMessageDialog(null, "Felaktiga matt.");
	}
}