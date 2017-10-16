import javax.swing.*;
/*
Program som räknar ut kostnaden för samtal
Alexander Blom
2017/10/16
*/
public class Ovning4_5{
	public static void main(String[] args) {
		double pris = 0;
		String tidS = JOptionPane.showInputDialog(null, "Hur manga minuter ringde du?");
		int tid = Integer.parseInt(tidS);

		int knappNr = JOptionPane.showConfirmDialog(null, "Ringde du pa dagtid?");
			if (knappNr == 0)
				pris = 2.50;
			else if (knappNr == 1)
				pris = 0.55;
			else
				JOptionPane.showMessageDialog(null, "Berakning avbruten.");

			pris = pris * tid + 0.60;

			JOptionPane.showMessageDialog(null, "Samtalet kostade " + pris + " kr.");
	}	
}